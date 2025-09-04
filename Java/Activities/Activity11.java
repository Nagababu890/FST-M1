package ACTIVITY;

	import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
	public class Activity11 {
		public static void  main(String[] args) {
			Map<Integer, String> colours = new HashMap<>();

			colours.put(100, "red");
			colours.put(101, "Blue");
			colours.put(102, "Green");
			colours.put(103, "White");
			colours.put(104, "Black");
			System.out.println(colours);
			for (Entry<Integer, String> Item: colours.entrySet()) {
				System.out.println(Item.getKey() + " : " +Item.getValue());
				
				
		        System.out.println("After removing White: " + colours);
		        
		        if(colours.containsValue("Green")) {
		            System.out.println("Green exists in the Map");
		        } else {
		            System.out.println("Green does not exist in the Map");
		        }
		        
		        System.out.println("Number of pairs in the Map is: " + colours.size());
			}
		}
	}
