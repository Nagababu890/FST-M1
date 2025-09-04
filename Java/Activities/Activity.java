package ACTIVITY;

public class Activity {
	public static void main(String[] args) {
        Car benz = new Car();
        benz.make = 2014;
        benz.color = "Black";
        benz.transmission = "Manual";

        
        benz.displayCharacteristics();
        benz.accelarate();
        benz.brake();
}

}