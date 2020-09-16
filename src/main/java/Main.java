public class Main {
    public static void main (String[] args){
        User kimia = new User();
        User sahand = new User();
        kimia.name = "Kimia";
        sahand.name = "Sahand";
        kimia.costs = 100.39;
        kimia.costs = kimia.costs + 100.00;
        kimia.costs = kimia.costs + 59.60;
        sahand.costs = 70.60;
        sahand.costs = sahand.costs + 250.15;
        kimia.AddCost(200.00);
        


        kimia.owing = ((kimia.costs + sahand.costs)/2) - kimia.costs;
        sahand.owing = ((sahand.costs + kimia.costs)/2) - sahand.costs;

        if(kimia.owing > sahand.owing){
            System.out.print(kimia.owing);
            System.out.print(" Owed by Kimia");}
        else

        {System.out.print(sahand.owing);
            System.out.print(" Owed by Sahand");}


    }
}























