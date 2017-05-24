package com.chernyshov777;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents task or job for 2DSP algorithm
 * @author dchernyshov
 */
@Data
@AllArgsConstructor
public class Task {
    private int time;
    private int requiredMachines;
}
