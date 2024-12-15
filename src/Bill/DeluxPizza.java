 package Bill;

public class DeluxPizza extends Pizza{

	public DeluxPizza(Boolean veg) {
		super(veg);
		
	}
	
@Override
public void addExtraCheese()
{
	this.price += extraCheesPrice;
}

@Override
public void addExtraToppings()
{
	this.price += extraToppingPrice;
}

}



