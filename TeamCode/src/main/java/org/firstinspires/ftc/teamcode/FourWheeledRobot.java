package org.firstinspires.ftc.teamcode;

public interface FourWheeledRobot {
    int getFrontLeftIndex();
    int getFrontRightIndex();
    int getRearLeftIndex();
    int getRearRightIndex();

    WrappedDCMotor getDrive(int index);

    default WrappedDCMotor getFrontLeftDrive() {
        return getDrive(getFrontLeftIndex());
    }

    default WrappedDCMotor getFrontRightDrive() {
        return getDrive(getFrontRightIndex());
    }

    default WrappedDCMotor getRearLeftDrive() {
        return getDrive(getRearLeftIndex());
    }

    default WrappedDCMotor getRearRightDrive() {
        return getDrive(getRearRightIndex());
    }

    void update();

    double getTicksPerInch();
    double getMaxMotorRate();
}
