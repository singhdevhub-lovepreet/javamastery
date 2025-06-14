package com.singhdevhub.assignments;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public class SenderReceiverProblem {
        private String packet;
        private boolean transfer = true;
        private StringBuilder finalSequence = new StringBuilder();

        // Sender (Producer)
        public synchronized void send(String packet) {
            while (!transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.packet = packet;
            transfer = false;
            notifyAll();
        }

        // Receiver (Consumer)
        public synchronized String receive() {
            while (transfer) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            transfer = true;
            notifyAll();
            return packet;
        }

        public void append(String packet) {
            finalSequence.append(packet);
        }

        public String getFinalPacketSequence() {
            return finalSequence.toString();
        }
    }

     /* 
     * @Description:- Pass a supplier function callback to completable future 
     * Input:- None 
     *      * Output:- Print "Hello world" from two futures. get "Hello" from one and then concat with "world" and print  
     *      *      */   
    public void printHelloFromFuture() throws  InterruptedException, ExecutionException{

        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get(){
                return "Hello";
            }
        });
        future.thenAccept(s -> System.out.println(s + " world"));
        future.get();
    }


     /* 
     * @Description:- run futures in parallel & print "Hello how are you" 
     * with each word coming from one future (Hello -> future1, how -> future2 ...) 
     * Input:- None 
     *      * Output:- Print "Hello how are you"
     *      *      */   
    public void runFuturesInParallel(){
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()->"how");
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(()->"are");
        CompletableFuture<String> f4 = CompletableFuture.supplyAsync(()->"you");

        String result = Stream.of(f1, f2, f3, f4).map(CompletableFuture::join).collect(Collectors.joining(" "));
        System.out.println(result);
    }


     /* 
     * @Description:-  Async network request example
    */

    public class NetworkRequest {

        

    }


}

