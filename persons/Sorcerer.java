package persons;

import persons.abstracts.*;

public class Sorcerer extends Wizards{

    public Sorcerer(String name, int x, int y){
        super(name,
        false,
        false,
        true,
        100,
        100,
        new int[]{10, 13},
        x,
        y,
        2);

        this.currentProtection = 20;
        this.healthRegen = 5;
    }

    @Override
    public String toString() {
        return "Колдун: " + super.toString();
    }
}
