
public class Request {
	private int floorOnWhichRequestIsMade;
	/*Req 6: Request can be made at any floor and it is handled by elevator controller which dispatches the 
	 * right elevator*/
	public Request(int floorVal, ElevatorController elevCont) {
		this.floorOnWhichRequestIsMade = floorVal;
		handleRequest(elevCont);
	}
	
	//The controller will handle elevator request and dispatch the right elevator to the user
	public void handleRequest(ElevatorController elevCont) {
		elevCont.handleElevatorRequest(floorOnWhichRequestIsMade);
	}

}
