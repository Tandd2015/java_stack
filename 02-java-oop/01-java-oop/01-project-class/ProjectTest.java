public class ProjectTest {
    public static void main(String[] args){
        Project project3 = new Project("Project 3","Description 3",33.33);
        // Project project1 = new Project("Project 1", "Description 1");
        // Project project2 = new Project();
        // project1.elevatorPitch();
        // project2.elevatorPitch();
        project3.elevatorPitch();

        Portfolio portfolio1 = new Portfolio();
        // portfolio1.setPortfolio(project1);
        // portfolio1.setPortfolio(project2);
        portfolio1.setPortfolio(project3);
        portfolio1.setPortfolio(project3);
        portfolio1.showPortfolio();
    }
}