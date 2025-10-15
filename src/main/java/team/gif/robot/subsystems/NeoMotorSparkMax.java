// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class NeoMotorSparkMax extends SubsystemBase {

    private final SparkMax neoMotorSparkMax;
    private final SparkClosedLoopController sparkClosedLoopController;

    public NeoMotorSparkMax() {
        neoMotorSparkMax = new SparkMax(RobotMap.SPARKMAX_ID, SparkLowLevel.MotorType.kBrushless);
        sparkClosedLoopController = neoMotorSparkMax.getClosedLoopController();

        SparkMaxConfig config = new SparkMaxConfig();
        config.idleMode(SparkBaseConfig.IdleMode.kBrake);
        config.inverted(true);

        config.closedLoop.pid(Constants.NeoSparkMax.KP, Constants.NeoSparkMax.KI, 0);

        neoMotorSparkMax.configure(config, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
    }

    public void SetPercentOutput(double percentOutput){
        neoMotorSparkMax.set(percentOutput);
    }

    public void setVoltage(double voltage){
        neoMotorSparkMax.setVoltage(voltage);
    }

    public void setRPM(double setpoint){
        sparkClosedLoopController.setReference(setpoint, SparkBase.ControlType.kVelocity);
    }
}
