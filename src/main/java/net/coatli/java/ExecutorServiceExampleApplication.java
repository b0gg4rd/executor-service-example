package net.coatli.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecutorServiceExampleApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExecutorServiceExampleApplication.class);

  private static final int THREAD_POOL_SIZE = 5;

  private static final int WORKERS_SIZE = 10;

  public static void main(final String[] args) {
    final ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

    for (int index = 1; index < WORKERS_SIZE; index++) {
      executor.execute(new WorkerThread(index));
    }

    executor.shutdown();

    while (!executor.isTerminated()) {
      try {
        LOGGER.info("{} non blocked", Thread.currentThread().getName());
        Thread.sleep(1000);
      } catch (final InterruptedException exc) {
        LOGGER.error("Process command broke", exc);
      }
    }

    LOGGER.info("Finished all threads");
  }

}
