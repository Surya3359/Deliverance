package singletonPrograme;

public class SingletonMain {
	int a=10;
	String b="dune";
	public static void main(String[] args) {
		 // Get the singleton instance
        Singleton a = Singleton.getInstance();

        // Get another reference to the same instance
        Singleton b = Singleton.getInstance();

        // Check if both references point to the same instance
        if (a == b) {
            System.out.println("Both references point to the same Singleton instance.");
        }else if(a != b)
        {System.out.println("Both are not equal");
	}

	}
}