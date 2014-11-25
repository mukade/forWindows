
public class YhdTest2 implements Runnable{
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new YhdTest2());
		System.out.println("go");
		t.start();
		t.join();
		System.out.println("end");
	}
	public void run(){
		for (int i = 0;i<4;i++){
			System.err.println(i);
		}
	}
}
