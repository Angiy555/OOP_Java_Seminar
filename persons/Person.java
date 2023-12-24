package persons;

import java.util.Random;

/*
    * name             - имя
    * isMovable        - подвижен
    * isMelee          - предназначен для ближнего боя
    * ismilitary       - является военным
    * maxHealth        - максимальное здоровье
    * currentHealth    - текущее здоровье    
    * damage            -повреждение
 */
public abstract class Person {

    protected static Random random;

    protected String name;
    protected boolean isMovable;
    protected boolean isMelee;
    protected boolean isMilitary;
    protected int maxHealth;
    protected int currentHealth;        
    protected int[] damage;

    static {        
        Person.random = new Random();
    }

    public Person(String name, boolean isMovable, 
            boolean isMelee, boolean isMilitary, int maxHealth, 
            int currentHealth, int[] damage) {
        this.name = name;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;         
        this.damage = damage;
    }

    public void getDamage(int damage) {
        if (this.currentHealth - damage > 0) {
            this.currentHealth -= damage;
        }
    }

    public void healedHealth(int health){
        if(this.currentHealth + health > this.maxHealth){
            this.currentHealth = this.maxHealth;
        }
        else{
            this.currentHealth = this.currentHealth + health;
        }
    }
}
