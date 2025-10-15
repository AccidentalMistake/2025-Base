// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class PneumaticPiston extends SubsystemBase {

    private final DoubleSolenoid pneumaticPiston;

    public PneumaticPiston() {
        pneumaticPiston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.PNEUMATIC_PISTON_IN_ID, RobotMap.PNEUMATIC_PISTON_OUT_ID);
    }

    public void Toggle(){
        pneumaticPiston.toggle();}

}
