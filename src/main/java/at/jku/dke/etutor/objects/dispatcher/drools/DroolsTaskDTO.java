package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String solution;
    private int maxPoints;
    private String classes;
    private String objects;
    private int errorWeighting;
    private String validationClassname;


    public DroolsTaskDTO(){

    }

    public DroolsTaskDTO(String solution, int maxPoints, String classes, String objects, int errorWeighting, String validationClassname) {
        this.solution = solution;
        this.maxPoints = maxPoints;
        this.classes = classes;
        this.objects = objects;
        this.errorWeighting = errorWeighting;
        this.validationClassname = validationClassname;
    }

    public String getValidationClassname() {
        return validationClassname;
    }

    public void setValidationClassname(String validationClassname) {
        this.validationClassname = validationClassname;
    }

    public int getErrorWeighting() {
        return errorWeighting;
    }

    public void setErrorWeighting(int errorWeighting) {
        this.errorWeighting = errorWeighting;
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


