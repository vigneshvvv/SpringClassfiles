package stream;

public class RunnableThreadType  implements Runnable {

	public Thread thread;
	public String thread_name;
	
	public RunnableThreadType(String thread_name) {
		this.thread_name = thread_name;
	}
	
	
	
	@Override
	public void run() {
		try {
			for(int i =0; i<=3; i++) {
				Thread.sleep(3000);
				System.out.println(i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		thread = new Thread(this, thread_name);
		thread.start();
		
	}

}
