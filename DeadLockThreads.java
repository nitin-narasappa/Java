public class DeadLockThreads {

	private String lock1 = "FirstLock";
	private String lock2 = "SecondLock";
	
	Thread one = new Thread (){
		public void run(){
			synchronized (lock1){
				System.out.println("Thread 1: Holding lock 1...");
				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				synchronized(lock2){
					System.out.println("Thread one aquired locks.");
				}
			}
		}
	};
	Thread two = new Thread (){
		public void run(){
			synchronized (lock2){
				System.out.println("Thread 2: Holding lock 2...");
				try { Thread.sleep(10); }
				catch (InterruptedException e) {}
				synchronized(lock1){
					System.out.println("Thread two aquired locks.");
				}
			}
			
		}
	};

	public static void main(String[] args) {

		DeadLockThreads locks = new DeadLockThreads();
		
		locks.one.start();
		locks.two.start();
	}
}
