// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class TalonSRX {
        //public static final double PERCENT_OUTPUT_FORWARD = .2;
    }

    public static final class NeoSparkMax{
        public static final double VOLTAGE = 5;
        public static final double RPM = 2300;
        //Long RPM = 3000
        //Mid RPM = 2500
        //Short RPM = 2300
        public static final double KP = 0.0017;
        //long KP = 0.0017
        //Mid KP = 0.0017
        //Short KP = 0.0017
        public static final double KI = 0;
    }



}
