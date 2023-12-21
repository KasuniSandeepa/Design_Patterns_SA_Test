package Bridge;

public class LGtv implements TV {
	
	public void on() {
	
		System.out.println("Switch on LG TV");
	}
	
	public void off() {
		
		System.out.println("Switch off LG TV");
		
	}
	
	public void tune(int number) {
		
		System.out.println("Switch on channel in  LG TV is :"+number);
		
	}


}
