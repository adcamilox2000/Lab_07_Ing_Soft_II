package ProjectBuilderTest;


import ProjectBuilder.Project;
import ProjectBuilder.SoftwareProjectBuilder;
import ProjectBuilder.ProjectDirector;
import ProjectBuilder.SoftwareProjectBuilder;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adcam
 */
public class ProjectBuilderTest {
    @Test
    public void testSoftwareProjectBuilder() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildName("Software Project");
        builder.buildCompany("Tech Corp");
        builder.buildRequirements(List.of("Req1", "Req2"));
        builder.buildTechnologies(List.of("Java", "Spring"));
        builder.buildNumStudents(4);
        builder.buildDifficulty();
        Project project = builder.getProject();

        assertEquals("Software Project", project.getName());
        assertEquals("Tech Corp", project.getCompany());
        assertEquals(4, project.getNumStudents());
        assertEquals("Media", project.getDifficulty());
    }
}
