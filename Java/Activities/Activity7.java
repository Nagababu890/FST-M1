package ACTIVITY;



	// Interface for bicycle parts
	interface BicycleParts {
	    int tyres = 2;
	    int maxSpeed = 100;
	}

	// Interface for bicycle operations
	interface BicycleOperations {
	    void applyBrake(int decrement);
	    void speedUp(int increment);
	}

	// Base class implementing both interfaces
	class Bicycle implements BicycleParts, BicycleOperations {
	    private int gears;
	    private int currentSpeed;

	    public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }

	    @Override
	    public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        System.out.println("Current speed after applying brake: " + currentSpeed);
	    }

	    @Override
	    public void speedUp(int increment) {
	        currentSpeed += increment;
	        System.out.println("Current speed after speeding up: " + currentSpeed);
	    }

	    public String bicycleDesc() {
	        return ("No of gears are " + gears +
	                "\nSpeed of bicycle is " + currentSpeed +
	                "\nMax speed is " + maxSpeed);
	    }
	}

	// Derived class with additional property
	class MountainBike extends Bicycle {
	    private int seatHeight;

	    public MountainBike(int gears, int currentSpeed, int seatHeight) {
	        super(gears, currentSpeed);
	        this.seatHeight = seatHeight;
	    }

	    public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    @Override
	    public String bicycleDesc() {
	        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
	    }
	}

	// Driver class with main method
	public class Activity7 {
	    public static void main(String[] args) {
	        MountainBike mb = new MountainBike(3, 0, 25);
	        System.out.println(mb.bicycleDesc());
	        mb.speedUp(20);
	        mb.applyBrake(5);
	        mb.setHeight(30);
	        System.out.println("After updating seat height:");
	        System.out.println(mb.bicycleDesc());
	    }
	}


