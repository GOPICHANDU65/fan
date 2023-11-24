import model.Motor;
import model.Stand;

abstract class Fantemplate {

    abstract void Colour();

    abstract void Company();

    String Motor;

    String Stand;
    public final void getFantemplate() {
        getMotor();
        getStand();

        Company();
        Colour();
        System.out.println("Fan should be deliver");

    }


    public Motor getMotor() {
        return new Motor(5500);
    }

    public Stand getStand()
    {
        return new Stand(250);
    }


    void displayComponents() {
        System.out.println("Motor: " + Motor);
        System.out.println("Stand: " + Stand);


    }

}

