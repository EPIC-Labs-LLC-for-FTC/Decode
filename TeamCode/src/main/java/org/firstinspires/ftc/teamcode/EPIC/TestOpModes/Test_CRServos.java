package org.firstinspires.ftc.teamcode.EPIC.TestOpModes;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

@Config
@TeleOp(name = "TestCRServo")
public class Test_CRServos extends LinearOpMode {

    public static double wristPos = 0;


    @Override
    public void runOpMode() throws InterruptedException {
        int sleepval = 1000;
        //Servo jointL = hardwareMap.get(Servo.class, "yservo");
        CRServo jointL = hardwareMap.get(CRServo.class, "yservo");
        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.b) {
                jointL.setPower(255); //.setPosition(0);
                sleep(3000);
            }
            else if(gamepad1.x) {
                jointL.setPower(0);
                sleep(3000);
            }
            else if(gamepad1.a) {
                //jointL.setPosition(jointL.getPosition() - 0.01);
                sleep(1000);
            }
            else if(gamepad1.y) {
                //jointL.setPosition(jointL.getPosition() + 0.01);
                sleep(1000);
            }
            //jointL.setPower(128);
            telemetry.addData("JointL", jointL.getDeviceName());

            telemetry.addData("JointL", jointL.getPortNumber());

            telemetry.addData("JointL", jointL.getManufacturer());
            telemetry.update();
        }
    }
}
