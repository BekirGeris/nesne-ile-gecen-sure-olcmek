package Bolum_9_Soru_6;

public class StopWatch {

	private long startTime;
	private long endTime;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public long getsSartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
}
