package at.jku.dke.etutor.objects.dispatcher.drools;

public class DroolsEventDTO {
    private int taskID;
    private String eventClazz;
    private String eventReferenceName;
    private String eventTimestamp;
    private String eventInstanceName;

    public DroolsEventDTO() {
    }

    public DroolsEventDTO(int taskID, String eventClazz, String eventReferenceName, String eventTimestamp, String eventInstanceName) {
        this.taskID = taskID;
        this.eventClazz = eventClazz;
        this.eventReferenceName = eventReferenceName;
        this.eventTimestamp = eventTimestamp;
        this.eventInstanceName = eventInstanceName;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
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
}
