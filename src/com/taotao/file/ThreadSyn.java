package com.taotao.file;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSyn {
		
	private static int i = 1;
	/*
	public void prt1() throws Exception{
		synchronized (this) {
			if(i == 1){
				this.wait();
			}
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			i = 2;
			this.notifyAll();
		}
	}
	
	public void prt2() throws Exception{
		synchronized (this) {
			if(i == 2){
				this.wait();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.print("\r\n");
			i = 1;
			this.notifyAll();
		}
	}*/
	private ReentrantLock rl = new ReentrantLock();
	private Condition c1 = rl.newCondition();
	private Condition c2 = rl.newCondition();
	private Condition c3 = rl.newCondition();
	
	public void prt1() throws Exception{
		rl.lock(); //获得锁
			if( i == 1){
				c1.await();  //等待
			}
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			i = 2;
			c2.signal();  //唤醒其他线程
		rl.unlock();	//释放锁
	}
	
	public void prt2() throws Exception{
		rl.lock(); //获得锁
		if( i == 2){
			c1.await();  //等待
		}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.print("\r\n");
			i = 3;
			c3.signal();  //唤醒其他线程
		rl.unlock();	//释放锁
	}
	
	public void prt3() throws Exception{
		rl.lock(); //获得锁
			if( i == 3){
				c3.await();  //等待
			}
			System.out.print("5");
			System.out.print("6");
			System.out.print("7");
			System.out.print("8");
			System.out.print("\r\n");
			i = 1;
			c1.signal();  //唤醒其他线程
		rl.unlock();	//释放锁
	}
	
	
}
