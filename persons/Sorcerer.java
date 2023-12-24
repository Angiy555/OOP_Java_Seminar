package persons;

public class Sorcerer extends Person{
    int maxProtection;
    int currentProtection;
    int healthRegen;
    
    public Sorcerer(String name){
        super(name,
        true,
        false,
        true,
        100,                
        100,                
        new int[]{10, 13});
        maxProtection = 20;
        currentProtection = 20;
        healthRegen = 5;
    }

    @Override
    public String toString() {
        return "Колдун: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", защита: " 
        + currentProtection + ", лечение: " + healthRegen + ")";
    }
}
