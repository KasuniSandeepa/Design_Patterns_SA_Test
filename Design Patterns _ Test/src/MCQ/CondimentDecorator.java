package MCQ;

public abstract class CondimentDecorator extends Beverages {
	
	String getDescription() {
		return "Adding condiments";
	}
	
	public abstract double getCost();

}
