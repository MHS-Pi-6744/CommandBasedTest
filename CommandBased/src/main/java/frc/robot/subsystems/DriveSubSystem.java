// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;


public class DriveSubSystem extends SubsystemBase {

  public DriveSubSystem() {}

  private final WPI_VictorSPX leftMotor1 = new WPI_VictorSPX(1);
  private final WPI_VictorSPX leftMotor2 = new WPI_VictorSPX(2);
  private final WPI_VictorSPX rightMotor1 = new WPI_VictorSPX(3);
  private final WPI_VictorSPX rightMotor2 = new WPI_VictorSPX(4);

  private final MotorControllerGroup rightSpeedGroup = new MotorControllerGroup(rightMotor1, rightMotor2);
  private final MotorControllerGroup leftSpeedGroup = new MotorControllerGroup(leftMotor1, leftMotor2);

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
