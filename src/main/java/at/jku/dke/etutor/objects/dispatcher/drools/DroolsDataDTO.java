package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsDataDTO {
    private int taskId;
    private String eventClazz;
    private String eventReferenceName;
    private String eventTimestamp;
    private String eventInstanceName;
    private String factClazz;
    private String factInstanceName;
    private String[] factParameters;
    private String testInputClassname;
    private String textExpectedOutput;
    private String classFullClassname;
    private String classContent;

    public DroolsDataDTO(int taskId, String eventClazz, String eventReferenceName, String eventTimestamp,
                         String eventInstanceName, String factClazz, String factInstanceName,
                         String[] factParameters, String testInputClassname, String textExpectedOutput,
                         String classFullClassname, String classContent) {
        this.taskId = taskId;
        this.eventClazz = eventClazz;
        this.eventReferenceName = eventReferenceName;
        this.eventTimestamp = eventTimestamp;
        this.eventInstanceName = eventInstanceName;
        this.factClazz = factClazz;
        this.factInstanceName = factInstanceName;
        this.factParameters = factParameters;
        this.testInputClassname = testInputClassname;
        this.textExpectedOutput = textExpectedOutput;
        this.classFullClassname = classFullClassname;
        this.classContent = classContent;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getEventClazz() {
        return eventClazz;
    }

    public void setEventClazz(String eventClazz) {
        this.eventClazz = eventClazz;
    }

    public String getEventReferenceName() {
        return eventReferenceName;
    }

    public void setEventReferenceName(String eventReferenceName) {
        this.eventReferenceName = eventReferenceName;
    }

    public String getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public String getEventInstanceName() {
        return eventInstanceName;
    }

    public void setEventInstanceName(String eventInstanceName) {
        this.eventInstanceName = eventInstanceName;
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

    public String getTestInputClassname() {
        return testInputClassname;
    }

    public void setTestInputClassname(String testInputClassname) {
        this.testInputClassname = testInputClassname;
    }

    public String getTextExpectedOutput() {
        return textExpectedOutput;
    }

    public void setTextExpectedOutput(String textExpectedOutput) {
        this.textExpectedOutput = textExpectedOutput;
    }

    public String getClassFullClassname() {
        return classFullClassname;
    }

    public void setClassFullClassname(String classFullClassname) {
        this.classFullClassname = classFullClassname;
    }

    public String getClassContent() {
        return classContent;
    }

    public void setClassContent(String classContent) {
        this.classContent = classContent;
    }
}
