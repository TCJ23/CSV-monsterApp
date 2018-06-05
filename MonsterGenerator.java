package monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterGenerator {

    public static List<Monster> generateMonsters(final int numMonst){
        List<Monster> potwory = new ArrayList<Monster>();
        Random random = new Random();
        for (int i = 0; i < numMonst ; i++) {
            int health = random.nextInt(10000-99) + 100;
            int damage = random.nextInt(1000) + 1;
            String name = "monster - " + i;
            Monster singleMonster = new Monster(i,health,damage,name);
            potwory.add(singleMonster);
        }
        return potwory;
    }
}
