package persons;

public class Villager extends Person{
    private int carriesArrows;

    public Villager(String name){
        super(name,
        true,
        false,
        true,
        100,                
        100,                
        new int[]{0, 0});

        this.carriesArrows = 1;
    }

    public int supplyArrows(){
        int arrow = this.carriesArrows;
        return arrow;
    }

    @Override
    public String toString() {
        return "Крестьянин: имя " + name + " (здоровье: " + currentHealth  + ")";
    }
}
