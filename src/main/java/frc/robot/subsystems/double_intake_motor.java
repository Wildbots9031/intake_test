// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class double_intake_motor extends SubsystemBase {
public CANSparkMax motor_2;
public CANSparkMax motor_3;
 
  /** Creates a new double_intake_motor. */
  public double_intake_motor() {
     motor_2 = new CANSparkMax(30, MotorType.kBrushless);
  

  motor_3 = new CANSparkMax(19, MotorType.kBrushless);
  

    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void spin2(){
motor_2.set(1);
motor_3.set(-1);

  }

  public void stopDouble(){
motor_2.set(0);
motor_3.set(0);

  }
}
