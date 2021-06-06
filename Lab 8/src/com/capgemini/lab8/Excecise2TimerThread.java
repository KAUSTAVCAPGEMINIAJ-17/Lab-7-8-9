package com.capgemini.lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Kaustav
 *
 */
public class Excecise2TimerThread implements Runnable {

	/**
	 * synchronized display method for displaying the present time
	 */
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Present time = ");
		while (true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.println("Time after 10 seconds =");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Excecise2TimerThread threadTimer = new Excecise2TimerThread();
		Thread thread = new Thread(threadTimer);
		thread.start();
	}
}