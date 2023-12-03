package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsClassDTO {
    private int taskID;
    private String classFullClassname;
    private String classContent;

    public DroolsClassDTO(int taskID, String classFullClassname, String classContent) {
        this.taskID = taskID;
        this.classFullClassname = classFullClassname;
        this.classContent = classContent;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
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
