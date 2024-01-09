package singletonPrograme;

public class Singleton {
	  
	
	    // Private static instance variable
	    private static Singleton instance;

	    // Private constructor to prevent instantiation from other classes
	    private Singleton() {
	        // Optional: You can add initialization code here
	    }

	    // Public static method to get the unique instance of Singleton
	    public static Singleton getInstance() {
	        // Lazy initialization: create the instance only if it's null
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }

	    // Add your methods and data members here
	}

	