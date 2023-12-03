package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsFactDTO {
    private int taskID;
    private String factClazz;
    private String factInstanceName;
    private String[] factParameters;

    public DroolsFactDTO(int taskID, String factClazz, String factInstanceName, String[] factParameters) {
        this.taskID = taskID;
        this.factClazz = factClazz;
        this.factInstanceName = factInstanceName;
        this.factParameters = factParameters;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getFactClazz() {
        return factClazz;
    }

    public void setFactClazz(String factClazz) {
        this.factClazz = factClazz;
    }

    public String getFactInstanceName() {
        return factInstanceName;
    }

    public void setFactInstanceName(String factInstanceName) {
        this.factInstanceName = factInstanceName;
    }

    public String[] getFactParameters() {
        return factParameters;
    }

    public void setFactParameters(String[] factParameters) {
        this.factParameters = factParameters;
    }
}
