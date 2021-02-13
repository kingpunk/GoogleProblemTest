import java.util.ArrayList;

public class Pizza {
  public int pizzaIndex;
  public int totalIngrediant;
  public ArrayList<String> ingrediant = new ArrayList<>();
  public boolean status; //delivered status true if yes false if

  Pizza(int pizzaIndex, int totalIngrediant, ArrayList<String>ingrediant) {
    this.pizzaIndex = pizzaIndex;
    this.totalIngrediant = totalIngrediant;
    this.ingrediant = ingrediant;
    this.status = false; 
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

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
  

}
