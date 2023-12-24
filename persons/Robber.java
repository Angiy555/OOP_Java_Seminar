package persons;

public class Robber extends Person{
    private int maxArmor;
    private int currentArmor;

    public Robber(String name){
        super(name,
        true,
        false,
        true,
        100,        
        100,        
        new int[]{10, 13});

        this.maxArmor = 100;
        this.currentArmor = 100;
    }

    public int attack() {
        int damage = Person.random.nextInt(this.damage[1] - this.damage[0] + 1) + this.damage[0];        
        return damage;
    }

    @Override
    public void getDamage(int damage) {
        if (this.currentArmor - damage > 0) {
            this.currentArmor -= damage;
        }
        else{
            this.currentHealth = this.currentHealth - (this.currentArmor - damage);
        }
    }

    @Override
    public String toString() {
        return "Грабитель: имя " + name + " (здоровье: " + currentHealth 
        + ", максимальный домаг: " + damage[1] + ", броня: " 
        + currentArmor + ")";
    }
}
