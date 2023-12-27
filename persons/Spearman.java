package persons;

public class Spearman extends Person{
    private int maxArmor;
    private int currentArmor;

    public Spearman(String name, int x, int y){
        super(name,
        true,
        true,
        true,
        100,
        100,
        new int[]{4, 6},
        x,
        y);

        this.maxArmor = 100;
        this.currentArmor = 100;
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
        return "Копейщик: имя " + name + " (здоровье: " + currentHealth
        + ", максимальный домаг: " + damage[1] + ", броня: "
        + currentArmor + ", позиция: (" + personPosition.x
        + ", " + personPosition.y + "))";
    }
}
