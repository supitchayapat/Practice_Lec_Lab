public class Skill {
    private int level;
    private String type;

    public Skill(int level, String type) {
        this.level = level;
        if (type.matches("[pP][Aa][Ss][Ss][Ii][Vv][Ee]") || type.matches("[aA][Cc][Tt][Ii][Vv][Ee]")){
            this.type = type;
        }else{
            System.out.println("type skill error");
        }
    }

    public void increaseLevel(){
        level += 1;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }
}
