package Bill;

import java.util.Scanner;

public class Pizza {
	protected int price;
	private Boolean veg;
	
	protected int extraCheesPrice=100;
	protected int extraToppingPrice = 150;
	protected int backPackPrice=20;
	
	protected int basePizzaPrice;
	
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeaway=false;
	
	Scanner sc=new Scanner(System.in);
	
	public Pizza(Boolean veg)
	{
	this.veg=veg;
	
	if(this.veg)
	{
		this.price=300;
	}else {
		this.price=400;
	}
	basePizzaPrice = this.price;
	}
	
	public void addExtraCheese()
	{
		System.out.println("Extra cheese(y/n)? =>");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case('y'):
		isExtraCheeseAdded = true;
		this.price +=extraCheesPrice;
		break;
		case('n'):
		isExtraCheeseAdded = false;
		break;
		}
	}
	
	public void addExtraToppings()
	{
		System.out.println("want Extra Topping(y/n)? =>");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case('y'):
		isExtraToppingsAdded = true;
		this.price += extraToppingPrice;
		break;
		case('n'):
		isExtraToppingsAdded = false;
		break;
		}
	}
	
	public void takeAway()
	{
		System.out.println("want TakeAway(y/n)? =>");
		char ch=Character.toLowerCase(sc.next().charAt(0));
		switch(ch)
		{
		case('y'):
		isOptedForTakeaway = true;
		this.price += backPackPrice;
		break;
		
		case('n'):
		isOptedForTakeaway = false;
		break;
		}
	}
	
	public void getBill()
	{
		String bill = "";
		
		System.out.println("Pizza :"+basePizzaPrice);
		if(isExtraCheeseAdded)
		{
			bill += "Extra Cheese :"+extraCheesPrice +"\n";
		}
		if(isExtraToppingsAdded)
		{
			bill += "Extra Topping :"+extraToppingPrice+ "\n";
		}
		if(isOptedForTakeaway)
		{
			bill +="Extra Away:"+backPackPrice+"\n";
		}
		bill += "\nTotal Amount:"+this.price +"\n";
		
		System.out.println(bill);
		System.out.println("\n\n\n Tanks Youn!!!!!!! Visit Again.....");
		System.out.println("-------------------------------------------------------------------------------");
	}

}
