package com.chernyshov777.datainit;

import org.apache.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * Generates tasks and write it into a file.
 * @author dchernyshov
 */
public class TasksGenerator {
    private static final Logger LOGGER = Logger.getLogger(TasksGenerator.class.getName());

    public TasksGenerator() {
    }

    /**
     * Generates tasks and write it into a file.
     * @param fileName name of file into witch tasks will be written
     * @param tasksNumber number of tasks
     * @param machinesNumber number of machines
     */
    public void generateTasks(String fileName, int tasksNumber, int machinesNumber) {
        Path path = Paths.get(fileName);
        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, CREATE, TRUNCATE_EXISTING), StandardCharsets.UTF_8))) {
            Random random = new Random();
            for (int i = 0; i < tasksNumber; i++) {
                double v = random.nextGaussian();
                out.write(" ");
                out.write(Double.valueOf(v).intValue());
            }
        } catch (IOException e) {
            LOGGER.error("Error while writing tasks into file", e);
        }
    }
}
