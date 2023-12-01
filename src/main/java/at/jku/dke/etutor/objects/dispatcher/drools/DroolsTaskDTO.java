package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String solution;
    private String maxPoints;

    public DroolsTaskDTO(){

    }

    public DroolsTaskDTO(String solution, String maxPoints) {
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
}


