package model;

public class Stand {
    private int StandThickness;


    public Stand(int StandThickness) {
        this.StandThickness=StandThickness;

    }

    @Override
    public String toString() {
        return StandThickness+"StandThickness" ;
    }

}
