package day20.com.ict.edu2;

// 6. 두 개의 스레드를 생성하여 첫 번째 스레드의 출력을 1-50까지,
//	  두 번째 스레드의 출력은 51-100까지 출력
//	  다시 첫 번째 스레드가 101-150까지 출력, 두 번쨰 스레드가 151~200

public class Ex02 implements Runnable{
	int x=0;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i<100; i++) {
				System.out.println(Thread.currentThread().getName()+" : "+ ++x);
				if(x % 50 ==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test, "tiger").start();
		new Thread(test, "dog").start();
		
	}
}

