package persons;

public class Monk extends Person{
    int maxProtection;
    int currentProtection;
    int healthRegen;

    public Monk(String name){
        super(name,
        true,
        false,
        true,
        100,        
        100,        
        new int[]{5, 15});

        maxProtection = 20;
        currentProtection = 20;
        healthRegen = 5;
    }

    @Override
    public String toString() {
        return "Монах: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", защита: " 
        + currentProtection + ", лечение: " + healthRegen + ")";
    }
}
