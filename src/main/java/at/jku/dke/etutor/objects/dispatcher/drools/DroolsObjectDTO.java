package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsObjectDTO {
    private int objectId;
    private String parameter;
    private String submissionType;
    private String fullClassname;
    private String dataType;
    private int taskId;

    public DroolsObjectDTO() {
    }

    public DroolsObjectDTO(int objectId, String parameter, String submissionType, String fullClassname, String dataType, int taskId) {
        this.objectId = objectId;
        this.parameter = parameter;
        this.submissionType = submissionType;
        this.fullClassname = fullClassname;
        this.dataType = dataType;
        this.taskId = taskId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public String getFullClassname() {
        return fullClassname;
    }

    public void setFullClassname(String fullClassname) {
        this.fullClassname = fullClassname;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}