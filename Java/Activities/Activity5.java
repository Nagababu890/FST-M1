package ACTIVITY;



	// Abstract class Book
	abstract class Book {
	    String title;

	    // Abstract method
	    abstract void setTitle(String s);

	    // Concrete method
	    String getTitle() {
	        return title;
	    }
	}

	// Subclass MyBook extends abstract class Book
	class MyBook extends Book {
	    // Provide implementation for abstract method
	    public void setTitle(String s) {
	        title = s;
	    }
	}

	public class Activity5 {
	    public static void main(String[] args) {
	        String title = "The Alchemist";

	        // Create object of subclass
	        MyBook newNovel = new MyBook();

	        // Set title using abstract method implemented in subclass
	        newNovel.setTitle(title);

	        // Print the title using concrete method from abstract class
	        System.out.println("The title is: " + newNovel.getTitle());
	    }
	}


