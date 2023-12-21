package Bridge;

public class RemoteControllerImpl implements RemoteController {
	
	TV tv;
	
	public RemoteControllerImpl(TV tv) {
		this.tv = tv;
	}
	
	public void on() {
		
		tv.on();
		
	}
	
	public void off() {
		
		tv.off();
		
	}
	
	public void tune(int number) {
		
		tv.tune(number);
		
	}

}
