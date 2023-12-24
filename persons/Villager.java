package persons;

public class Villager extends Person{
    int carriesArrows;

    public Villager(String name){
        super(name,
        true,
        false,
        true,
        100,                
        100,                
        new int[]{0, 0});

        carriesArrows = 1;
    }

    @Override
    public String toString() {
        return "Крестьянин: имя " + name + " (здоровье: " + currentHealth  + ")";
    }
}
