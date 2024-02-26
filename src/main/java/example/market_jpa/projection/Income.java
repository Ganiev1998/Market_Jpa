package example.market_jpa.projection;

import example.market_jpa.entity.PayType;

import javax.print.DocFlavor;
import java.util.Date;

public interface Income {
    PayType getPay_type();
    double getAmount();
    Date getDate();
}
