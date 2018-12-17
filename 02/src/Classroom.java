import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class Classroom {
    private Collection<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addScoreById(String id, double score) throws NoSuchElementException{
        for (Student i : students) {
            if (i.getId().equals(id)){
                i.addScore(score);
            }
        }
    }

    public double getScoreById(String id) throws NoSuchElementException{
        for (Student i : students) {
            if (i.getId().equals(id)){
                return i.getScore();
            }
        }
        return -1;
    }

    public double averageScore() {
        double sum=0;
        for (Student i : students ) {
            sum += i.getScore();
        }
        return sum/students.size();
    }

    public double totalScore() {
        double total = 0;
        for (Student i: students) {
            total += i.getScore();
        }
        return total;
    }

    public int size() {
        return students.size();
    }

}
