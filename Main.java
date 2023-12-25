import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import persons.*;

public class Main {
    public static void main(String[] args) {
        List<Person> teamA = creatingTeam(0);
        List<Person> teamB = creatingTeam(3);

        System.out.println();
        teamA.forEach(System.out::println);
        System.out.println();
        System.out.println("******************************");
        teamB.forEach(System.out::println);
        System.out.println();
    }

    static List<Person> creatingTeam(int personNmber){
        List<Person> gameTeam = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int creatPerson = random.nextInt(5 - 1) + 1 + personNmber;
            switch (creatPerson) {
                case 1:
                    gameTeam.add(new Archer(getName()));
                    break;
                case 2:
                    gameTeam.add(new Monk(getName()));
                    break;
                case 7:
                    gameTeam.add(new Robber(getName()));
                    break;
                case 5:
                    gameTeam.add(new Sniper(getName()));
                    break;
                case 6:
                    gameTeam.add(new Sorcerer(getName()));
                    break;
                case 4:
                    gameTeam.add(new Villager(getName()));
                    break;
                case 3:
                    gameTeam.add(new Spearman(getName()));
                    break;
            }
        }

        return gameTeam;        
    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }
}