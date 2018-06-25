/*This is the class of elevator simulation*/
import java.util.*;
public class ElevatorController {
   /*Fulfilling requirement 1, desired number of elevators and desired number of floors*/
	private int noOfElevators;
	private int noOfFloors;
	private int minFloor = 1;
	private int maxFloors;
	private HashSet<Integer> servicingElevators;
	private HashSet<Integer> retiredElevators;
	
	/*Initially we can assume that all elevators are servicing when elevator controller is started*/
	public ElevatorController(int noOfElevators,int noOfFloors,int maxFloors) {
		this.noOfElevators = noOfElevators;
		this.noOfFloors = noOfFloors;
		this.maxFloors = maxFloors;
		this.servicingElevators = new HashSet<Integer>();
		for(int i = 0; i < noOfElevators; i++) {
			servicingElevators.add(i);
		}
		this.retiredElevators = new HashSet<Integer>();
	}
	
	//The controller can start any elevator using the elevator id
	public void startElevator(int elevatorId) {
		
	}
	
	/*Requirement 8 : Retiring an elevator is done by elevator controller*/
	public void retireElevator(Elevator elevator) {
		if(elevator.retireElevator() == true)
			{servicingElevators.remove(elevator.getElevatorId());
			retiredElevators.add(elevator.getElevatorId());
			}
		}
	
	}
