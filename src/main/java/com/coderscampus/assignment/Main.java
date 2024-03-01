package com.coderscampus.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MultithreadingApplication assignmentResult = new MultithreadingApplication();
        List<Integer> finalResult = assignmentResult.firstResult();

        synchronized (assignmentResult.getNumbers()) {
            Map<Integer, Long> repetitivNumbers = finalResult.stream()
                    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

            repetitivNumbers.forEach((theNumber,countTimes)->{System.out.println(theNumber +"  " +countTimes);});
        }

    }
}
