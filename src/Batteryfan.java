import model.Motor;
import model.Stand;

public class Batteryfan extends Fantemplate{

        private Motor motor;
        private Stand stand;


        Batteryfan(Motor motor, Stand stand) {
            this.stand = stand;
            this.motor = motor;

        }

        public Batteryfan () {


        }

        @Override
        void Company()
        {
            System.out.println("USHA");
        }

        @Override
        void Colour() {
            System.out.println("BLACK");
        }


        void displayComponents() {
            System.out.println("Motor: " + motor);
            System.out.println("Stand: " +stand);

        }

}
