import java.util.ArrayList;

public class Main {
    static ArrayList<User> newuser;
    public static void main (String[] args){
        User kimia = new User("Kimia");
        User sahand = new User("Sahand");
        User matt = new User("Matt");


        Cost c1 = new Cost(10);
        kimia.addCost(c1);
        c1.category = Category.FOOD;
        Cost c2 = new Cost(20);
        c2.category = Category.GAS;
        kimia.addCost(c2);
        Cost c3 = new Cost(10);
        sahand.addCost(c3);
        Cost c4 = new Cost(20);
        c3.category = Category.RENT;
        matt.addCost(c4);
        newuser = new ArrayList<User>();
        newuser.add(kimia);
        newuser.add(sahand);
        newuser.add(matt);

        for (int i=0;i<newuser.size();i++){
            newuser.get(i).printCosts();
        }

        calculateOwing();


    }

    public static void calculateOwing() {
        double allCosts = 0.0;
        for (int i=0;i<newuser.size();i++) {
            allCosts = newuser.get(i).getCosts() + allCosts;
        }

        for (int i=0;i<newuser.size();i++){
            newuser.get(i).owing = (allCosts/newuser.size())-newuser.get(i).getCosts();
            System.out.println(newuser.get(i).owing);
        }
    }


}

























