// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;



public class intake_single_moter extends SubsystemBase {
  private CANSparkMax motor_1;

  /** Creates a new intake_single_moter. */
  public intake_single_moter() {

 motor_1 = new CANSparkMax(42, MotorType.kBrushless);
 

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void spin1(){
motor_1.set(0.25);
  }

   public void stopSingle(){
motor_1.set(0);
  }
}
