package persons.abstracts;

public abstract class Shooter extends Person{

    protected int maxArrows;
    protected int currentArrows;

    public Shooter(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y, int initiative){
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, damage, x, y, initiative);
    }

    public void attack(Person person) {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];

        if (this.currentArrows > 0 && this.currentHealth > 0){
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
        return "имя " + name + " (здоровье: " + currentHealth
                + ", максимальный домаг: " + damage[1] + ", стрел: "
                + currentArrows + ", позиция: (" + personPosition.getX()
                + ", " + personPosition.getY() + "))";
    }

}
