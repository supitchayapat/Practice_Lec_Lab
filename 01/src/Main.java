public class Main {
    public static void main(String[] args) {

        MonsterBall masterBall = new MonsterBall("MasterBall",1,999,999,555);
        MonsterBall ultraBall = new MonsterBall("UltraBall",10,300,150,100);
        UsableItem potion = new UsableItem("Potion",50,30,15,10,0,0);
        Misc divineRapier = new Misc("DivineRapier",1,10000000);
        Skill reviveLife = new Skill(1,"active");
        Skill abc = new Skill(1,"Active");
        Skill cba = new Skill(1,"PASSIVE");

        GameCharacter rogueKnight = new GameCharacter("RogueKnight",500,300,150);
        System.out.println("-----New Character-----");
        System.out.println(rogueKnight.toString());

        System.out.println("-----Receive Items-----");
        rogueKnight.receiveItems(masterBall,10);
        rogueKnight.receiveItems(potion,100);
        rogueKnight.receiveItems(divineRapier,1);
        rogueKnight.receiveItems(ultraBall,5);

        System.out.println("-----Shopping Item-----");
        rogueKnight.buy(masterBall,1);
        rogueKnight.sell(potion,10);

        System.out.println("-----Use Item-----");
        rogueKnight.useItem(potion);

        System.out.println("-----Catch Monters-----");
        rogueKnight.catchBy(masterBall);
        rogueKnight.catchBy(ultraBall);

        System.out.println("-----Learn Skill-----");
        rogueKnight.learnSkill(reviveLife);
        rogueKnight.learnSkill(abc);
        rogueKnight.learnSkill(cba);
        rogueKnight.learnSkill(abc);

        System.out.println("-----Cast Spell-----");
        rogueKnight.castSpell(abc);
        rogueKnight.castSpell(cba);

        System.out.println("---------------------------------");
        System.out.println(rogueKnight.toString());

    }
}
