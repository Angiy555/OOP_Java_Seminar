package persons;

import persons.abstracts.*;

public class Villager extends Person{
    private int carriesArrows;

    public Villager(String name, int x, int y){
        super(name,
        false,
        false,
        false,
        100,
        100,
        new int[]{0, 0},
        x,
        y,
        0);

        this.carriesArrows = 1;
    }

    public int supplyArrows(){
        int arrow = this.carriesArrows;
        return arrow;
    }

    @Override
    public String toString() {
        return "Крестьянин: имя " + name + " (здоровье: " + currentHealth
                + ", позиция: (" + personPosition.getX() + ", " + personPosition.getY() + "))";
    }
}
