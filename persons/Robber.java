package persons;

public class Robber extends Person{
    int maxArmor;
    int currentArmor;

    public Robber(String name){
        super(name,
        true,
        false,
        true,
        100,        
        100,        
        new int[]{10, 13});

        maxArmor = 100;
        currentArmor = 100;
    }

    @Override
    public String toString() {
        return "Грабитель: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", броня: " 
        + currentArmor + ")";
    }
}
