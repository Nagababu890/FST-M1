package ACTIVITY;

	public class Activity6 {
	    public static void main(String[] args) throws InterruptedException {
	        Plane plane = new Plane(10);

	        // Add passengers
	        plane.onboard("Alice");
	        plane.onboard("Bob");
	        plane.onboard("Charlie");

	        // Take off and print the time
	        System.out.println("Take-off time: " + plane.takeOff());

	        // Print current passenger list
	        System.out.println("Passengers onboard: " + plane.getPassengers());

	        // Simulate flight time
	        Thread.sleep(5000);

	        // Land the plane
	        plane.land();
	        System.out.println("Landing time: " + plane.getLastTimeLanded());

	        // Passenger list should now be empty
	        System.out.println("Passengers after landing: " + plane.getPassengers());
	    }
	}


