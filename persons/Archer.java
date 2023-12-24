package persons;
public class Archer extends Person {
    int maxArrows;
    int currentArrows;

    public Archer(String name) {
        super(name, 
        true,
        false,
        true,
        100,        
        100,       
        new int[]{10, 13});

        maxArrows = 100;
        currentArrows = 100;
    }

    @Override
    public String toString() {
        return "Лучник: имя " + name + " (здоровье: " + currentHealth 
                + ", максимальный домаг: " + damage[1] + ", стрел: " 
                + currentArrows + ")";
    }
}
