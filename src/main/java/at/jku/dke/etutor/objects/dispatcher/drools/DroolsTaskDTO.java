package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTaskDTO {
    private String solution;
    private int maxPoints;
    private Object[] classes;
    private String objects;
    private String diagnoseOutput;
    private String submissionOutput;


    public DroolsTaskDTO(){

    }

    public DroolsTaskDTO(String solution, int maxPoints, Object[] classes, String objects) {
        this.solution = solution;
        this.maxPoints = maxPoints;
        this.classes = classes;
        this.objects = objects;
    }

    public Object[] getClasses() {
        return classes;
    }

    public void setClasses(Object[] classes) {
        this.classes = classes;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    public String getDiagnoseOutput() {
        return diagnoseOutput;
    }

    public void setDiagnoseOutput(String diagnoseOutput) {
        this.diagnoseOutput = diagnoseOutput;
    }

    public String getSubmissionOutput() {
        return submissionOutput;
    }

    public void setSubmissionOutput(String submissionOutput) {
        this.submissionOutput = submissionOutput;
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


