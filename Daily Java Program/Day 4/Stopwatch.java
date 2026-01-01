//1) Stopwatch (Class & Basic Object Use)
//Question:
//Implement a Stopwatch class that simulates time using a loop-based tick counter.
//Requirements:
//
//Private fields: boolean running, int ticks
//Public methods:
//
//void start(): sets running = true
//void stop(): sets running = false
//void reset(): sets ticks = 0
//int elapsed(): returns ticks

import java.util.Scanner;
public class Stopwatch {
	private boolean running;
	private int ticks;
	
	public void start() {
		running = true;
	}
	
	public void stop() {
		running = false;
	}

	private void reset() {
		ticks = 0;
	}
	
	public int elapsed() {
		return ticks;
	}

	private void incrementTick() {
		if(running) {
			ticks++;
		}
	}

	private boolean isRunning() {
		return running;
	}
	
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		
		for (int i = 0; i < 1000; i++) { // simulate ticks
		    if (sw.isRunning()) { // optional helper if you add it
		        sw.incrementTick(); // or encapsulate tick logic inside start/stop
		    }
		}
		
		sw.stop();
		System.out.println(sw.elapsed()); // expected: 1000
		sw.reset();
		
		
		// user input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of ticks to simulate: ");
//		int numTicks = sc.nextInt();
//		
//		Stopwatch sw = new Stopwatch();
//		sw.start();
//		
//		for(int i = 0; i<numTicks; i++) {
//			sw.incrementTick();
//		}
//		
//		sw.stop();
//		System.out.println("Elapsed: " + sw.elapsed());
//		
//		sw.reset();
//		System.out.println("Reset: " + sw.elapsed());
	}
}
