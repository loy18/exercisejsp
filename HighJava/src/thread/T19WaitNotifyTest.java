package thread;

public class T19WaitNotifyTest {
/*
	wati() 메서드 => 동기화 영역에서 락을 풀고 WAIT-SET 영역(공유객체별 존재)
						로 이동시킨다.
	notify() 또는 notifyAll() => WAIT-SET영역에 있는 스레드를 깨워서 실행될 수
								있도록 한다.(notify()는 하나, notifyAll()은 전부를 깨운다)
	
	=> wait()과 notify(), notifyAll()은 동기화 영역에서만 실행될 수 있고, Object 클래스에서
		제공하는 메서드이다.
*/
	public static void main(String[] args) {
		
		WorkObject workObj = new WorkObject();
		
		Thread tha = new ThreadA(workObj);
		Thread thb = new ThreadB(workObj);
		
		tha.start();
		thb.start();
	}
}

// 공통으로 사용할 객체
class WorkObject {
	public synchronized void methodA() {
		System.out.println("methodA()메서드 작업 중...");
		
		notify();
		
		try {
			System.out.println(Thread.currentThread().getName()
						+ "wait() 호출");
			wait(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("methodB()메서드 작업 중...");
		
		notify();
		
		try {
			System.out.println(Thread.currentThread().getName()
					+ "wait() 호출");
			wait(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

// WorkObject의 methodA() 메서드만 호출하는 스레드 클래스
class ThreadA extends Thread{
	private WorkObject workObj;
	
	public ThreadA(WorkObject workObj) {
		super("ThreadA");
		this.workObj = workObj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			workObj.methodA();
		}
		System.out.println("ThreadA 종료.");
	}
}

// WorkObject의 methodB() 메서드만 호출하는 스레드 클래스
class ThreadB extends Thread{
	private WorkObject workObj;
	
	public ThreadB(WorkObject workObj) {
		super("ThreadB");
		this.workObj = workObj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			workObj.methodB();
		}
		System.out.println("ThreadB 종료.");
	}
}