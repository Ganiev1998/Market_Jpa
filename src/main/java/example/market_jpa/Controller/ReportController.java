package example.market_jpa.Controller;

import example.market_jpa.dto.report.income.FullIncomeResDTO;
import example.market_jpa.dto.report.income.FullIncomeResDTONative;
import example.market_jpa.dto.report.income.InComeDTO;
import example.market_jpa.dto.report.outlay.FullOutlayResDTO;
import example.market_jpa.dto.report.outlay.FullOutlayResDTONative;
import example.market_jpa.dto.report.outlay.OutlayDTO;
import example.market_jpa.entity.PayType;
import example.market_jpa.projection.Income;
import example.market_jpa.projection.OutLay;
import example.market_jpa.service.impl.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {
    private final ReportService service;
    @GetMapping("/outlay")
    public FullOutlayResDTO outlay(@RequestBody OutlayDTO dto){
        return service.outlay(dto);
    }
    @GetMapping("/income")
    public FullIncomeResDTO inCome(@RequestBody InComeDTO dto){
        return service.inCome(dto);
    }
    @GetMapping("/nativeOut")
    public FullOutlayResDTONative getNative(@RequestBody OutlayDTO dto){
        return service.outlayNative(dto);
    }
    @GetMapping("/nativeIn")
    public FullIncomeResDTONative get(@RequestBody InComeDTO dto){
        return service.incomeNative(dto);
    }
}
