package persons;

import java.util.ArrayList;
import java.util.List;
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
    protected PersonPosition personPosition;

    static {
        Person.random = new Random();
    }

    public Person(String name, boolean isMovable,
            boolean isMelee, boolean isMilitary, int maxHealth,
            int currentHealth, int[] damage, int x, int y) {
        this.name = name;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.damage = damage;
        this.personPosition = new PersonPosition(x, y);
    }

    public void getDamage(int damage) {
        if (this.currentHealth - damage > 0) {
            this.currentHealth -= damage;
        }
        else{
            this.currentHealth = 0;
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

    public void outputDistanceToEnemy(List<Person> persons){
        for(Person person: persons){
            System.out.print(person.personPosition.getDistance(personPosition) + ", ");
        }
        //persons.forEach(n->System.out.print(this.positionPerson.distance(n.positionPerson) + ", "));
        System.out.println();
    }

    public float[] getDistanceToEnemy(List<Person> persons){
        float[] distansToEnemy = new float[persons.size()];
        for(int i = 0; i < persons.size(); i ++){
            distansToEnemy[i] = persons.get(i).personPosition.getDistance(personPosition);
        }
        return distansToEnemy;
    }
}
