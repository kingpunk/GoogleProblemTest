import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;
import team.*;
public class Solution {
  public static void main(String[] args) {
    Pizza[] pizzas;
    TwoPersonTeam[] teamTwo;
    ThreePersonTeam[] teamThree;
    FourPersonTeam[] teamFour;
    Solution testObject = new Solution();
    int ing_index = 4;
    try {
      String line;
      int totalNumberPizza;
      int totalTwoTeam;
      int totalThreeTeam;
      int totalFourTeam;
      int totalNumberIngrediant;

      Scanner scanner = new Scanner(Paths.get("a_example.txt"), StandardCharsets.UTF_8.name());
      line = scanner.useDelimiter("\\A").next();

      String[] splited = line.split("\\s+"); // all the content in splited forms

      //number of pizza
      totalNumberPizza = Integer.parseInt(splited[0]);
      //team divide
      totalTwoTeam = Integer.parseInt(splited[1]); //total two team
      totalThreeTeam = Integer.parseInt(splited[2]); //total number of 3 teams
      totalFourTeam = Integer.parseInt(splited[3]); //total number of 4 team

      pizzas = new Pizza[totalNumberPizza];
      //Creating Objects of Pizza
      //pizza ingredites start at index 4
      //first loop with total number of pizza
      //second loop with ingredian, starts with 4 with still total number of ingrediant.
      for (int i = 0; i < totalNumberPizza; i++) {
        ArrayList<String> ingrediant = new ArrayList<>();
        int ingrediant_length = Integer.parseInt(splited[ing_index]);
        for (int j = 0; j < ingrediant_length; j++) {
          ing_index++;
          ingrediant.add(splited[ing_index]);
        }
        if (ing_index != splited.length) {
          ing_index++;
        }
        pizzas[i] = new Pizza(i, ingrediant.size(), ingrediant);
      }

      testObject.printPizza(pizzas); //testing pizzas array

      //creating teams 

      teamTwo = new TwoPersonTeam[totalTwoTeam];
      teamThree = new ThreePersonTeam[totalThreeTeam];
      teamFour = new FourPersonTeam[totalFourTeam];


      



      scanner.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void printPizza(Pizza[] pizzas) {
    
    for (Pizza pizza : pizzas) {
      System.out.println("Index: "+pizza.getPizzaIndex()+" total inggrediant :"+pizza.getTotalIngrediant()+" all Ingriantds: "+pizza.getIngrediant());
    }
  }


}
