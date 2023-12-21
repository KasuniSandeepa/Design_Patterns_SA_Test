package Observer;

public class ObserverImpl implements Observer {
	
	String observerName;
	String state;
	
	public ObserverImpl(String name) {
		this.observerName = name;
	}

	public void update(Subject subject) {
		
		this.state = subject.getStaus();
		System.out.println()
		
	}
}
