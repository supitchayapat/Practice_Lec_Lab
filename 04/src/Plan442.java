import java.util.ArrayList;
import java.util.Random;

public class Plan442 implements Plan {
    private Game game;
    private Random randomGenerator;
    private int randIndex;

    public Plan442() {
        game = new Game();
        game.run();
        randomGenerator = new Random();
    }

    @Override
    public void format() {
        ArrayList<Integer> indexList = new ArrayList<>();
        System.out.println("Forward Player");
        int i = 0;
        while (i < 2) {
            randIndex = randomGenerator.nextInt(game.getFW().size());
            if (!indexList.contains(game.getFW().get(randIndex).getShirt())) {
                System.out.print(game.getFW().get(randIndex));
                indexList.add(game.getFW().get(randIndex).getShirt());
                i++;
            }
        }
        System.out.println("\n" + "Midfield Player");
        i = 0;
        while (i < 4) {
            randIndex = randomGenerator.nextInt(game.getMF().size());
            if (!indexList.contains(game.getMF().get(randIndex).getShirt())) {
                System.out.print(game.getMF().get(randIndex));
                indexList.add(game.getMF().get(randIndex).getShirt());
                i++;
            }
        }
        System.out.println("\n" + "Defense Player");
        i = 0;
        while (i < 4) {
            randIndex = randomGenerator.nextInt(game.getDF().size());
            if (!indexList.contains(game.getDF().get(randIndex).getShirt())) {
                System.out.print(game.getDF().get(randIndex));
                indexList.add(game.getDF().get(randIndex).getShirt());
                i++;
            }
        }

        randIndex = randomGenerator.nextInt(game.getGK().size());
        System.out.println("\n" + "Goal Keeper");
        System.out.println(game.getGK().get(randIndex));
    }
}
