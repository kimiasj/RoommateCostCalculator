import java.util.Date;

public class Cost {

    Double amount;
    Category category;// TODO: replace with enum
    User user;
    Date date = new Date();
    Cost(double newamount){
        amount = newamount;

    }

}
enum Category{
    FOOD, RENT, GAS, POWER, INTERNET
}
