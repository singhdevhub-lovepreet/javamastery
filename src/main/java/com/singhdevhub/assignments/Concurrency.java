package com.singhdevhub.assignments;

public class Concurrency {
    
     /*
     * @Assignment:- 8
     * @Description:- Working with futures, threads, interfaces etc
     */
    
    // -------// -------- // -------- // --------
    
    private final class RunnableImpl implements Runnable {
        
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName().toString());
        }

    }
    
    /* 
     * @Description:- Method to print Thread Names
     * Input:- None
     * Output:- Print two thread names, one Main thread of concurrency class another is of 
     * RunnableImpl class. Both threads should be different 
     */
    
    public void printThreadNames(){
        Thread runnableThread = new Thread(new Concurrency().new RunnableImpl());  
        runnableThread.start();
        System.out.println(Thread.currentThread().getName().toString());
    }

    /* 
     * @Description:- class to do sum of numbers and will be accessed by multiple threads 
     * Input:- none 
     * Output:- Sum from method, use sync keyword to make it RACE condition free 
     */
    public class MultiThreadAccessibleSum{
        private long sum = 0;

        public void calculate(){
           setSum(getSum()+1); 
        }

        public void setSum(long sum){
            this.sum = sum;
        }

        public long getSum(){
            return this.sum;
        }

    }

    
    /* 
     * @Description:- Producer/Consumer or Sender/Receiver Problem 
     * Input:- input string to send from send() to recieve 
     * Output:- None, just call append() method after recieve method and set sequence 
     *      */

    public class SenderReceiverProblem{

        private String sequenceOfPackets;
        private String packet;
        private boolean transfer = true;

        
        public void append(String packetToAppend){
            this.sequenceOfPackets = this.sequenceOfPackets+packetToAppend;
        }

        public String receive(){
            while(transfer){
                try{
                    wait();
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                    System.out.println("Current thread interuppted");
                }
            }
            transfer = true;
            String returnPacket = packet;
            notifyAll();
            return returnPacket;
        }

        public void send(String packet) {
            while (!transfer) {
                try { 
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); 
                    System.err.println("Thread Interrupted");
                }
            }
            transfer = false;
            
            this.packet = packet;
            notifyAll();
        }

    } 




}
