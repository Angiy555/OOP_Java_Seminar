package persons;

public class Monk extends Person{
    private int maxProtection;
    private int currentProtection;
    private int healthRegen;

    public Monk(String name){
        super(name,
        true,
        false,
        true,
        100,        
        100,        
        new int[]{5, 15});

        this.maxProtection = 20;
        this.currentProtection = 20;
        this.healthRegen = 5;
    }

    public int attack() {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];        
        return damage;
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
        else{
            this.currentHealth = this.currentHealth - (this.currentProtection - damage);
        }
    }

    @Override
    public String toString() {
        return "Монах: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", защита: " 
        + currentProtection + ", лечение: " + healthRegen + ")";
    }
}
