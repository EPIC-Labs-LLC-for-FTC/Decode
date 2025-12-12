package org.firstinspires.ftc.teamcode.Encoder_Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.EPIC.Motion.Mecanum_Wheels;

@Autonomous(name = "Blue_Right_Auto")
public class Blue_Right_Auto extends LinearOpMode {

    Mecanum_Wheels wheels = null;//new Mecanum_Wheels(ha)

    private DcMotorEx spintakeFront;
    private DcMotorEx spintakeBack;
    private DcMotorEx shooterLeft;
    private DcMotorEx shooterRight;
    double shooterPower = 1*0.95;
    double spintakePower = 1;
    int shooterSleep=100;
    @Override
    public void runOpMode() throws InterruptedException {

        wheels = new Mecanum_Wheels(hardwareMap);
        wheels.setIsAutonomous(true);
        wheels.telemetry = telemetry;
        wheels.parent = this;
        wheels.initialize();

        spintakeFront = hardwareMap.get(DcMotorEx.class, "spintakeFront");
        spintakeBack = hardwareMap.get(DcMotorEx.class, "spintakeBack");
        shooterLeft = hardwareMap.get(DcMotorEx.class, "shooterLeft");
        shooterRight = hardwareMap.get(DcMotorEx.class, "shooterRight");

        spintakeFront.setDirection(DcMotorSimple.Direction.REVERSE);
        spintakeBack.setDirection(DcMotorSimple.Direction.REVERSE);
        shooterLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        shooterRight.setDirection(DcMotorSimple.Direction.REVERSE);

//        while (opModeInInit()){
//
//
//
//            //telemetry.addData("Robot Heading = %4.0f", wheels.getHeading());
//            //telemetry.update();
//
//        }
        double ldistance = 0;

        waitForStart();
        if (opModeIsActive()) {


            //Score1
//            ldistance = 24;
//            wheels.encoderDrive(1, ldistance, -ldistance, -ldistance, ldistance, 2);
//            ldistance = 8;
//            wheels.encoderDrive(1, -ldistance, -ldistance, ldistance, ldistance, 2);
//            ldistance = 22;
//            wheels.encoderDrive(1, ldistance, ldistance, ldistance, ldistance, 2);
//            sleep(500);
//            //slides.lBucket();
//            sleep(2000);
//            //claw.open();
//            sleep(1000);
//            ldistance = -11;
//            wheels.encoderDrive(0.2, ldistance, ldistance, ldistance, ldistance, 2);
//            //slides.start();
//
//            //Park
//            ldistance = 25;
//            wheels.encoderDrive(0.4, ldistance, ldistance, -ldistance, -ldistance, 2);
//
//            ldistance = 16;
//            wheels.encoderDrive(1, ldistance, ldistance, ldistance, ldistance, 2);
//            //arm.start();
//
//            ldistance = 16;
//            wheels.encoderDrive(1, ldistance, ldistance, -ldistance, -ldistance, 2);


            shooterLeft.setPower(shooterPower);
            shooterRight.setPower(shooterPower);
            sleep(2000);
            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            sleep(shooterSleep);
            spintakeBack.setPower(0);
            spintakeFront.setPower(0);
            sleep(2000);
            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            sleep(shooterSleep);
            spintakeBack.setPower(0);
            spintakeFront.setPower(0);
            sleep(2000);
            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            sleep(shooterSleep);
            spintakeBack.setPower(0);
            spintakeFront.setPower(0);
            sleep(2000);
            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            sleep(shooterSleep);
            spintakeBack.setPower(0);
            spintakeFront.setPower(0);
            sleep(2000);
            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            //sleep(10000);
            //turn left
            shooterLeft.setPower(0);
            shooterRight.setPower(0);
            spintakeBack.setPower(0);
            spintakeFront.setPower(0);
            ldistance = -2;
            wheels.encoderDrive(0.2,-ldistance,-ldistance,ldistance,ldistance,2);
            double wheelsPower = 1.0;
            //move backward
            ldistance = -16;
            wheels.encoderDrive(wheelsPower,ldistance,ldistance,ldistance,ldistance,3);
            //turn right
            //ldistance = -16;
            wheels.encoderDrive(wheelsPower,-ldistance,-ldistance,ldistance,ldistance,3);

            spintakeBack.setPower(spintakePower);
            spintakeFront.setPower(spintakePower);
            //move forward
            ldistance = 16;
            wheels.encoderDrive(wheelsPower,ldistance,ldistance,ldistance,ldistance,3);
            //turn right
            //ldistance = 18;
            wheels.encoderDrive(wheelsPower,-ldistance,-ldistance,ldistance,ldistance,2);


            //turn left
            ldistance = 2;
            wheels.encoderDrive(wheelsPower,-ldistance,-ldistance,ldistance,ldistance,2);

            //turn left
            ldistance = 18;
            wheels.encoderDrive(wheelsPower,0,ldistance,0,ldistance,2);

            shooterLeft.setPower(shooterPower);
            shooterRight.setPower(shooterPower);
        }
    }
}
