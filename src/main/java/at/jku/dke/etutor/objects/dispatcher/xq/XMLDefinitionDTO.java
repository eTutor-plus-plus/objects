package at.jku.dke.etutor.objects.dispatcher.xq;

public class XMLDefinitionDTO {
    private String diagnoseXML;
    private String submissionXML;

    public XMLDefinitionDTO(){

    }

    public XMLDefinitionDTO(String diagnoseXML, String submissionXML){
        this.diagnoseXML = diagnoseXML;
        this.submissionXML = submissionXML;
    }

    public String getDiagnoseXML() {
        return diagnoseXML;
    }

    public void setDiagnoseXML(String diagnoseXML) {
        this.diagnoseXML = diagnoseXML;
    }

    public String getSubmissionXML() {
        return submissionXML;
    }

    public void setSubmissionXML(String submissionXML) {
        this.submissionXML = submissionXML;
    }
}
