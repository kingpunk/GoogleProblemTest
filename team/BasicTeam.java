package team;

import java.util.ArrayList;

public class BasicTeam {
  public boolean pizzaRecived;
  public ArrayList<Integer> pizzaIndex;


  BasicTeam() {
    this.pizzaRecived = false;
    this.pizzaIndex = new ArrayList<Integer>();
  }

  //method to enter the pizza index
  public void enterIndexPizza(int index) {
  this.pizzaIndex.add(index);
  }

public boolean isPizzaRecived() {
	return pizzaRecived;
}

public void setPizzaRecived(boolean pizzaAllRecived) {
	this.pizzaRecived = pizzaAllRecived;
}

public ArrayList<Integer> getPizzaIndex() {
	return pizzaIndex;
}

public void setPizzaIndex(ArrayList<Integer> pizzaIndex) {
	this.pizzaIndex = pizzaIndex;
}

}