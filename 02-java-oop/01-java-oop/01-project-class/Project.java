public class Project {
    // private String name;
    // private String description;
    private String gotName;
    private Double initialCost;
    private String gotDescription;


    // getter
    public String getName() {
        return gotName;
    }
    // setter
    public void setName(String name) {
        this.gotName = name;
    }

    // getter 
    public String getDescription() {
        return gotDescription;
    }
    // setter
    public void setDescription(String description) {
        this.gotDescription = description;
    }

    //getter
    public Double getInitialCost() {
        return initialCost;
    }
    // setter
    public void setInitialCost(Double cost){
        this.initialCost = cost;
    }

    public Project() {
        // this.name = "No Name";
        // this.description = "No Description";
        this.initialCost = 33.33;
    }
    public Project(String name) {
        this.gotName = name;
    }

    public Project(String name, String description) {
        this.gotName = name;
        this.gotDescription = description;
    }

    public Project(String name, String description, Double cost) {
        this.gotName = name;
        this.gotDescription = description;
        this.initialCost = cost;
    }

    public void elevatorPitch() {
        System.out.println("Project Name: " + this.gotName + ", Project Intial Cost: " + this.initialCost + ", Project Description: " + this.gotDescription);
    }
}