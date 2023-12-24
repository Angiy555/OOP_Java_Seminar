package persons;
public class Archer extends Person {
    private int maxArrows;
    private int currentArrows;

    public Archer(String name) {
        super(name, 
        false,
        false,
        true,
        100,        
        100,       
        new int[]{5, 10});

        this.maxArrows = 100;
        this.currentArrows = 100;
    }

    public int attack() {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];
        this.currentArrows --;
        if (this.currentArrows < 0) return 0;
        else return damage;
    }

    public void replenishmentArrows(int arrows){
        if(this.currentArrows + arrows > this.maxArrows){
            this.currentArrows = this.maxArrows;
        }
        else{
            this.currentArrows = this.currentArrows + arrows;
        }
    }

    @Override
    public String toString() {
        return "Лучник: имя " + name + " (здоровье: " + currentHealth 
                + ", максимальный домаг: " + damage[1] + ", стрел: " 
                + currentArrows + ")";
    }
}
