
public class Passenger {
	
	private int passengerID;
	private int from;
	private int to;

	public Passenger(int ID, int from, int to) {
		passengerID = ID;
		this.from = from;
		this.to = to;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	
}
