import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    private Student studentA;
    private Student studentB;
    private Classroom classroom;

    @BeforeEach
    void init() {
        classroom = new Classroom();
        studentA = new Student("Mike", "5810402123");
        studentB = new Student("Mouse", "5810401234");
        studentA.addScore(10);
        studentB.addScore(30);
    }

    @Test
    @DisplayName("addStudent(student)")
    void addStudent_ShouldSizeClassroomIncrease_whenCall() {
        classroom.addStudent(studentA);
        assertEquals(1, classroom.size());
        classroom.addStudent(studentB);
        assertEquals(2, classroom.size());
    }

    @Test
    @DisplayName("size()")
    void size_ShouldReturnZero_WhenNotAddStudent() {
        assertEquals(0, classroom.size());
    }


    @Test
    @DisplayName("totalScore()")
    void totalScore_ShouldReturnTotalScoreInCollection_WhenCall() {
        classroom.addStudent(studentA);
        classroom.addStudent(studentB);
        assertEquals(40, classroom.totalScore());
    }

    @Test
    @DisplayName("averageScore()")
    void averageScore_ShouldReturnAvgScoreInCollection_WhenCall() {
        classroom.addStudent(studentA);
        classroom.addStudent(studentB);
        assertEquals(20, classroom.averageScore());
    }

    @Test
    @DisplayName("getScoreById(id)")
    void getScoreById_ShouldReturnScore_WhenFoundId() {
        classroom.addStudent(studentB);
        assertEquals(30, classroom.getScoreById("5810401234"));
    }

    @Test
    @DisplayName("addScoreById(id,score)")
    void addScoreById_ShouldStudentInClassroomHasScore_WhenCall() {
        classroom.addStudent(studentA);
        classroom.addScoreById("5810402123", 20);
        assertEquals(30, classroom.getScoreById("5810402123"));
    }

    @Test
    @DisplayName("getScoreByIdNotFoundID")
    void getScoreById_ShouldThrowsException_WhenNotFoundId() {
        classroom.addStudent(studentB);
        classroom.addStudent(studentA);
        try {
            classroom.getScoreById("5810402123");
        } catch (IllegalArgumentException ignored) {

        }
        assertEquals(10, classroom.getScoreById("5810402123"));
        try {
            classroom.getScoreById("5810401341");
        } catch (IllegalArgumentException ignored) {

        }
    }

    @Test
    @DisplayName("addScoreByIdNotFoundID")
    void addScoreById_ShouldThrowsException_WhenNotFoundId() {
        classroom.addStudent(studentB);
        classroom.addStudent(studentA);
        try {
            classroom.addScoreById("5810401234", 20);
        } catch (IllegalArgumentException ignored) {

        }
        assertEquals(50, classroom.getScoreById("5810401234"));
        try {
            classroom.getScoreById("5810401341");
        } catch (IllegalArgumentException ignored) {

        }
    }

}