package persons;

public class Sorcerer extends Person{
    private int maxProtection;
    private int currentProtection;
    private int healthRegen;

    public Sorcerer(String name, int x, int y){
        super(name,
        false,
        false,
        true,
        100,
        100,
        new int[]{10, 13},
        x,
        y);

        this.maxProtection = 20;
        this.currentProtection = 20;
        this.healthRegen = 5;
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
        return "Колдун: имя " + name + " (здоровье: " + currentHealth
        + ", максимальный домаг: " + damage[1] + ", защита: "
        + currentProtection + ", лечение: " + healthRegen + ", позиция: (" + personPosition.x
        + ", " + personPosition.y + "))";
    }
}
