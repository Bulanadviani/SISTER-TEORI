/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sister_teori.Modul9;

/**
 *
 * @author ASUS
 */
class PrintNameThread implements Runnable {
    Thread thread;
    PrintNameThread(String name){
        thread = new Thread(this, name);
        thread.start();
    }
        public void run() {
            String name = thread.getName();
            for (int i = 0; i < 100; i++){
                System.out.print(name);
            }
        }
    }
    class TestThread {
        public static void main (String args[]){
            new PrintNameThread("A");
            new PrintNameThread("B");
            new PrintNameThread("C");
            new PrintNameThread("D");
        }
    }

