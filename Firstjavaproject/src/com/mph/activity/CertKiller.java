package com.mph.activity;

public class CertKiller implements Runnable{
	public static void MAIN(String[] args) throws Exception{
		Thread t= new Thread(new CertKiller());
	t.start();
	System.out.print("Strated");
	t.join();
	System.out.println("Complete");
	
	}
	public void run() {
		for(int I=0; I<4; I++)
		{
			System.out.println(I);
		}
	}
}