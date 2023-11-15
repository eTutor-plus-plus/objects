package at.jku.dke.etutor.objects.dispatcher.ddl;

public class DDLExerciseDTO {
    private String solution;
    private String insertStatements;
    private String tablePoints;
    private String columnPoints;
    private String primaryKeyPoints;
    private String foreignKeyPoints;
    private String constraintPoints;

    public DDLExerciseDTO(String solution, String insertStatements, String tablePoints, String columnPoints, String primaryKeyPoints, String foreignKeyPoints, String constraintPoints) {
        this.solution = solution;
        this.insertStatements = insertStatements;
        this.tablePoints = tablePoints;
        this.columnPoints = columnPoints;
        this.primaryKeyPoints = primaryKeyPoints;
        this.foreignKeyPoints = foreignKeyPoints;
        this.constraintPoints = constraintPoints;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getInsertStatements() {
        return insertStatements;
    }

    public void setInsertStatements(String insertStatements) {
        this.insertStatements = insertStatements;
    }

    public String getTablePoints() {
        return tablePoints;
    }

    public void setTablePoints(String tablePoints) {
        this.tablePoints = tablePoints;
    }

    public String getColumnPoints() {
        return columnPoints;
    }

    public void setColumnPoints(String columnPoints) {
        this.columnPoints = columnPoints;
    }

    public String getPrimaryKeyPoints() {
        return primaryKeyPoints;
    }

    public void setPrimaryKeyPoints(String primaryKeyPoints) {
        this.primaryKeyPoints = primaryKeyPoints;
    }

    public String getForeignKeyPoints() {
        return foreignKeyPoints;
    }

    public void setForeignKeyPoints(String foreignKeyPoints) {
        this.foreignKeyPoints = foreignKeyPoints;
    }

    public String getConstraintPoints() {
        return constraintPoints;
    }

    public void setConstraintPoints(String constraintPoints) {
        this.constraintPoints = constraintPoints;
    }
}
