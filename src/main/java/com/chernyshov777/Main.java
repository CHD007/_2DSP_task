package com.chernyshov777;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
        int tasksNumber = 10;
        int machinesNumber = 10;
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(10, 4));
        tasks.add(new Task(2, 2));
        tasks.add(new Task(4, 5));
        tasks.add(new Task(8, 7));

        List<String> strings = Arrays.asList(args);
        if (strings.size() == 3) {
            String fileName = strings.get(0);
            System.out.println("File name is " + fileName);
            System.out.println("Number of machines is " + strings.get(1));
            System.out.println("Algorithm name is " + strings.get(2));
        } else {
            System.out.println("Program should have 3 params: fileName, number of machines, algorithm name");
        }
    }
}
