package ACTIVITY;

public class Activity3 {
	    public static void main(String[] args) {
	        double seconds = 1000000000;

	        double earthOrbitalPeriod = 31557600; // in seconds

	        double mercuryPeriod = 0.2408467;
	        double venusPeriod = 0.61519726;
	        double marsPeriod = 1.8808158;
	        double jupiterPeriod = 11.862615;
	        double saturnPeriod = 29.447498;
	        double uranusPeriod = 84.016846;
	        double neptunePeriod = 164.79132;

	        double earthAge = seconds / earthOrbitalPeriod;
	        double mercuryAge = earthAge / mercuryPeriod;
	        double venusAge = earthAge / venusPeriod;
	        double marsAge = earthAge / marsPeriod;
	        double jupiterAge = earthAge / jupiterPeriod;
	        double saturnAge = earthAge / saturnPeriod;
	        double uranusAge = earthAge / uranusPeriod;
	        double neptuneAge = earthAge / neptunePeriod;

	        System.out.printf("Age on Earth: %.2f years\n", earthAge);
	        System.out.printf("Age on Mercury: %.2f years\n", mercuryAge);
	        System.out.printf("Age on Venus: %.2f years\n", venusAge);
	        System.out.printf("Age on Mars: %.2f years\n", marsAge);
	        System.out.printf("Age on Jupiter: %.2f years\n", jupiterAge);
	        System.out.printf("Age on Saturn: %.2f years\n", saturnAge);
	        System.out.printf("Age on Uranus: %.2f years\n", uranusAge);
	        System.out.printf("Age on Neptune: %.2f years\n", neptuneAge);
	    }
	}


