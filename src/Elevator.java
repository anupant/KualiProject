
public class Elevator {
	
	private int elevatorId;
    private int currentFloor;
	private int maxFloor;
	private int noOfFloorsTravelled;
	//No of trips to understand whether to retire an elevator or not  
	private int noOfTrips;
	//This will be used by elevator controller to handle the elevator request
	private boolean occupied;
	//This field is used to determine the direction of the elevator 0 means still,1 means going up and -1 
	//means going down
	private int direction;
	
	//Initially the elevator is not occupied and it is still
	public Elevator(int elevatorId,int currentFloor,int maxFloor) {
		this.elevatorId = elevatorId;
		this.currentFloor = currentFloor;
		this.maxFloor = maxFloor;
		this.occupied = false;
		this.direction = 0;
	}
	
	//Req 2 and 4: Elevator reporting up when it moves from floor to floor and cannot proceed above the top floor
	public void moveUp() {
		int currentFloor1 = getCurrentFloor();
		if(currentFloor1 == maxFloor) {
			System.out.println("Elevator reached maximum floor.It cannot go up, it should go down");
			this.direction = -1;
			return;
		}
		else {
			currentFloor1 = currentFloor1 +1;
			this.noOfFloorsTravelled = this.noOfFloorsTravelled +1;
			//Moving up
			this.direction = 1;
			System.out.println("Elevator has reached" +currentFloor1);
			setCurrentFloor(currentFloor1);
		}
	 }
	
  //Req 2 and 5 :Elevator reporting down when it moves from floor to floor and cannot proceed below the
	//ground floor
	public void moveDown() {
		int currentFloor1 = getCurrentFloor();
		if(currentFloor1 == 1) {
			System.out.println("Elevator reached minimum floor cannot go down, it should go up");
			this.direction = 1;
			return;
		}
		else {
			currentFloor1 = currentFloor1 - 1;
			this.noOfFloorsTravelled = this.noOfFloorsTravelled +1;
			this.direction = -1;
			System.out.println("Elevator has reached" +currentFloor1);
			setCurrentFloor(currentFloor1);
		}
	}
	
	//Req 3 : Elevator reporting when it opens the door
	public void notifyingOpenDoor() {
		System.out.println("Opening doors for elevator "+ elevatorId);
	}
	
	//Req 3: Elevator reporting when it closes the door
    public void notifyingCloseDoor() {
    	      System.out.println("Closing doors for elevator "+ elevatorId);
	}
    
	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	/*Function to retire elevator , elevator controller can call this function to check if it is time to retire elevator*/
	public boolean retireElevator() {
		/*Logic to calculate noOfTrips using noOfFloorsTravelled and maxFloor variable*/
		
		return false;
		}
	public int getElevatorId() {
		return elevatorId;
	}

	public void setElevatorId(int elevatorId) {
		this.elevatorId = elevatorId;
	}
	
	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

}
