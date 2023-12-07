package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class UpperIntakeSubsystem extends SubsystemBase {




    
  private final WPI_VictorSPX leftGateMotor = new WPI_VictorSPX(8);
  private final WPI_VictorSPX rightGateMotor = new WPI_VictorSPX(7);


  private final MotorControllerGroup upperIntakeMotor = new MotorControllerGroup(leftGateMotor, rightGateMotor);




    }
    

   @Override
  public void periodic() {
    
  }

  public void setMotors(double intakeSpeed){
    upperIntakeMotor.set(intakeSpeed);


  
  }
