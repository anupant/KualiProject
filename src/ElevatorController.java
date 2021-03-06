/*This is the class of elevator simulation.This is the class which should be called first*/
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class ElevatorController {
   /*Fulfilling requirement 1, desired number of elevators and desired number of floors*/
	private int noOfElevators;
	private int noOfFloors;
	private int minFloor = 1;
	private int maxFloors;
	//The controller has the elevatorMap where elevatorId is mapped to elevators
	private HashMap<Integer,Elevator> elevatorMap;
	private HashSet<Integer> servicingElevators;
	private HashSet<Integer> retiredElevators;
	private HashSet<Integer> occupiedElevators;
	
	/*Initially we can assume that all elevators are servicing when elevator controller is started*/
	public ElevatorController(int noOfElevators,int noOfFloors,int maxFloors) {
		this.noOfElevators = noOfElevators;
		this.noOfFloors = noOfFloors;
		this.maxFloors = maxFloors;
		this.servicingElevators = new HashSet<Integer>();
		this.elevatorMap = new HashMap<Integer,Elevator>();
		for(int i = 0; i < noOfElevators; i++) {
			servicingElevators.add(i);
			int currentFloor = ThreadLocalRandom.current().nextInt(1,maxFloors + 1);
			Elevator elevator = new Elevator(i, currentFloor, maxFloors);
			elevatorMap.put(i,elevator);
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
	
	//The elevator controller will handle the request coming from request.java using the requirement given in 7
	public int handleElevatorRequest(int floorOnRequestMade) {
	    //Check using occupiedElevators set that whether any occupied elevator is moving to that floor.
		//If yes then sent that elevator to that floor.
		//Else choose one random still elevator which is unoccupied and sent it to the floor
		//then call the floorRequest function 
		return 0;
	}
	
	/*The floor request will be serviced by the elevatorController once an elevator id has been selected*/
	public void floorRequest(int elevatorId,int destinationFloorId) {
		
		
	}
	
	}
