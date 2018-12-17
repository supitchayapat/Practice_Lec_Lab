import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Plan plan442 = new Plan442();
        Plan plan433 = new Plan433();
        Plan plan451 = new Plan451();
        Plan plan343 = new Plan343();
        Scanner in = new Scanner(System.in);
        String planText;
        System.out.println("select your plan ex. 4-4-2 or type 'exit' to closed program");
        while(!(planText = in.nextLine()).matches("exit")){
            if (planText.equals("4-4-2")){
                game.setPlan(plan442);
            }else if (planText.equals("4-3-3")){
                game.setPlan(plan433);
            }else if (planText.equals("4-5-1")){
                game.setPlan(plan451);
            }else if (planText.equals("3-4-3")){
                game.setPlan(plan343);
            }else{
                System.err.println("Wrong plan !!");
            }
            System.out.println("select your plan (ex. 4-4-2) or type 'exit' to closed program");
        }
    }
}
