
public class exp_5_5 {
	public static void main(String[] args) throws Exception{
		Sum sd = new Sum();
		SumThread st1 = new SumThread("线程1",sd);
		SumThread st2 = new SumThread("线程1",sd);
		SumThread st3 = new SumThread("线程1",sd);
		Thread tst1 = new Thread(st1);
		Thread tst2 = new Thread(st2);
		Thread tst3 = new Thread(st3);
		tst1.start();
		tst2.start();
		tst3.start();
		tst1.join();tst2.join();tst3.join();
		System.out.println("总和为："+(st1.getSum()+st2.getSum()+st3.getSum()));
	}
}

class Sum{
	private int count;
	synchronized public int add(){
		count = count +1;
		return count;
	}
}

class SumThread implements Runnable{
	private Sum sd;
	private int sum = 0;
	private String name = null;
	public SumThread(String name,Sum sd){
		this.name = name;
		this.sd = sd;
	}
	public void run(){
		try{
			for(int i=0;i<3;i++){
				sum +=sd.add();
				Thread.sleep(100);
			}
			Thread.sleep(1000);
		}catch(Exception e){
			System.err.println(e.toString());
		}
		System.err.println(name+"累加和："+sum);
	}
	public int getSum(){
		return sum;
	}
}
