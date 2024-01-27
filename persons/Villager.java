package persons;

import java.util.ArrayList;
import java.util.List;

import persons.abstracts.*;

public class Villager extends Person{
    private int carriesArrows;
    private boolean isReady;

    public Villager(String name, int x, int y){
        super(name,
        false,
        false,
        false,
        100,
        100,
        new int[]{0, 0},
        x,
        y,
        0);

        this.carriesArrows = 1;
        isReady = true;
    }

    public boolean getIsReady(){
        return isReady;
    }

    public void setIsReady(boolean r){
        isReady = r;
    }

    public void supplyArrows(Person person){
        if(person == null) return;
        if(((Shooter)person).getCurrentArrows() < ((Shooter)person).getMaxArrows()){
            ((Shooter)person).setCurrentArrows(((Shooter)person).getCurrentArrows() + 1);
        }
    }

    @Override
    public Person getNearestLivingEnemy(List<Person> persons) {
        List<Shooter> personShooters = new ArrayList<>();
        for(Person person: persons){
            if(person instanceof Shooter && person.getHp() > 0){
                personShooters.add((Shooter)person);
            }
        }
        Shooter nearestEnemy = null;
        if(!personShooters.isEmpty()){
            nearestEnemy = personShooters.get(0);
            float minDistanc = personShooters.get(0).getPersonPosition().getDistance(personPosition);
            for(int i = 1; i < personShooters.size(); i ++){
                float distance = personShooters.get(i).getPersonPosition().getDistance(personPosition);
                if(distance < minDistanc && personShooters.get(i).getHp() > 0){
                    minDistanc = distance;
                    nearestEnemy = personShooters.get(i);
                }
            }
        }
        return nearestEnemy;
    }

    @Override
    public String toString() {
        return "Крестьянин: имя " + name + " (здоровье: " + currentHealth + ")";
    }

    @Override
    public String getInfo() {
        String result = "Крестьянин";
        return result;
    }

    @Override
    public void step(List<Person> enemyTeam, List<Person> alliedTeam) {
        if(this.currentHealth == 0) return;
        isReady = true;
    }

    @Override
    public String getType() {
        return "Крестьянин";
    }
}
