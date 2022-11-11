// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimelightSubsystem extends SubsystemBase {
  /** Creates a new LimelightSubsystem. */
  public static NetworkTable limelightTable = NetworkTableInstance.getDefault().getTable("limelight");
  public static NetworkTableEntry tx = limelightTable.getEntry("tx");
  public static NetworkTableEntry ty = limelightTable.getEntry("ty");
  
  public static double limelight_x = (double) tx.getDouble(0.0);
  public static double limelight_y = (double) ty.getDouble(0.0);

  public LimelightSubsystem() {
    limelightTable.getEntry("ledMode").setNumber(1);
    limelightTable.getEntry("camMode").setNumber(1);
  }

  public static void getLimelightX(){
    
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
