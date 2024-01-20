package persons.abstracts;

import java.util.List;

public abstract class Wizards extends Person{

    protected int currentProtection;
    protected int healthRegen;

    public Wizards(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y, int initiative){
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, damage, x, y, initiative);
    }

    public void treatment(Person person){
        int health = Person.random.nextInt(healthRegen + 1);
        if (person.currentHealth > 0 && person.currentHealth < person.maxHealth) {
            person.currentHealth = person.currentHealth + health;
            if (person.currentHealth > person.maxHealth){
                person.currentHealth = person.maxHealth;
            }
        }
    }

    @Override
    public String toString() {
        return "имя " + name + " (здоровье: " + currentHealth + ")";
    }

    @Override
    public void step(List<Person> enemyTeam, List<Person> alliedTeam) {
        if(this.currentHealth == 0) return;
        treatment(getNearestLivingEnemy(alliedTeam));
    }
}
