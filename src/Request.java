
public class Request {
	
	private int floorOnWhichRequestIsMade;
	public Request(int floorVal, ElevatorController elevCont) {
		this.floorOnWhichRequestIsMade = floorVal;
		handleRequest(elevCont);
	}
	
	//The controller will handle elevator request and dispatch the right elevator to the user
	public void handleRequest(ElevatorController elevCont) {
		elevCont.handleElevatorRequest(floorOnWhichRequestIsMade);
	}

}
