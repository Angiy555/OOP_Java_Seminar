package persons;

public class Spearman extends Person{
    int maxArmor;
    int currentArmor;

    public Spearman(String name){
        super(name,
        true,
        false,
        true,
        100,        
        100,       
        new int[]{4, 6});

        maxArmor = 100;
        currentArmor = 100;
    }

    @Override
    public String toString() {
        return "Копейщик: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", броня: " 
        + currentArmor + ")";
    }
}
