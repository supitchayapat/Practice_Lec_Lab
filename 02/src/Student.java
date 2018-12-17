public class Student extends Person{
    private String id;
    private double score;

    public Student(String name, String id) {
        super(name);
        this.id = id;
    }

    public void addScore(double score) {
        if (score < 0)
            throw new IllegalArgumentException("Score must be positive");
        if (score > 0)
            this.score += score;
    }

    public double getScore() {
        return score;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", score=" + score +
                ", name=" + super.toString() +
                "}";
    }
}
