public class Player {
    private String name;
    private int shirt;
    private String role;

    public Player(String name, int shirt, String position) {
        this.name = name;
        this.shirt = shirt;
        this.role = position;
    }

    public String getName() {
        return name;
    }

    public int getShirt() {
        return shirt;
    }

    @Override
    public String toString() {
        return name + '\t';
    }
}
