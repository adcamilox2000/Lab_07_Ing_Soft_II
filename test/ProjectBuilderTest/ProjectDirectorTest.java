package ProjectBuilderTest;

import ProjectBuilder.Project;
import ProjectBuilder.ProjectDirector;
import ProjectBuilder.SoftwareProjectBuilder;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author adcam
 */
public class ProjectDirectorTest {
    @Test
    public void testProjectDirector() {
        ProjectDirector director = new ProjectDirector();
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        director.setBuilder(builder);

        Project project = director.buildProject(
            "AI System", "AI Corp", 
            List.of("Machine Learning", "Neural Networks"), 
            List.of("Python", "TensorFlow"), 5
        );

        assertEquals("AI System", project.getName());
        assertEquals("AI Corp", project.getCompany());
        assertEquals(5, project.getNumStudents());
        assertEquals("Alta", project.getDifficulty());
    }
}
