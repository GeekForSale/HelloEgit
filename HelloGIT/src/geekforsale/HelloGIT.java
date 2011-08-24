package geekforsale;

// add a comment
public class HelloGIT {

	public static void main(String[] args) {
		System.out.println("Hello Git!!!");
		// We have made some changes to Git!
		System.out.println("Hello Jason!");

		// More bang.
		bang(100);

	}
	
	private void bang(int amount) {
	   for (int i = 0; i < amount; i++) {
           if (i % 10 == 0) {
               System.out.println();
           }
           System.out.print("bang!");
       }
	}

}
