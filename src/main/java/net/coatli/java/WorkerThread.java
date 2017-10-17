package net.coatli.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerThread implements Runnable {

  private static final Logger LOGGER = LoggerFactory.getLogger(WorkerThread.class);

  private final Integer workerIndex;

  public WorkerThread(final Integer workerIndex) {
    this.workerIndex = workerIndex;
  }

  @Override
  public void run() {
    LOGGER.info("Worker {} start", workerIndex);
    processCommand();
    LOGGER.info("Worker {} finish", workerIndex);
  }

  private void processCommand() {
    try {
      Thread.sleep(5000);
    } catch (final InterruptedException exc) {
      LOGGER.error("Process command broke", exc);
    }
  }

}
