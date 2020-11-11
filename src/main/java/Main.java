import java.sql.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<User> newuser;
    public static void main (String[] args){


        for (int i=0;i<newuser.size();i++){
            newuser.get(i).printCosts();
        }
        calculateOwing();
        


    }
    public static void insertUser(User user) throws SQLException , ClassNotFoundException {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/roommatescostcalculator","root","123456");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("insert into users (name) values (\""  +user.name+"\")");
            ResultSet ra;
             while(ra.next())


            con.close();


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

























