package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Test", group="FHSROBOTICS")
// @Disabled //
public class Test extends OpMode {

    // Declare all motors, servos, and other hardware below //

    DcMotor leftMotor;

    // Code to run ONCE when the driver hits INIT //
    @Override
    public void init() {

        leftMotor = hardwareMap.dcMotor.get("leftMotor");

    }

    // Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY //
    @Override
    public void init_loop(){



    }

    // Code to run ONCE when the driver hits PLAY //
    @Override
    public void start() {

        leftMotor.setPower(1.0);

    }

    // Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP //
    @Override
    public void loop() {



    }

    // Code to run ONCE after the driver hits STOP //
    @Override
    public void stop() {

        leftMotor.setPower(0);

    }

}
