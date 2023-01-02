package at.jku.dke.etutor.objects.dispatcher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GradingDTO {
    /**
     * The id identifying the submission
     */
    private String submissionId;

    /**
     * The points achieved
     */
    private double points;

    /**
     * The maxPoints
     */
    private double maxPoints;

    /**
     * The result
     */
    private String result;

    private ReportDTO report;

    public GradingDTO() {
    }

    public GradingDTO(String submissionId, double points, double maxPoints) {
        this.points = points;
        this.maxPoints = maxPoints;
        this.submissionId = submissionId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ReportDTO getReport() {
        return report;
    }

    public void setReport(ReportDTO report) {
        this.report = report;
    }
}
