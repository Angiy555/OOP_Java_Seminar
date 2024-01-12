package persons.abstracts;

public abstract class Infantrymen extends Person{

    protected int currentArmor;

    public Infantrymen(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y, int initiative){
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, damage, x, y, initiative);
    }

    public void attack(Person person) {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];
        person.getDamage(damage);
    }

    @Override
    public void getDamage(int damage) {
        if (this.currentArmor - damage > 0) {
            this.currentArmor -= damage;
        }
        else if(this.currentHealth - (damage - this.currentArmor) > 0){
            this.currentHealth = this.currentHealth - (damage - this.currentArmor);
        }
        else{
            this.currentHealth = 0;
        }
    }

    @Override
    public String toString() {
        return "имя " + name + " (здоровье: " + currentHealth
        + ", максимальный домаг: " + damage[1] + ", броня: "
        + currentArmor + ", позиция: (" + personPosition.getX()
        + ", " + personPosition.getY() + "))";
    }
}
