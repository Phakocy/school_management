import com.model.Applicant;
import com.model.Principal;
import com.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalTest {

    Principal principal = new Principal("Lasmock", "Buhari", "Bubu", "Male");

    @Test
    public void admitApplicantTrue() {

        Applicant applicant = new Applicant(null, "yahaya",
                "Ebuka", "male", 20, 50);

        boolean admitted = principal.admitApplicant(applicant);

        Assertions.assertTrue(admitted);

    }

    @Test
    public void admitApplicantFalse() {

        Applicant applicant = new Applicant(null, "yahaya",
                "Ebuka", "male", 20, 40);

        boolean notAdmitted = principal.admitApplicant(applicant);

        Assertions.assertTrue(notAdmitted);

    }

    @Test
    public void expelStudentTrue() {

        Student student = new Student("LASMOCK", "Christiano", "Ronaldo", "Male", 001, "java");
        student.setFvckUp(true);

        boolean expelStudent = principal.expelStudent(student);

        Assertions.assertTrue(expelStudent);

    }

    @Test
    public void expelStudentFalse() {

        Student student = new Student("LASMOCK", "Christiano", "Ronaldo", "Male", 001, "java");
        student.setFvckUp(false);

        boolean expelStudent = principal.expelStudent(student);

        Assertions.assertTrue(expelStudent);

    }

}
