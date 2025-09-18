package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;

public class LimitSwitch{

    private static DigitalInput LimitSwitch;

    public void limitSwitch() {
        LimitSwitch = new DigitalInput(9);
    }

    public boolean getSwitchState(){
        return LimitSwitch.get();
    }
}
