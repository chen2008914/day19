package com.taotao.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;

class FileTest {
	public static void main(String[] args) throws Exception {
		
			/*new demo01() {
				
				@Override
				public void prt() {
						
				}
			};
			
			
			new demo02() {
				
				@Override
				void pt() {
						
				}
			};*/
			
			/*demo03 demo03 = new demo03(){
				void pr(){
					System.out.println("55555555555");
				}
			};
			demo03.pr();*/
			/*TreeSet<Object> treeSet = new TreeSet<>();
			treeSet.add(new Person(18, "张三"));
			treeSet.add(new Person(22, "王五"));
			treeSet.add(new Person(15, "赵柳"));
			System.out.println(treeSet);*/
			
			/*TreeSet<String> treeSet = new TreeSet<>(new ComparentByLen());
			treeSet.add("avc");
			treeSet.add("avsadac");
			treeSet.add("sffavc");
			treeSet.add("fgfhavc");
			System.out.println(treeSet);
			
			OutputStream os = new FileOutputStream("");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);*/
			
			
			/*new Timer().schedule(new TimerTask() {
				
				@Override
				public void run() {
					System.out.println(new Date());
				}
			}, new Date(),1000);*/
		/*ThreadSyn threadSyn = new ThreadSyn();
		
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						threadSyn.prt2();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();	
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						threadSyn.prt1();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						threadSyn.prt3();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();*/
		
		int[] arr={6,3,8,2,9,1};
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 1 ; i < arr.length-1 ; j++){
				if(arr[i] >= arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				System.out.println(arr.toString());
			}
		}
		/*System.out.println(arr);
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}*/
		
			
	}
	
	public void pr(){
		int l = 10;
		
		
	}
	
}
