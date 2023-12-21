package MCQ;

public class Whip  extends CondimentDecorator{
	
	Beverages beverage;
	
	public Whip(Beverages beverage) {
		this.beverage = beverage;
	}
	
	String getDescription() {
		return (this.beverage.getDescription() + "\nAdding Whip");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 60;
	}

}
