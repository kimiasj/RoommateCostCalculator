import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        User kimia = new User();
        User sahand = new User();
        kimia.name = "Kimia";
        sahand.name = "Sahand";
        Cost c1 = new Cost();
        c1.amount = 100.20;
        kimia.addCost(c1);
        Cost c2 = new Cost();
        c2.amount = 20.40;
        kimia.addCost(c2);
        ArrayList<User> newuser;
        newuser = new ArrayList<User>();
        newuser.add(new User());
        User matt = new User();
        matt.name = "Matt";
        // TODO: initialize all variables in constructor. Example: Cost c2 = new Cost(20.40); User kimia = new User("kimia");


        // TODO: use array list to have any number of users

        kimia.owing = ((kimia.getCosts() + sahand.getCosts())/2) - kimia.getCosts();
        sahand.owing = ((sahand.getCosts() + kimia.getCosts())/2) - sahand.getCosts();

        if(kimia.owing > sahand.owing){
            System.out.print(kimia.owing);
            System.out.print(" Owed by Kimia");}
        else

        {System.out.print(sahand.owing);
            System.out.print(" Owed by Sahand");}

         
    }

}























