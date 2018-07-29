import java.util.ArrayList;

public class Train {
	
	private int seatCap;
	private int currentStation;
	private int trainNo;
	private ArrayList<Passenger> passengers;
	
	public Train(int trainNo, int seat) {
		this.trainNo = trainNo;
		seatCap = seat;
		passengers = new ArrayList<Passenger>();
		currentStation = 1;
	}
	
	public boolean addPassenger(MainControl control, Passenger a) {
		if(seatCap > passengers.size()) {
			passengers.add(a);
			control.passengerAdded(trainNo, a.getPassengerID(), currentStation);
			return true;
		}
		else {
			control.trainFull(currentStation, trainNo);
			return false;
		}
	}
	
	public void removePassenger(MainControl control) {
		for(int i=0; i<passengers.size(); i++) {
			if(passengers.get(i).getTo() == currentStation) {
				control.passengerRemoved(passengers.get(i), trainNo, currentStation);
				passengers.remove(i);
				i--;
			}
		}
	}

	public int getSeatCap() {
		return seatCap;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public int getCurrentStation() {
		return currentStation;
	}
	
	public Train getTrain() {
		return this;
	}

	public void moveCurrentStation() {
		currentStation++;
		if(currentStation == 8)
			currentStation = 0;
		
	}

	
	
}
