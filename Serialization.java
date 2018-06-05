package monster;

import monster.Monster;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Serialization {

    Path path = Paths.get("monster.csv");

    public static String monsterToCSV(List<Monster> mnstlist){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id,Name,Health,Damage");
        stringBuilder.append("\n");
        for (int i = 0; i <mnstlist.size() ; i++) {
            stringBuilder.append(mnstlist.get(i).getId());
            stringBuilder.append(",");
            stringBuilder.append(mnstlist.get(i).getName());
            stringBuilder.append(",");
            stringBuilder.append(mnstlist.get(i).getHealth());
            stringBuilder.append(",");
            stringBuilder.append(mnstlist.get(i).getDamage());
            stringBuilder.append("\n");
        }
         return stringBuilder.toString();
    }

    public static List<Monster> monsterFromCSV(String monsterki){
        List<String> splitter = Arrays.asList(monsterki.split("\n"));
        List<String> getAllLines = splitter.subList(1,splitter.size());
        List<Monster> monsters = new ArrayList<>();
        for (String line : getAllLines) {
            String[] pole = line.split(",");
            Integer idMonster = Integer.parseInt(pole[0]);
            String nameMonster = pole[1];
            Integer healthMnst = Integer.parseInt(pole[2]);
            Integer damageMnst = Integer.parseInt(pole[3]);
            Monster monster = new Monster(idMonster,healthMnst,damageMnst,nameMonster);
            monsters.add(monster);
        }
        return monsters;
    }

    //take user input for number of monsters

    //parse list to a string
    //save string to csv
}
