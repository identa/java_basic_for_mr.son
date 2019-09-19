package OOPConcept;

public class Motor extends Bicycle {
    int seat = 2;

    //inheritance
    @Override
    void changeGears(int gears) {
        this.gear = 6;
    }

    boolean have2Seats(){
        if (seat != 2)
        return false;
        else return true;
    }
}
