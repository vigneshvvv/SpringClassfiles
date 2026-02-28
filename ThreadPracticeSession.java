package stream;

import java.util.ArrayList;
import java.util.List;

public class ThreadPracticeSession {
	public static void main(String[] args) {
		RunnableThreadType runnableThreadType = new RunnableThreadType("thread-1");
		runnableThreadType.start();
		
		RunnableThreadType runnableThreadType1 = new RunnableThreadType("thread-2");
		runnableThreadType1.start();
		
		RunnableThreadType runnableThreadType2 = new RunnableThreadType("thread-3");
		runnableThreadType2.start();
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println(list);
	}

}
