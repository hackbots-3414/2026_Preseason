// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.math.Pair;
import edu.wpi.first.networktables.BooleanEntry;
import edu.wpi.first.util.datalog.BooleanLogEntry;
import edu.wpi.first.util.datalog.DataLog;
import edu.wpi.first.util.datalog.DoubleLogEntry;
import edu.wpi.first.wpilibj.DataLogManager;

public class HappyRobotLogger {
    private static final DataLog dataLog = DataLogManager.getLog();

    private final ArrayList<Pair<BooleanLogEntry, BooleanSupplier>> booleanLogEntries;
    private final ArrayList<Pair<DoubleLogEntry, DoubleSupplier>> doubleLogEntries;

    public HappyRobotLogger() {
        booleanLogEntries = new ArrayList<>();
        doubleLogEntries = new ArrayList<>();
    }

    public void update() {
        for (Pair<BooleanLogEntry, BooleanSupplier> pair : booleanLogEntries) {
            BooleanLogEntry entry = pair.getFirst();
            BooleanSupplier supplier = pair.getSecond();
            boolean value = supplier.getAsBoolean();
            entry.update(value);
        }
        for (Pair<DoubleLogEntry, DoubleSupplier> pair : doubleLogEntries) {
            DoubleLogEntry entry = pair.getFirst();
            DoubleSupplier supplier = pair.getSecond();
            double value = supplier.getAsDouble();
            entry.update(value);
        }
    }

    public void log(String name, BooleanSupplier supplier) {
        BooleanLogEntry entry = new BooleanLogEntry(dataLog, name);
        Pair<BooleanLogEntry, BooleanSupplier> pair = new Pair<>(entry, supplier);
        booleanLogEntries.add(pair);
    }

    public void log(String name, DoubleSupplier supplier) {
        DoubleLogEntry entry = new DoubleLogEntry(dataLog, name);
        Pair<DoubleLogEntry,DoubleSupplier> pair = new Pair<>(entry, supplier);
        doubleLogEntries.add(pair);
    }
}
