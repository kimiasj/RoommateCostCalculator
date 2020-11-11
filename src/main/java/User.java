import java.util.ArrayList;

public class User {
    String name ;
    private ArrayList<Cost> costs;
    Double owing ;
    int id;


    User(String name){
        this.name = name;
        costs = new ArrayList<Cost>();
    }



    public void addCost (Cost c){
        c.user = this;
        costs.add(c);
    }
    public Double getCosts(){
        Double total = 0.0;
        for(int x=0;x<costs.size();x++)
        {
          total = total + costs.get(x).amount;

        }
        return total;
    }
    public void printCosts(){

        for(int i=0; i<costs.size();i++){
            System.out.println(name+" - "+ costs.get(i).date+ " - " + costs.get(i).category+" - " +costs.get(i).amount); // replace with printCost()
        }
    }


}
