package model;

public class Motor {
    private int MotorPower;


    public Motor(int MotorPower) {
        this.MotorPower=MotorPower;

    }

    @Override
    public String toString() {
        return MotorPower+"Motorpower" ;
    }

}

