package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String id;
    private String solution;
    private String maxPoints;

    public DroolsTaskDTO(){

    }

    public DroolsTaskDTO(String id, String solution, String maxPoints) {
        this.id = id;
        this.solution = solution;
        this.maxPoints = maxPoints;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(String maxPoints) {
        this.maxPoints = maxPoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


