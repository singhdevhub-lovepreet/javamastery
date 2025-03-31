package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.Concurrency;

public class ConcurrencyTest {
    
    @Test
    public void MultiThreadAccessibleSumTest() throws InterruptedException{
        ExecutorService es = Executors.newFixedThreadPool(4);
        Concurrency.MultiThreadAccessibleSum mts = new Concurrency().new MultiThreadAccessibleSum();
        IntStream.range(0, 1000).forEach(step -> es.submit(mts::calculate));
        es.awaitTermination(2000, TimeUnit.MILLISECONDS);
        assertEquals(1000l, mts.getSum());
    }

    @Test
    public void SenderReceiverProblemTest (){
        Concurrency.SenderReceiverProblem srp = new Concurrency().new SenderReceiverProblem();
        List<String> packets = Arrays.asList("1", "2", "3", "4");
        packets.forEach(packet -> {
            srp.send(packet);
            String packetReceived = srp.receive();
            srp.append(packetReceived);
        });
        String finalPacketSequence = srp.getFinalPacketSequence();
        assertEquals("1234", finalPacketSequence);
    }

}
