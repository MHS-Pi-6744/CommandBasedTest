package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class lowerIntakeSubsystem extends SubsystemBase {

    public lowerIntakeSubsystem() {}

    private final WPI_VictorSPX lowerIntake = new WPI_VictorSPX(1);
    
      public CommandBase exampleMethodCommand() {
        return null;}

}
