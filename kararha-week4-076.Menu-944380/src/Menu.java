
import java.util.ArrayList;
import java.util.HashSet;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal){
       this.meals.add(meal);
       HashSet hs=new HashSet();
       hs.addAll(this.meals);
       this.meals.clear();
       this.meals.addAll(hs);
        
    }
    public void printMeals(){
        for(String Meals:this.meals){
            System.out.println(Meals);
        }
    }
    public void clearMenu(){
        (this.meals).clear();
    }
}
