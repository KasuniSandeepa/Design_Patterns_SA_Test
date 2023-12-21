package Bridge;

public class SonyTv implements TV {
	
	public void on() {
		System.out.println("Switch on Sony TV");
	}
	
	public void off() {
		System.out.println("Switch off Sony TV");
	}
	
	public void tune(int number) {
		
		System.out.println("Switch on channel in  Sony TV is :"+number);
	}

}
