package persons;

import persons.abstracts.*;

public class Monk extends Wizards{

    public Monk(String name, int x, int y){
        super(name,
        false,
        false,
        true,
        100,
        100,
        new int[]{5, 15},
        x,
        y,
        2);

        this.currentProtection = 20;
        this.healthRegen = 5;
    }

    @Override
    public String toString() {
        return "Монах: " + super.toString();
    }
    @Override
    public String getInfo() {
        String result = "Монах";
        return result;
    }
}
