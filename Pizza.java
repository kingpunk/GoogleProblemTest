import java.util.ArrayList;

public class Pizza {
  public int pizzaIndex;
  public int totalIngrediant;
  public ArrayList<String>ingrediant = new ArrayList<>();

  Pizza(int pizzaIndex, int totalIngrediant, ArrayList<String>ingrediant) {
    this.pizzaIndex = pizzaIndex;
    this.totalIngrediant = totalIngrediant;
    this.ingrediant = ingrediant;
  }

  public ArrayList<String>getIngrediant() {
    return ingrediant;
  }

  public int getPizzaIndex() {
    return pizzaIndex;
  }

  public int getTotalIngrediant() {
    return totalIngrediant;
  }
  

}
