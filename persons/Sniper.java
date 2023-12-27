package persons;

public class Sniper extends Person{
    private int maxArrows;
    private int currentArrows;

    public Sniper(String name, int x, int y){
        super(name,
        false,
        false,
        true,
        100,
        100,
        new int[]{10, 13},
        x,
        y);

        this.maxArrows = 100;
        this.currentArrows = 100;
    }

    public void attack(Person person) {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];

        if (this.currentArrows > 0){
            person.getDamage(damage);
            this.currentArrows --;
        }
        else {
            person.getDamage(0);
        };
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
        return "Снайпер: имя " + name + " (здоровье: " + currentHealth
        + ", максимальный домаг: " + damage[1] + ", стрел: "
        + currentArrows + ", позиция: (" + personPosition.x
        + ", " + personPosition.y + "))";
    }
}
