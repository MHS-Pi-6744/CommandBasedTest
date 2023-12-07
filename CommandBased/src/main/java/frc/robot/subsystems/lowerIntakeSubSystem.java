package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class lowerIntakeSubSystem extends SubsystemBase {

    public lowerIntakeSubSystem() {}

    private final WPI_VictorSPX leftLowerIntake = new WPI_VictorSPX(deviceNumber: 1);
    
      public CommandBase exampleMethodCommand() {

    return runOnce(
        () -> {

        });
  }


  public boolean exampleCondition() {

    return false;
  }

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {

  }
}
