
public class Request {
	
	private int floorOnWhichRequestIsMade;
	public Request(int floorVal, ElevatorController elevCont) {
		this.floorOnWhichRequestIsMade = floorVal;
		handleRequest(floorVal,elevCont);
	}
	
	//The controller will handle elevator request and dispatch the right elevator to the user
	public void handleRequest(int floorVal,ElevatorController elevCont) {
		elevCont.handleElevatorRequest();
	}

}
