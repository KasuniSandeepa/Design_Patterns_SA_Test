package MCQ;

public class Soy  extends CondimentDecorator{
	
	Beverages beverage;
	
	public Soy(Beverages beverage) {
		this.beverage = beverage;
	}

	String getDescription() {
		return (this.beverage.getDescription() + "\nAdding Soy");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 20;
	}

}
