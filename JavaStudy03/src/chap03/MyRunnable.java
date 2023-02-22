package chap03;

import java.util.concurrent.ThreadPoolExecutor;

class MyRunnable implements Runnable {
 
	public void startExecution() {
		ThreadPoolExecutor executor = getExecutor();
		Runnable newInstance = new MyRunnable() {
			public void run() {
				performLongRunningTask();
			}
		};
		executor.execute(newInstance);
	}
	
	void performLongRunningTask() {
		// Do some work here. 뭐하라는건지 모르겠음
	}

}
