
package parallel.forkjoin;

import util.MyLogger;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain2 {

    public static void main(String[] args) {
//        int processorCount = Runtime.getRuntime().availableProcessors();
//        ForkJoinPool commonPool = ForkJoinPool.commonPool();
//        log("processorCount = " + processorCount + ", commonPool = " + commonPool.getParallelism());


        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();
        MyLogger.log("[생성] " + data);

        SumTask task = new SumTask(data);
        Integer result = task.invoke();

        log("최종 결과: " + result);
    }
}
