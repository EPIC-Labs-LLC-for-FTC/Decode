package org.firstinspires.ftc.teamcode.EPIC.TestOpModes;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.EPIC.Motion.Mecanum_Wheels;

@Config
@TeleOp(name = "TeleOp_Odyssey")
public class TeleOp_Odyssey extends LinearOpMode {

    Mecanum_Wheels wheels = null;//new Mecanum_Wheels(ha)
    public static double wristPos = 0;


//    private DcMotorEx frontRight;
//    private DcMotorEx frontLeft;
//    private DcMotorEx backRight;
//    private DcMotorEx backLeft;

    private DcMotorEx spintakeFront;
    private DcMotorEx spintakeBack;
    private DcMotorEx shooterLeft;
    private DcMotorEx shooterRight;
    @Override
    public void runOpMode() throws InterruptedException {
        wheels = new Mecanum_Wheels(hardwareMap);
//        frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");
//        backRight = hardwareMap.get(DcMotorEx.class, "backRight");
//        frontLeft = hardwareMap.get(DcMotorEx.class, "frontLeft");
//        backLeft = hardwareMap.get(DcMotorEx.class, "backLeft");

        spintakeFront = hardwareMap.get(DcMotorEx.class, "spintakeFront");
        spintakeBack = hardwareMap.get(DcMotorEx.class, "spintakeBack");
        shooterLeft = hardwareMap.get(DcMotorEx.class, "shooterLeft");
        shooterRight = hardwareMap.get(DcMotorEx.class, "shooterRight");
        int sleepval = 1000;
//        double reset = 0;
//        nlm1.setPower(reset);
//        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
//        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
//        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
//        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);


        spintakeFront.setDirection(DcMotorSimple.Direction.REVERSE);
        spintakeBack.setDirection(DcMotorSimple.Direction.REVERSE);
        shooterLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        shooterRight.setDirection(DcMotorSimple.Direction.REVERSE);
//        nlm1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        nlm1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        int armPos = nlm1.getCurrentPosition();
//        int targetPos = armPos;
        wheels.initialize();
        waitForStart();
        while (opModeIsActive()) {
            double lefty = gamepad1.left_stick_y;
            double leftx = gamepad1.left_stick_x;
            double righty = gamepad1.right_stick_y;
            double rightx = gamepad1.right_stick_x;


            double lefty2 = gamepad2.left_stick_y;
            double righty2 = gamepad2.right_stick_y;

            double rightTrigger = gamepad2.right_trigger;
            double leftTrigger = gamepad2.left_trigger;

            if(gamepad1.b) {
                //frontRight.setPower(1);
                wheels.frontright.setPower(1);
                //sleep(1000);
//                armPos = nlm1.getCurrentPosition();
//                targetPos = armPos+1000;
//                //sleep(500);
            }
            else if(gamepad1.x) {
                wheels.backleft.setPower(1);
                //sleep(1000);
//                armPos = nlm1.getCurrentPosition();
//                targetPos = armPos-1000;
//
//                telemetry.addData("targetPos", targetPos);
//                telemetry.update();
//                //sleep(100);
            }
            else if(gamepad1.a) {
                wheels.backright.setPower(1);
                //sleep(1000);
//                targetPos=0;
//                //sleep(100);
            }
            else if(gamepad1.y) {
                wheels.frontleft.setPower(1);
                //sleep(1000);

                //sleep(100);
            }
            else if(gamepad1.dpad_down){
                spintakeBack.setPower(1);
            }

            else if(gamepad1.dpad_up){
                spintakeFront.setPower(1);
            }

            else if(gamepad1.dpad_left){
                shooterLeft.setPower(1);
            }

            else if(gamepad1.dpad_right){
                shooterRight.setPower(1);
            }

            wheels.move(lefty, righty, leftx, rightx);
//            wheels.frontright.setPower(0);
//            wheels.frontleft.setPower(0);
//            wheels.backright.setPower(0);
//            wheels.backleft.setPower(0);

            shooterLeft.setPower(rightTrigger);
            shooterRight.setPower(rightTrigger);
            spintakeBack.setPower(righty2);
            spintakeFront.setPower(lefty2);
//            if(targetPos>=0){
//                nlm1.setTargetPosition(targetPos);
//                nlm1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//                nlm1.setPower(1);
//                sleep(1000);
//            }
           // nlm1.setPower(0);
//            telemetry.addData("nlm1", nlm1.getCurrentPosition());
//            telemetry.update();
        }
    }
}
