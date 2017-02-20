package Test;

public class singleton {

	
	
	private static singleton uniqueInstance;
	
	private singleton() {}
	
	public static synchronized singleton getInstance() {
		
		if (uniqueInstance == null){
			uniqueInstance = new singleton();
			System.out.println("instance created");
		}
		return uniqueInstance;
	}
	
	public static void main(String arg []) {

		 for (int i = 0; i < 10; i++) {
			singleton.getInstance();
		}
		}
}


