package Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void setStatus(String status);
	public String getStaus();
	

}
