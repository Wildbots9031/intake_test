// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.double_intake_motor;

public class stop2 extends Command {
  private final double_intake_motor m_2Motor;
  /** Creates a new stop2. */
  public stop2(double_intake_motor subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_2Motor = subsystem;
    addRequirements(m_2Motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_2Motor.stopDouble();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
