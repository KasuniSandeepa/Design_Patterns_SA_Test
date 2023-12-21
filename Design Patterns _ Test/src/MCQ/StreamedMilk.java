package MCQ;

public class StreamedMilk  extends CondimentDecorator{
	
	Beverages beverage;
	
	public StreamedMilk(Beverages beverage) {
		this.beverage = beverage;
	}

	String getDescription() {
		return (this.beverage.getDescription() + "\nAdding StreamedMilk");
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 75;
	}


}
