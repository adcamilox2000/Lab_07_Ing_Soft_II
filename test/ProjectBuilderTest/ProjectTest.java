package ProjectBuilderTest;

import ProjectBuilder.Project;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author adcam
 */
public class ProjectTest {
    @Test
    public void testProjectCreation() {
        Project project = new Project(
            "Test Project", "Test Company", 
            List.of("Req1", "Req2"), 
            List.of("Tech1", "Tech2"), 
            3, "Baja"
        );

        assertEquals("Test Project", project.getName());
        assertEquals("Test Company", project.getCompany());
        assertEquals(3, project.getNumStudents());
        assertEquals("Baja", project.getDifficulty());
    }
}
