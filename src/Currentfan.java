import model.Motor;
import model.Stand;



    public class Currentfan extends Fantemplate{
        private model.Motor motor;
        private Stand stand;


        Currentfan(Motor motor, model.Stand stand) {
            this.motor=motor;
            this.stand=stand;
        }
        public Currentfan() {
        }



        @Override
        void Company() {
            System.out.println("USHA");
        }

        @Override
        void Colour() {
            System.out.println("BLACK");
        }
        void displayComponents() {
            System.out.println("Motor: " + motor);
            System.out.println("Stand:" + stand);

        }
    }



