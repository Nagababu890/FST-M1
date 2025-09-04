package ACTIVITY;

import java.util.ArrayList;
import java.util.List;

public class Activity9 
{
	public static void main(String[] args) { 
		List<String> strList = new ArrayList<>(); 
		strList.add("Apple");
		strList.add("Banana");
		strList.add("Cherry");
		strList.add(1, "Almond");
		strList.add(0, "Guva");
		System.out.println("Print All the Objects:");
        for(String s:strList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + strList.get(2));
        System.out.println("Is Chicku is in list: " + strList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + strList.size());
        
        strList.remove("Cherry");
        
        System.out.println("New Size of ArrayList: " + strList.size());
    }

	}


