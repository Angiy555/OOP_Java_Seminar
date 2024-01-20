package persons.abstracts;

import java.util.List;

public abstract class Shooter extends Person{

    protected int maxArrows;
    protected int currentArrows;

    public Shooter(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y, int initiative){
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, damage, x, y, initiative);
    }

    public void attack(Person person) {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];
        person.getDamage(damage);
    }

    public int getCurrentArrows(){
        return this.currentArrows;
    }

    public void setCurrentArrows(int arrow){
        this.currentArrows = arrow;
    }

    public int getMaxArrows(){
        return this.maxArrows;
    }

    @Override
    public String toString() {
        return "имя " + name + " (здоровье: " + currentHealth
                + ", стрел: " + currentArrows + ")";
    }

    @Override
    public void step(List<Person> enemyTeam, List<Person> alliedTeam) {
        if(this.currentArrows == 0 || this.currentHealth == 0) return;
        Person personAttacked = getNearestLivingEnemy(enemyTeam);
        attack(personAttacked);
        this.currentArrows --;
    }
}
