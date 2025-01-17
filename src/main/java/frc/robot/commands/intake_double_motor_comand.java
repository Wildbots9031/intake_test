// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.double_intake_motor;

public class intake_double_motor_comand extends Command {
  /** Creates a new intake_double_motor_comand. */
 // private final double_intake_motor m_double_motor;
 private final double_intake_motor m_2Motor;

  public intake_double_motor_comand(double_intake_motor subsystem) {
   m_2Motor = subsystem;
    addRequirements(m_2Motor);



    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_2Motor.spin2();
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
