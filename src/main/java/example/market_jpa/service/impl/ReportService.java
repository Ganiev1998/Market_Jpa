package example.market_jpa.service.impl;

import example.market_jpa.dto.report.income.FullIncomeResDTO;
import example.market_jpa.dto.report.income.FullIncomeResDTONative;
import example.market_jpa.dto.report.income.InComeDTO;
import example.market_jpa.dto.report.income.InComeResDTO;
import example.market_jpa.dto.report.outlay.FullOutlayResDTO;
import example.market_jpa.dto.report.outlay.FullOutlayResDTONative;
import example.market_jpa.dto.report.outlay.OutlayDTO;
import example.market_jpa.dto.report.outlay.OutlayResDTO;
import example.market_jpa.entity.*;
import example.market_jpa.projection.Income;
import example.market_jpa.projection.OutLay;
import example.market_jpa.repository.AcceptDocumentItemRepository;
import example.market_jpa.repository.AcceptDocumentRepository;
import example.market_jpa.repository.CompanyRepository;
import example.market_jpa.repository.SaleDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final AcceptDocumentRepository repository;
    private final CompanyRepository companyRepository;
    private final SaleDocumentRepository s_repository;

    public FullOutlayResDTO outlay(OutlayDTO dto) {
        if (dto.getCompany()!=null) {
            Company company = companyRepository.findByCompanyName(dto.getCompany());
            List<AcceptDocument> docs = repository
                    .findByCompanyAndDateBetweenAndStatus(company, dto.getFrom(), dto.getTo(), DocStatus.DONE);

            List<OutlayResDTO> resDTOS = new ArrayList<>();
            double totalAmount = 0D;
            double apply = 0D;
            for (AcceptDocument doc : docs) {
                apply = 0D;
                for (AcceptDocumentItem documentItem : doc.getDocumentItems()) {
                    apply += documentItem.getComePrice() * documentItem.getCount();
                }
                totalAmount += apply;
                resDTOS.add(OutlayResDTO.builder()
                        .company_name(dto.getCompany())
                        .amount(apply)
                        .date(doc.getDate())
                        .build());
            }
            FullOutlayResDTO resDTO = new FullOutlayResDTO();
            resDTO.setOutlayResDTOS(resDTOS);
            resDTO.setTotalAmount(totalAmount);
            return resDTO;
        } else{
            List<AcceptDocument> documents = repository.findByAndDateBetweenAndStatus(dto.getFrom(), dto.getTo(),DocStatus.DONE);
            List<OutlayResDTO> resDTOS = new ArrayList<>();
            double totalAmount = 0.D;
            for (AcceptDocument doc : documents) {
                double apply = 0D;
                for (AcceptDocumentItem documentItem : doc.getDocumentItems()){
                    apply += documentItem.getComePrice() * documentItem.getCount();
                }
                totalAmount+=apply;
                resDTOS.add(OutlayResDTO.builder()
                    .company_name(doc.getCompany().getCompanyName())
                    .amount(apply)
                    .date(doc.getDate())
                    .build());
            }
            FullOutlayResDTO resDTO = new FullOutlayResDTO();
            resDTO.setOutlayResDTOS(resDTOS);
            resDTO.setTotalAmount(totalAmount);
            return resDTO;
        }
    }
    public FullIncomeResDTO inCome(InComeDTO dto){
        List<SaleDocument> documents = (List<SaleDocument>) s_repository.findByAndDateBetween(dto.getFrom(),dto.getTo());
        double totalAmount = 0D;
        List<InComeResDTO> resDTOS = new ArrayList<>();
        for (SaleDocument document:documents){
            double amount = 0D;
            for (SaleDocumentItem documentItem:document.getDocumentItems()){
                amount+=documentItem.getCount()*documentItem.getPrice();
            }
            totalAmount+=amount;
            resDTOS.add(InComeResDTO.builder()
                    .payType(document.getPayType())
                    .amount(amount)
                    .date(document.getDate())
                    .build());
        }
        return FullIncomeResDTO.builder()
                .dtos(resDTOS)
                .totalAmount(totalAmount)
                .build();
    }
    public FullOutlayResDTONative outlayNative(OutlayDTO dto){
        if (!(dto.getCompany()==null)) {
            FullOutlayResDTONative resDto = new FullOutlayResDTONative();
            List<OutLay> outLay = repository.outlayByCompanyNative(dto.getCompany(),dto.getFrom(),dto.getTo());
            double totalAmount = 0D;
            for (OutLay x : outLay) {
                totalAmount += x.getAmount();
            }
            resDto.setOutlayResDTOS(outLay);
            resDto.setTotalAmount(totalAmount);
            return resDto;
        }else {
            FullOutlayResDTONative resDto = new FullOutlayResDTONative();
            List<OutLay> outLay = repository.outlayByDateNative(dto.getFrom(),dto.getTo());
            double totalAmount = 0D;
            for (OutLay x : outLay) {
                totalAmount += x.getAmount();
            }
            resDto.setOutlayResDTOS(outLay);
            resDto.setTotalAmount(totalAmount);
            return resDto;
        }
    }
    public FullIncomeResDTONative incomeNative(InComeDTO dto){
        List<Income> incomes = s_repository.incomeByDateNative(dto.getFrom(),dto.getTo());
        double totalAmount = 0D;
        for (Income x:incomes){
            totalAmount+=x.getAmount();
        }
        FullIncomeResDTONative resDTONative = new FullIncomeResDTONative();
        resDTONative.setIncomes(incomes);
        resDTONative.setTotalAmount(totalAmount);
        return resDTONative;
    }
}
