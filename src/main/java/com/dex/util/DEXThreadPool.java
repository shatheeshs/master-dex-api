package com.dex.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DEXThreadPool {

    private ExecutorService executor = Executors.newFixedThreadPool(1);//creating a pool of 5 threads

    public void addJob(Runnable workerJob) {
        Runnable worker = workerJob;
        executor.execute(worker);//calling execute method of ExecutorService
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

    }
}
