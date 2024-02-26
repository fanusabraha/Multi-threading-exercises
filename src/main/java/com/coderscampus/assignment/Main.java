package com.coderscampus.assignment;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MultithreadingApplication assignment = new MultithreadingApplication();
        System.out.println("Start of Main Thread");
        for (int i=0; i<1000; i++) {

           CompletableFuture
                    .supplyAsync(()-> assignment, Executors.newSingleThreadExecutor())
                   .thenApplyAsync(m->m.getNumbers())
                   .thenAcceptAsync(n-> System.out.println(n),Executors.newCachedThreadPool());
            synchronized (assignment.getNumbers()) {
                Map<Integer, Long> repetitivNumbers = assignment.getNumbers().stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
                System.out.println(repetitivNumbers);
            }
        }
        System.out.println("end of the Main Thread ");
    }
}
