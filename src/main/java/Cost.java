import java.util.Date;

public class Cost {
    enum category{
        FOOD, RENT, GAS, POWER, INTERNET
    }
    Double amount;
    String category;// TODO: replace with enum
    User user;
    Date date = new Date();
    Cost(double newamount){
        amount = newamount;

    }

}
