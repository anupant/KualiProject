public abstract class Request {
	private int floorOnWhichRequestIsMade;
	/*Req 6: Request can be made at any floor and it is handled by elevator controller which dispatches the 
	 * right elevator*/
	public Request(int floorVal, ElevatorController elevCont) {
		this.floorOnWhichRequestIsMade = floorVal;
		handleElevRequest(elevCont);
	}
	
	//The controller will handle elevator request and dispatch the right elevator to the user
	public void handleElevRequest(ElevatorController elevCont) {
		elevCont.handleElevatorRequest(floorOnWhichRequestIsMade);
	}
	
	//This function will be implemented to send floor request to the elevatorController once the elevator
	//has been selected  
	public abstract void floorRequest(ElevatorController elevCont) ;
	
}
