package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String solution;
    private int maxPoints;

    public DroolsTaskDTO(){

    }


    public DroolsTaskDTO(String solution, int maxPoints) {
        this.solution = solution;
        this.maxPoints = maxPoints;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }
}


