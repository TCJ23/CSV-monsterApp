package monster;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CSV {

    public static void main(String[] args) throws IOException {

        //Path path = Paths.get("monsters.csv");
        //take user input if -g -> 2 parameters
        //Integer monsterNumber = Integer.parseInt(args[0]);

        if (args[0].equals("-g")) {
            Integer monsterNumber = Integer.parseInt(args[1]);
            Path path = Paths.get(args[2]);
            List<Monster> monsters2String = MonsterGenerator.generateMonsters(monsterNumber);
            Files.write(path, Serialization.monsterToCSV(monsters2String).getBytes());
        } else if (args[0].equals("-l")) {
            Path path = Paths.get(args[1]);
            String csvFileContent = new String(Files.readAllBytes(path));
            Serialization.monsterFromCSV(csvFileContent);
        } else if (args[0].equals("-m")) {
            Path path = Paths.get(args[1]);
            List<String> allLines = Files.readAllLines(path);
            List<String> monsterlines = allLines.subList(1, allLines.size());
//            List<Integer> healths = new ArrayList<>();
            List<Monster> monsterki = new ArrayList<>();
            for (String monsterline : monsterlines) {
                String[] field = monsterline.split(",");
                Monster monster = new Monster(Integer.parseInt(field[0]), Integer.parseInt(field[2]), Integer.parseInt(field[3]), field[1] );
//                healths.add(Integer.parseInt(field[2]));
                monsterki.add(monster);
            }
            //funkcjonalne interfejsy
            monsterki.sort(((o1, o2) -> o1.getHealth() - o2.getHealth()));
            Collections.reverse(monsterki);
//            monsterki.stream().sorted((o1, o2) -> o1.getHealth() - o2.getHealth());
//            monsterki.sort(new Comparator<Monster>() {
//                @Override
//                public int compare(Monster o1, Monster o2) {
//                    return 0;
//                }
//            });
//            monsterki.sort(new Comparator<Monster>() {
//                @Override
//                public int compare(Monster o1, Monster o2) {
//                    return o1.getHealth() - o2.getHealth();
//                }
//            });
            System.out.println(monsterki.get(0));

//            new Monster()
        }
    }
}

//                        (new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o1 - o2;
//                    }
//                });
//            Integer strongestMonster = healths.get(healths.size() -1);
//        Path path = Paths.get("monster.csv");
//        List<String> allLines = Files.readAllLines(path);
//        List<String> monsterLines = allLines.subList(1, allLines.size());
//        List<Integer> healths = new ArrayList<>();
//
//        for (String line : monsterLines) {
//            System.out.println(line);
//            String[] fields = line.split(",");
//            healths.add(Integer.parseInt(fields[2]));
//        }
//
//        healths.sort(new IntegerComparator());
//        System.out.println(healths);
//
//    }
//}
////    generate list of monsters accordingly to #of User input
//        for (monster monster : monster.MonsterGenerator.generateMonsters(100)) {
//            System.out.println(monster);
//
//    static final String fileContent = "id,name,health, damage\n" +
//            "1,pokemon,10,50\n" +
//            "1,pokemon1,10000,500\n" +
//            "1,pokemon2,90,10\n";
//
//    public static void main(String[] args) throws IOException {
//
//        Path path = Paths.get("monster.csv");
//        File file = new File("monster.csv");
//
//
//      Files.write(path, fileContent.getBytes());
//
//        Random random = new Random();
//
//
//        System.out.println(random.nextInt(50));
//        System.out.println(random.nextInt(50));
//        System.out.println(random.nextInt(50));
//
//    }
//

