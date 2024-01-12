package persons.abstracts;

public abstract class Wizards extends Person{

    protected int currentProtection;
    protected int healthRegen;

    public Wizards(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y, int initiative){
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, damage, x, y, initiative);
    }

    public void attack(Person person) {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];
        person.getDamage(damage);
    }

    public int treatment(){
        int health = Person.random.nextInt(healthRegen + 1);
        return health;
    }

    @Override
    public void getDamage(int damage) {
        if (this.currentProtection - damage > 0) {
            this.currentProtection -= damage;
        }
        else if(this.currentHealth - (damage - this.currentProtection) > 0){
            this.currentHealth = this.currentHealth - (damage - this.currentProtection);
        }
        else{
            this.currentHealth = 0;
        }
    }

    @Override
    public String toString() {
        return "имя " + name + " (здоровье: " + currentHealth
        + ", максимальный домаг: " + damage[1] + ", защита: "
        + currentProtection + ", лечение: " + healthRegen + ", позиция: (" + personPosition.getX()
        + ", " + personPosition.getY() + "))";
    }
}
