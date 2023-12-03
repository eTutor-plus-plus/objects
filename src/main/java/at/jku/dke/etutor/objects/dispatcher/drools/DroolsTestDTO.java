package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsTestDTO {
    private int taskID;
    private String testInputClassname;
    private String testExpectedOutput;

    public DroolsTestDTO() {
    }

    public DroolsTestDTO(int taskID, String testInputClassname, String testExpectedOutput) {
        this.taskID = taskID;
        this.testInputClassname = testInputClassname;
        this.testExpectedOutput = testExpectedOutput;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTestInputClassname() {
        return testInputClassname;
    }

    public void setTestInputClassname(String testInputClassname) {
        this.testInputClassname = testInputClassname;
    }

    public String getTestExpectedOutput() {
        return testExpectedOutput;
    }

    public void setTestExpectedOutput(String testExpectedOutput) {
        this.testExpectedOutput = testExpectedOutput;
    }
}
