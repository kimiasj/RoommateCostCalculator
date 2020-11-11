import java.sql.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<User> newuser = new ArrayList<User> ();
    public static void main (String[] args) throws SQLException, ClassNotFoundException {
        loadUsers();
        loadCosts();


        for (int i=0;i<newuser.size();i++){
            newuser.get(i).printCosts();
        }
        calculateOwing();




    }
    public static void loadCosts() throws SQLException , ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/roommatescostcalculator","root","123456");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from costs ");

        while(rs.next()){
            for (User i:newuser
                 ) {
                if (i.id == rs.getInt(5)){
                    Cost dbcost = new Cost(rs.getInt(1),rs.getDouble(2),Category.valueOf(rs.getString(3)),i,rs.getDate(4));
                    i.addCost(dbcost);
                }

            }


        }
    }
    public static void loadUsers() throws SQLException , ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/roommatescostcalculator","root","123456");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from users ");
        while(rs.next()){
            User dbuser = new User(rs.getString(2),rs.getInt(1));
            newuser.add(dbuser);

        }

            con.close();

    }
    public static void insertUser(User user) throws SQLException , ClassNotFoundException {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/roommatescostcalculator","root","123456");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("insert into users (name) values (\""  +user.name+"\")");


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

























