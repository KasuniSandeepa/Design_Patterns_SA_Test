package MCQ;

public class Mocha extends CondimentDecorator{
	
	Beverages beverage;
	
	public Mocha(Beverages beverage) {
		this.beverage = beverage;
	}

	
	String getDescription() {
		return (this.beverage.getDescription() + "\nAdding Mocha");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost();
	}




}
