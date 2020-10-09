import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        User kimia = new User("Kimia");
        User sahand = new User("Sahand");

        Cost c1 = new Cost(100.20);
        kimia.addCost(c1);
        c1.category = "food";
        Cost c2 = new Cost(20.40);
        c2.category = "gas";
        kimia.addCost(c2);
        Cost c3 = new Cost(100.20);
        sahand.addCost(c3);
        Cost c4 = new Cost(22.45);
        c3.category = "rent";

        ArrayList<User> newuser = new ArrayList<User>();
        newuser.add(kimia);
        newuser.add(sahand);

        for (int i=0;i<newuser.size();i++){
            newuser.get(i).printCosts();
        }

        // TODO: use array list to have any number of users



    }
    public static double AllCosts(){
        double allCosts = 0.0;
        for (int i=0;i<newuser.size();i++){
            allCosts = newuser.get(i).getCosts() + allCosts;
        }
    }

}

























