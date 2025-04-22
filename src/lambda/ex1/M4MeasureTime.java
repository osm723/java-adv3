package lambda.ex1;

import lambda.Procedure;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class M4MeasureTime {

    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }

        Procedure p1 = () -> {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }

            System.out.println("sum = " + sum);
        };

        Procedure p2 = () -> {
            Arrays.sort(arr);
            System.out.println("arr = " + Arrays.toString(arr));
        };

        measure(p1);
        measure(p2);
    }


    public static void measure(Procedure procedure) {
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("startTime = " + startTime);

        procedure.run();

        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("endTime = " + endTime);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("Nano = " + between.getNano());
    }

}
