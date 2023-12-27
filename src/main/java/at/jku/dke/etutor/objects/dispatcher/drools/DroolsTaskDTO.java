package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String solution;
    private int maxPoints;
    private String classes;
    private String objects;


    public DroolsTaskDTO(){

    }

    public DroolsTaskDTO(String solution, int maxPoints, String classes, String objects) {
        this.solution = solution;
        this.maxPoints = maxPoints;
        this.classes = classes;
        this.objects = objects;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
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


