// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.intake_single_moter;

public class stop1 extends Command {
  /** Creates a new stop1. */
  private final intake_single_moter m_1Moter;
  public stop1(intake_single_moter subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_1Moter = subsystem;
    addRequirements(m_1Moter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_1Moter.stopSingle();
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
