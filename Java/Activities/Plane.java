package ACTIVITY;


	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	public class Plane {
	    private List<String> passengers;
	    private int maxPassengers;
	    private Date lastTimeTookOff;
	    private Date lastTimeLanded;

	    // Constructor
	    public Plane(int maxPassengers) {
	        this.maxPassengers = maxPassengers;
	        this.passengers = new ArrayList<String>();
	    }

	    // Add a passenger if not full
	    public void onboard(String passenger) {
	        if (passengers.size() < maxPassengers) {
	            passengers.add(passenger);
	        } else {
	            System.out.println("Plane is full. Cannot add " + passenger);
	        }
	    }

	    // Set takeoff time to now and return it
	    public Date takeOff() {
	        lastTimeTookOff = new Date();
	        return lastTimeTookOff;
	    }

	    // Land the plane, record landing time, and clear passengers
	    public void land() {
	        lastTimeLanded = new Date();
	        passengers.clear();
	    }

	    // Return when plane last landed
	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    // Return the list of passengers (copy for safety)
	    public List<String> getPassengers() {
	        return new ArrayList<String>(passengers);
	    }
	}


