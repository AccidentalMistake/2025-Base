package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;

public class LimitSwitch{

    private static DigitalInput LimitSwtich;

    public void limitSwitch() {
        LimitSwtich = new DigitalInput(9);
    }

    public boolean getSwitchState(){
        return LimitSwtich.get();
    }
}
