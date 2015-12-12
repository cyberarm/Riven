package com.qualcomm.ftcrobotcontroller.opmodes.customops.AutonomousMountainLeft;

import com.qualcomm.ftcrobotcontroller.opmodes.customops.Autonomous.AtonomousVerables;
import com.qualcomm.ftcrobotcontroller.opmodes.customops.Autonomous.AutonomousOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by cyberarm on 12/12/15.
 */

public class AutonomousMountainLeft extends AtonomousVerables {
    public AutonomousOp autonomousOp;

    public AutonomousMountainLeft(){
        autonomousOp = new AutonomousOp();
    }

    @Override
    public void init() {

        autonomousOp.autonomousInit();
//        autonomousOp.stateMode();
    }

    @Override
    public void init_loop(){
        autonomousOp = new AutonomousOp();
        autonomousOp.autonomousInitLoop();
    }

    @Override
    public void loop() {
        autonomousOp = new AutonomousOp();
        autonomousOp.autonomousloop();
    }
}