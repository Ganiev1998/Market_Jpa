package example.market_jpa.projection;

import java.util.Date;
import java.util.function.UnaryOperator;

    public interface OutLay {

    String getCompany_name();
    Double getAmount();
    Date getDate();

}
