import java.util.ArrayList;

public class Portfolio {
    public ArrayList<Project> projectsDirectory;
    
    public Portfolio() {
        this.projectsDirectory = new ArrayList<Project>();
    }

    // getter
    public String getPortfolio() {
        return projectsDirectory.toString();
    }
    // setter
    public void setPortfolio(Project addedProject){
        projectsDirectory.add(addedProject);
    }

    public void showPortfolio() {
        double entireProfileTotal = 0;
        for (Project addProject : projectsDirectory) {
            addProject.elevatorPitch();
            entireProfileTotal += addProject.getInitialCost();
        }
        System.out.println(String.format("Entire Portfolio Cost: %f", entireProfileTotal));
    }
}