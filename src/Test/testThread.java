package Test;

public class testThread implements Runnable {

	public void run(){  
		for (int i = 0; i < 10 ; i++) {
			singleton.getInstance();
			
		}  
		}  
		public static void main(String args[]){  
			new Thread (new testThread ()).start();
			
			for (int i = 0; i < 10 ; i++) {
				singleton.getInstance();
			
			}
		 } 
}
