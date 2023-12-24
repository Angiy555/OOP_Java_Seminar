import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import persons.*;

public class Main {
    public static void main(String[] args) {
        List<Person> gamePersons = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int pers = rnd.nextInt(7);
            switch (pers) {
                case 0:
                    gamePersons.add(new Archer(getName()));
                    break;
                case 1:
                    gamePersons.add(new Monk(getName()));
                    break;
                case 2:
                    gamePersons.add(new Robber(getName()));
                    break;
                case 3:
                    gamePersons.add(new Sniper(getName()));
                    break;
                case 4:
                    gamePersons.add(new Sorcerer(getName()));
                    break;
                case 5:
                    gamePersons.add(new Villager(getName()));
                    break;
                case 6:
                    gamePersons.add(new Spearman(getName()));
                    break;
            }
        }
        gamePersons.forEach(System.out::println);
    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }
}