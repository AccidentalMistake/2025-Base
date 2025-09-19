package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class LimitSwitch{

    private static DigitalInput LimitSwitch;

    public void limitSwitch() {
        LimitSwitch = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);
    }

    public boolean getSwitchState(){
        return LimitSwitch.get();
    }
}
