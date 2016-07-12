/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author T-107
 */
public class TerceraThread {
    	public static void main(String[] args) {
            Thread t1=new Thread(new Runnable(){
                public void run(){
                    System.out.println("Soy el primer Thread");
		}
		});
            Thread t2=new Thread(new Runnable(){
		public void run(){
                    System.out.println("Soy el segundo Thread");
		}
		});
		t1.start();
		t2.start();
	}
    
    }
