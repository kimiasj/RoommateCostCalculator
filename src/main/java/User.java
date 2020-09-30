import java.util.ArrayList;

public class User {
    String name ;
    private ArrayList<Cost> costs;
    Double owing ;

    User () {
        costs = new ArrayList<Cost>();
    }
    User(String newname){
        name = newname;
    }



    public void addCost (Cost c){

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

    // TODO: print all costs
}
