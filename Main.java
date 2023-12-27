import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import persons.*;

public class Main {
    public static void main(String[] args) {
        //создание и расстановка команд
        List<Person> teamA = createTeam(0, 0);
        List<Person> teamB = createTeam(3, 9);

        System.out.println("Команда А:");
        teamA.forEach(System.out::println);
        System.out.println();
        System.out.println("******************************");

        System.out.println("Команда Б:");
        teamB.forEach(System.out::println);
        System.out.println();
        System.out.println("******************************");

        System.out.println("Расстояния между противниками:");
        for(Person person: teamA){
            person.outputDistanceToEnemy(teamB);
        }
        //teamA.forEach(n->n.outputDistanceToEnemy(teamB));

        System.out.println("");
        
        atakaArcher(teamA, teamB);

        System.out.println("Команда Б:");
        teamB.forEach(System.out::println);
        System.out.println();
        System.out.println("******************************");
    }

    static List<Person> createTeam(int personNumber, int y){
        List<Person> gameTeam = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int createPerson = random.nextInt(5 - 1) + 1 + personNumber;
            switch (createPerson) {
                case 1:
                    gameTeam.add(new Archer(getName(), i, y));
                    break;
                case 2:
                    gameTeam.add(new Monk(getName(), i, y));
                    break;
                case 7:
                    gameTeam.add(new Robber(getName(), i, y));
                    break;
                case 5:
                    gameTeam.add(new Sniper(getName(), i, y));
                    break;
                case 6:
                    gameTeam.add(new Sorcerer(getName(), i, y));
                    break;
                case 4:
                    gameTeam.add(new Villager(getName(), i, y));
                    break;
                case 3:
                    gameTeam.add(new Spearman(getName(), i, y));
                    break;
            }
        }

        return gameTeam;
    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }

    static void atakaArcher(List<Person> attackerTeam, List<Person> receivingDamageTeam){
        for(Person personTeamA: attackerTeam){
            if(personTeamA instanceof Archer){
                int indexPerson = 0;
                float[] distance = personTeamA.getDistanceToEnemy(receivingDamageTeam);
                float minDistanc = distance[0];

                for(int i = 0; i < distance.length; i ++){
                    if(distance[i] < minDistanc){
                        minDistanc = distance[i];
                        indexPerson = i;
                    }
                }

                ((Archer)personTeamA).attack(receivingDamageTeam.get(indexPerson));
            }
        }
    }
}