package Observer;

import java.util.ArrayList;

public class SubjectImpl implements Subject{
	
	ArrayList<Observer> observers = new ArrayList();
	String status;
	
	
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		
		observers.remove(o);
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStaus() {
		return this.status;	
	}
	
	public void notifyObservers() {
		
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
	

}
