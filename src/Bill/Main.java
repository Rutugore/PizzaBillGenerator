package Bill;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------- welcome to PizzaMania ----------------------------");
		System.out.println("which pizza: (1.veg Pizza   2.Non-veg Pizza    3.Delux veg Pizza    4.Delux Non-veg Pizza ===>)");
		Scanner sc=new Scanner(System.in);
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1:
			Pizza vegPizza = new Pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.takeAway();
			vegPizza.getBill();
			break;
			
		case 2:
			Pizza nonvegPizza =new Pizza(false);
			nonvegPizza.addExtraToppings();
			nonvegPizza.addExtraCheese();
			nonvegPizza.takeAway();
			nonvegPizza.getBill();
			break;
		case 3:
		   DeluxPizza veg=new DeluxPizza(true);
		   veg.basePizzaPrice = 550;
		   veg.addExtraToppings();
		   veg.addExtraCheese();
		   veg.takeAway();
		   veg.getBill();
		   break;
		case 4:
			DeluxPizza nonveg=new DeluxPizza(false);
			nonveg.basePizzaPrice=650;
			nonveg.addExtraToppings();
			nonveg.addExtraCheese();
			nonveg.takeAway();
			nonveg.getBill();
			break;
			default :
				System.out.println("Sorry Enter Again !!!!!!!!!!!!!!!");
				return;
		}
		sc.close();
	}

}
