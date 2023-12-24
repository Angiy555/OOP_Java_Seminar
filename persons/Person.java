package persons;
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
    protected String name;
    protected boolean isMovable;
    protected boolean isMelee;
    protected boolean isMilitary;
    protected int maxHealth;
    protected int currentHealth;        
    protected int[] damage;

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
}
