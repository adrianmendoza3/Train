import java.util.ArrayList;

public class MainControl {

	private MainView view;
	private ArrayList<Train> trains;
	//private ArrayList<Passenger> allPassengers;
	private ArrayList<Station> stations;
	
	public MainControl(MainView view) {
		this.view = view;
		trains = new ArrayList<Train>();
		//allPassengers = new ArrayList<Passenger>();
		stations = new ArrayList<Station>();
		stations.add(new Station(1));
		stations.add(new Station(2));
		stations.add(new Station(3));
		stations.add(new Station(4));
		stations.add(new Station(5));
		stations.add(new Station(6));
		stations.add(new Station(7));
		stations.add(new Station(8));
	}
	
	public void addTrain(int trainNo, int seatCap) {
		trains.add(new Train(trainNo, seatCap));
		

		Thread thread = new Thread(() -> {
			int currentStation = 0;
			int i = 0;
			int start = 0;
			while(i < 16) {
				i++;
				
				if(start == 0) {
					if(stations.get(currentStation).getCurrTrain() == null) {
						//trains.get(trainNo -1).moveCurrentStation();
						
						view.getStation(currentStation).append("Train#"+ trainNo + " has arrived \n");
						//removeFromTrain(trains.get(trainNo-1));
						addToTrain(trains.get(trainNo-1));
						stations.get(currentStation).setCurrTrain(trains.get(trainNo-1));
						start = 1;
					}
				}
				else {
					if(currentStation != 7) {
						if(stations.get(currentStation+1).getCurrTrain() == null) {
							trains.get(trainNo -1).moveCurrentStation();
							
							view.getStation(currentStation+1).append("Train#"+ trainNo + " has arrived \n");
							removeFromTrain(trains.get(trainNo-1));
							addToTrain(trains.get(trainNo-1));
							stations.get(currentStation+1).setCurrTrain(trains.get(trainNo-1));
							stations.get(currentStation).setCurrTrain(null);
							currentStation++;
						}
					}
					else {
						if(stations.get(0).getCurrTrain() == null) {
							trains.get(trainNo -1).moveCurrentStation();
							
							view.getStation(0).append("Train#"+ trainNo + " has arrived \n");
							removeFromTrain(trains.get(trainNo-1));
							addToTrain(trains.get(trainNo-1));
							stations.get(0).setCurrTrain(trains.get(trainNo-1));
							stations.get(currentStation).setCurrTrain(null);
							currentStation = 0;
						}
					}
				}
				
				
				
				/*
				if(currentStation < 7) {
					if(stations.get(currentStation+1).getCurrTrain() == null) {
						view.getStation(currentStation+1).append("Train#"+ trainNo + " has arrived \n");
						removeFromTrain();
						addToTrain();
						
						stations.get(currentStation+1).setCurrTrain(trains.get(trainNo-1));
						
						if(currentStation != -1) {
							stations.get(currentStation).setCurrTrain(null);
						}
						currentStation++;
						
						if(currentStation == 8) {
							currentStation = 0;
						}
			
						trains.get(trainNo -1).moveCurrentStation();
						
					}
				}
				else {
					if(stations.get(0).getCurrTrain() == null) {
						view.getStation(currentStation+1).append("Train#"+ trainNo + " has arrived \n");
						removeFromTrain();
						addToTrain();
						
						stations.get(0).setCurrTrain(trains.get(trainNo-1));
						
						if(currentStation != -1) {
							stations.get(currentStation).setCurrTrain(null);
						}
						currentStation++;
						
						if(currentStation == 8) {
							currentStation = 0;
						}
			
						trains.get(trainNo -1).moveCurrentStation();
						
					}
				}
				*/
						
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
		});
		thread.start();	
	}
	
	public void addPassenger(int passengerID, int from, int to) {
		
//		allPassengers.add(new Passenger(passengerID, from , to));
		
		switch(from) {
			case 1: view.getStation1().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(0).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 2: view.getStation2().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(1).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 3: view.getStation3().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(2).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 4: view.getStation4().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(3).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 5: view.getStation5().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(4).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 6: view.getStation6().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(5).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 7: view.getStation7().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(6).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
			case 8: view.getStation8().append("Passenger#" + passengerID + " until Station " + to +"\n"); 
					stations.get(7).addPassengersWaiting(new Passenger(passengerID, from, to)); break;
		}
	}
	
	public void removeFromTrain(Train train) {
//		for(int i =0; i<trains.size(); i++) {
//			trains.get(i).removePassenger(getControl());
//		}
		
		train.removePassenger(getControl());
	}
	
	public void passengerRemoved(Passenger a, int trainNo, int currentStation){
		switch(currentStation) {
			case 1: view.getStation1().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 2: view.getStation2().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 3: view.getStation3().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 4: view.getStation4().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 5: view.getStation5().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 6: view.getStation6().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 7: view.getStation7().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
			case 8: view.getStation8().append("Passenger#" + a.getPassengerID()+  " going down\n"); break;
		}
	}
	
	public void addToTrain(Train train) {
		ArrayList<Passenger> passengers;
		
		if(train.getCurrentStation()-1 != -1)
			passengers = stations.get(train.getCurrentStation()-1).getPassengersWaiting();
		else
			passengers = stations.get(7).getPassengersWaiting();
		
		for(int j=0; j< passengers.size(); j++) {
			boolean value = train.addPassenger(getControl(), passengers.get(j));
			if(value) {
				j--;
			}
			else {
				break;
			}
		}
		
		/*
		for(int i =0; i<trains.size(); i++) {
			if(trains.get(i).getCurrentStation()-1 != -1)
				passengers = stations.get(trains.get(i).getCurrentStation()-1).getPassengersWaiting();
			else
				passengers = stations.get(7).getPassengersWaiting();
			for(int j=0; j< passengers.size(); j++) {
				boolean value = trains.get(i).addPassenger(getControl(), passengers.get(j));
				if(value) {
					j--;
				}
				else {
					break;
				}
			}
		*/	
			
			/*
			for(int j=0; j<allPassengers.size(); j++) {
				if(trains.get(i).getCurrentStation() == allPassengers.get(j).getFrom()) {
					boolean value = trains.get(i).addPassenger(getControl(), allPassengers.get(j));
					if(value) {
						j--;
					}
					else {
						break;
					}
				}
			}
			*/
		//}
	}
	
	public void passengerAdded(int trainNo, int passengerID, int currentStation) {
		
		switch(currentStation) {
			case 1: view.getStation1().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 2: view.getStation2().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 3: view.getStation3().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 4: view.getStation4().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 5: view.getStation5().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 6: view.getStation6().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 7: view.getStation7().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
			case 8: view.getStation8().append("Passenger" + passengerID +  " is now on board Train" + trainNo + "\n"); break;
		}
		
		for(int j=0; j<stations.get(currentStation-1).getPassengersWaiting().size(); j++) {
			if(passengerID == stations.get(currentStation-1).getPassengersWaiting().get(j).getPassengerID()) {
				stations.get(currentStation-1).getPassengersWaiting().remove(j);
			}
		}
	}
	
	public void trainFull(int currentStation, int trainNo) {
		switch(currentStation) {
			case 1: view.getStation1().append("Train#" + trainNo + " is now full \n"); break;
			case 2: view.getStation2().append("Train#" + trainNo + " is now full \n"); break;
			case 3: view.getStation3().append("Train#" + trainNo + " is now full \n"); break;
			case 4: view.getStation4().append("Train#" + trainNo + " is now full \n"); break;
			case 5: view.getStation5().append("Train#" + trainNo + " is now full \n"); break;
			case 6: view.getStation6().append("Train#" + trainNo + " is now full \n"); break;
			case 7: view.getStation7().append("Train#" + trainNo + " is now full \n"); break;
			case 8: view.getStation8().append("Train#" + trainNo + " is now full \n"); break;
		}
	}
	
	public MainControl getControl() {
		return this;
	}
	
	
}
