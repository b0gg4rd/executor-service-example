# Executor Service Example

Example with the **Executor Service** of Java 8.

## Requirements

- JDK 1.8

## Building

For execute use:

`$ ./mvnw clean package exec:exec`

Example output

```
[INFO] --- exec-maven-plugin:1.5.0:exec (default-cli) @ executor-service-example ---
2017-10-17 17:13:33:367 -0500 [pool-1-thread-2] INFO net.coatli.java.WorkerThread - Worker 2 start
2017-10-17 17:13:33:367 -0500 [pool-1-thread-1] INFO net.coatli.java.WorkerThread - Worker 1 start
2017-10-17 17:13:33:368 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:33:368 -0500 [pool-1-thread-4] INFO net.coatli.java.WorkerThread - Worker 4 start
2017-10-17 17:13:33:367 -0500 [pool-1-thread-3] INFO net.coatli.java.WorkerThread - Worker 3 start
2017-10-17 17:13:33:371 -0500 [pool-1-thread-5] INFO net.coatli.java.WorkerThread - Worker 5 start
2017-10-17 17:13:34:369 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:35:369 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:36:370 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:37:370 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:38:369 -0500 [pool-1-thread-2] INFO net.coatli.java.WorkerThread - Worker 2 finish
2017-10-17 17:13:38:369 -0500 [pool-1-thread-4] INFO net.coatli.java.WorkerThread - Worker 4 finish
2017-10-17 17:13:38:369 -0500 [pool-1-thread-2] INFO net.coatli.java.WorkerThread - Worker 6 start
2017-10-17 17:13:38:369 -0500 [pool-1-thread-3] INFO net.coatli.java.WorkerThread - Worker 3 finish
2017-10-17 17:13:38:370 -0500 [pool-1-thread-3] INFO net.coatli.java.WorkerThread - Worker 8 start
2017-10-17 17:13:38:369 -0500 [pool-1-thread-1] INFO net.coatli.java.WorkerThread - Worker 1 finish
2017-10-17 17:13:38:369 -0500 [pool-1-thread-4] INFO net.coatli.java.WorkerThread - Worker 7 start
2017-10-17 17:13:38:370 -0500 [pool-1-thread-1] INFO net.coatli.java.WorkerThread - Worker 9 start
2017-10-17 17:13:38:370 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:38:372 -0500 [pool-1-thread-5] INFO net.coatli.java.WorkerThread - Worker 5 finish
2017-10-17 17:13:39:371 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:40:371 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:41:372 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:42:372 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - main non blocked
2017-10-17 17:13:43:370 -0500 [pool-1-thread-2] INFO net.coatli.java.WorkerThread - Worker 6 finish
2017-10-17 17:13:43:370 -0500 [pool-1-thread-1] INFO net.coatli.java.WorkerThread - Worker 9 finish
2017-10-17 17:13:43:371 -0500 [pool-1-thread-3] INFO net.coatli.java.WorkerThread - Worker 8 finish
2017-10-17 17:13:43:371 -0500 [pool-1-thread-4] INFO net.coatli.java.WorkerThread - Worker 7 finish
2017-10-17 17:13:43:373 -0500 [main] INFO net.coatli.java.ExecutorServiceExampleApplication - Finished all threads
```