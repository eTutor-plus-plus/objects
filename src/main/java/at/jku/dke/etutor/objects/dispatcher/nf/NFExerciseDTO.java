package at.jku.dke.etutor.objects.dispatcher.nf;

public class NFExerciseDTO {
    /**
     * NF-specific variable: attributes of base relation
     */
    private String nfBaseAttributes;

    /**
     * NF-specific variable: functional dependencies of base relation
     */
    private String nfBaseDependencies;

    private String nfTaskSubtypeId;

    // Keys determination

    private int nfKeysDeterminationPenaltyPerMissingKey;

    private int nfKeysDeterminationPenaltyPerIncorrectKey;

    // Attribute closure

    private String nfAttributeClosureBaseAttributes;

    private int nfAttributeClosurePenaltyPerMissingAttribute;

    private int nfAttributeClosurePenaltyPerIncorrectAttribute;

    // Minimal cover

    private int nfMinimalCoverPenaltyPerNonCanonicalDependency;

    private int nfMinimalCoverPenaltyPerTrivialDependency;

    private int nfMinimalCoverPenaltyPerExtraneousAttribute;

    private int nfMinimalCoverPenaltyPerRedundantDependency;

    private int nfMinimalCoverPenaltyPerMissingDependencyVsSolution;

    private int nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;

    // Normal form determination

    private int nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;

    private int nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;

    // Normalization

    private String nfNormalizationTargetLevel;

    private int nfNormalizationMaxLostDependencies;

    private int nfNormalizationPenaltyPerLostAttribute;

    private int nfNormalizationPenaltyForLossyDecomposition;

    private int nfNormalizationPenaltyPerNonCanonicalDependency;

    private int nfNormalizationPenaltyPerTrivialDependency;

    private int nfNormalizationPenaltyPerExtraneousAttributeInDependencies;

    private int nfNormalizationPenaltyPerRedundantDependency;

    private int nfNormalizationPenaltyPerExcessiveLostDependency;

    private int nfNormalizationPenaltyPerMissingNewDependency;

    private int nfNormalizationPenaltyPerIncorrectNewDependency;

    private int nfNormalizationPenaltyPerMissingKey;

    private int nfNormalizationPenaltyPerIncorrectKey;

    private int nfNormalizationPenaltyPerIncorrectNFRelation;

    public String getNfBaseAttributes() {
        return nfBaseAttributes;
    }

    public void setNfBaseAttributes(String nfBaseAttributes) {
        this.nfBaseAttributes = nfBaseAttributes;
    }

    public String getNfBaseDependencies() {
        return nfBaseDependencies;
    }

    public void setNfBaseDependencies(String nfBaseDependencies) {
        this.nfBaseDependencies = nfBaseDependencies;
    }

    public String getNfTaskSubtypeId() {
        return nfTaskSubtypeId;
    }

    public void setNfTaskSubtypeId(String nfTaskSubtypeId) {
        this.nfTaskSubtypeId = nfTaskSubtypeId;
    }

    public int getNfKeysDeterminationPenaltyPerMissingKey() {
        return nfKeysDeterminationPenaltyPerMissingKey;
    }

    public void setNfKeysDeterminationPenaltyPerMissingKey(int nfKeysDeterminationPenaltyPerMissingKey) {
        this.nfKeysDeterminationPenaltyPerMissingKey = nfKeysDeterminationPenaltyPerMissingKey;
    }

    public int getNfKeysDeterminationPenaltyPerIncorrectKey() {
        return nfKeysDeterminationPenaltyPerIncorrectKey;
    }

    public void setNfKeysDeterminationPenaltyPerIncorrectKey(int nfKeysDeterminationPenaltyPerIncorrectKey) {
        this.nfKeysDeterminationPenaltyPerIncorrectKey = nfKeysDeterminationPenaltyPerIncorrectKey;
    }

    public String getNfAttributeClosureBaseAttributes() {
        return nfAttributeClosureBaseAttributes;
    }

    public void setNfAttributeClosureBaseAttributes(String nfAttributeClosureBaseAttributes) {
        this.nfAttributeClosureBaseAttributes = nfAttributeClosureBaseAttributes;
    }

    public int getNfAttributeClosurePenaltyPerMissingAttribute() {
        return nfAttributeClosurePenaltyPerMissingAttribute;
    }

    public void setNfAttributeClosurePenaltyPerMissingAttribute(int nfAttributeClosurePenaltyPerMissingAttribute) {
        this.nfAttributeClosurePenaltyPerMissingAttribute = nfAttributeClosurePenaltyPerMissingAttribute;
    }

    public int getNfAttributeClosurePenaltyPerIncorrectAttribute() {
        return nfAttributeClosurePenaltyPerIncorrectAttribute;
    }

    public void setNfAttributeClosurePenaltyPerIncorrectAttribute(int nfAttributeClosurePenaltyPerIncorrectAttribute) {
        this.nfAttributeClosurePenaltyPerIncorrectAttribute = nfAttributeClosurePenaltyPerIncorrectAttribute;
    }

    public int getNfMinimalCoverPenaltyPerNonCanonicalDependency() {
        return nfMinimalCoverPenaltyPerNonCanonicalDependency;
    }

    public void setNfMinimalCoverPenaltyPerNonCanonicalDependency(int nfMinimalCoverPenaltyPerNonCanonicalDependency) {
        this.nfMinimalCoverPenaltyPerNonCanonicalDependency = nfMinimalCoverPenaltyPerNonCanonicalDependency;
    }

    public int getNfMinimalCoverPenaltyPerTrivialDependency() {
        return nfMinimalCoverPenaltyPerTrivialDependency;
    }

    public void setNfMinimalCoverPenaltyPerTrivialDependency(int nfMinimalCoverPenaltyPerTrivialDependency) {
        this.nfMinimalCoverPenaltyPerTrivialDependency = nfMinimalCoverPenaltyPerTrivialDependency;
    }

    public int getNfMinimalCoverPenaltyPerExtraneousAttribute() {
        return nfMinimalCoverPenaltyPerExtraneousAttribute;
    }

    public void setNfMinimalCoverPenaltyPerExtraneousAttribute(int nfMinimalCoverPenaltyPerExtraneousAttribute) {
        this.nfMinimalCoverPenaltyPerExtraneousAttribute = nfMinimalCoverPenaltyPerExtraneousAttribute;
    }

    public int getNfMinimalCoverPenaltyPerRedundantDependency() {
        return nfMinimalCoverPenaltyPerRedundantDependency;
    }

    public void setNfMinimalCoverPenaltyPerRedundantDependency(int nfMinimalCoverPenaltyPerRedundantDependency) {
        this.nfMinimalCoverPenaltyPerRedundantDependency = nfMinimalCoverPenaltyPerRedundantDependency;
    }

    public int getNfMinimalCoverPenaltyPerMissingDependencyVsSolution() {
        return nfMinimalCoverPenaltyPerMissingDependencyVsSolution;
    }

    public void setNfMinimalCoverPenaltyPerMissingDependencyVsSolution(int nfMinimalCoverPenaltyPerMissingDependencyVsSolution) {
        this.nfMinimalCoverPenaltyPerMissingDependencyVsSolution = nfMinimalCoverPenaltyPerMissingDependencyVsSolution;
    }

    public int getNfMinimalCoverPenaltyPerIncorrectDependencyVsSolution() {
        return nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;
    }

    public void setNfMinimalCoverPenaltyPerIncorrectDependencyVsSolution(int nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution) {
        this.nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution = nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;
    }

    public int getNfNormalFormDeterminationPenaltyForIncorrectOverallNormalform() {
        return nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;
    }

    public void setNfNormalFormDeterminationPenaltyForIncorrectOverallNormalform(int nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform) {
        this.nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform = nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;
    }

    public int getNfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform() {
        return nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;
    }

    public void setNfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform(int nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform) {
        this.nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform = nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;
    }

    public String getNfNormalizationTargetLevel() {
        return nfNormalizationTargetLevel;
    }

    public void setNfNormalizationTargetLevel(String nfNormalizationTargetLevel) {
        this.nfNormalizationTargetLevel = nfNormalizationTargetLevel;
    }

    public int getNfNormalizationMaxLostDependencies() {
        return nfNormalizationMaxLostDependencies;
    }

    public void setNfNormalizationMaxLostDependencies(int nfNormalizationMaxLostDependencies) {
        this.nfNormalizationMaxLostDependencies = nfNormalizationMaxLostDependencies;
    }

    public int getNfNormalizationPenaltyPerLostAttribute() {
        return nfNormalizationPenaltyPerLostAttribute;
    }

    public void setNfNormalizationPenaltyPerLostAttribute(int nfNormalizationPenaltyPerLostAttribute) {
        this.nfNormalizationPenaltyPerLostAttribute = nfNormalizationPenaltyPerLostAttribute;
    }

    public int getNfNormalizationPenaltyForLossyDecomposition() {
        return nfNormalizationPenaltyForLossyDecomposition;
    }

    public void setNfNormalizationPenaltyForLossyDecomposition(int nfNormalizationPenaltyForLossyDecomposition) {
        this.nfNormalizationPenaltyForLossyDecomposition = nfNormalizationPenaltyForLossyDecomposition;
    }

    public int getNfNormalizationPenaltyPerNonCanonicalDependency() {
        return nfNormalizationPenaltyPerNonCanonicalDependency;
    }

    public void setNfNormalizationPenaltyPerNonCanonicalDependency(int nfNormalizationPenaltyPerNonCanonicalDependency) {
        this.nfNormalizationPenaltyPerNonCanonicalDependency = nfNormalizationPenaltyPerNonCanonicalDependency;
    }

    public int getNfNormalizationPenaltyPerTrivialDependency() {
        return nfNormalizationPenaltyPerTrivialDependency;
    }

    public void setNfNormalizationPenaltyPerTrivialDependency(int nfNormalizationPenaltyPerTrivialDependency) {
        this.nfNormalizationPenaltyPerTrivialDependency = nfNormalizationPenaltyPerTrivialDependency;
    }

    public int getNfNormalizationPenaltyPerExtraneousAttributeInDependencies() {
        return nfNormalizationPenaltyPerExtraneousAttributeInDependencies;
    }

    public void setNfNormalizationPenaltyPerExtraneousAttributeInDependencies(int nfNormalizationPenaltyPerExtraneousAttributeInDependencies) {
        this.nfNormalizationPenaltyPerExtraneousAttributeInDependencies = nfNormalizationPenaltyPerExtraneousAttributeInDependencies;
    }

    public int getNfNormalizationPenaltyPerRedundantDependency() {
        return nfNormalizationPenaltyPerRedundantDependency;
    }

    public void setNfNormalizationPenaltyPerRedundantDependency(int nfNormalizationPenaltyPerRedundantDependency) {
        this.nfNormalizationPenaltyPerRedundantDependency = nfNormalizationPenaltyPerRedundantDependency;
    }

    public int getNfNormalizationPenaltyPerExcessiveLostDependency() {
        return nfNormalizationPenaltyPerExcessiveLostDependency;
    }

    public void setNfNormalizationPenaltyPerExcessiveLostDependency(int nfNormalizationPenaltyPerExcessiveLostDependency) {
        this.nfNormalizationPenaltyPerExcessiveLostDependency = nfNormalizationPenaltyPerExcessiveLostDependency;
    }

    public int getNfNormalizationPenaltyPerMissingNewDependency() {
        return nfNormalizationPenaltyPerMissingNewDependency;
    }

    public void setNfNormalizationPenaltyPerMissingNewDependency(int nfNormalizationPenaltyPerMissingNewDependency) {
        this.nfNormalizationPenaltyPerMissingNewDependency = nfNormalizationPenaltyPerMissingNewDependency;
    }

    public int getNfNormalizationPenaltyPerIncorrectNewDependency() {
        return nfNormalizationPenaltyPerIncorrectNewDependency;
    }

    public void setNfNormalizationPenaltyPerIncorrectNewDependency(int nfNormalizationPenaltyPerIncorrectNewDependency) {
        this.nfNormalizationPenaltyPerIncorrectNewDependency = nfNormalizationPenaltyPerIncorrectNewDependency;
    }

    public int getNfNormalizationPenaltyPerMissingKey() {
        return nfNormalizationPenaltyPerMissingKey;
    }

    public void setNfNormalizationPenaltyPerMissingKey(int nfNormalizationPenaltyPerMissingKey) {
        this.nfNormalizationPenaltyPerMissingKey = nfNormalizationPenaltyPerMissingKey;
    }

    public int getNfNormalizationPenaltyPerIncorrectKey() {
        return nfNormalizationPenaltyPerIncorrectKey;
    }

    public void setNfNormalizationPenaltyPerIncorrectKey(int nfNormalizationPenaltyPerIncorrectKey) {
        this.nfNormalizationPenaltyPerIncorrectKey = nfNormalizationPenaltyPerIncorrectKey;
    }

    public int getNfNormalizationPenaltyPerIncorrectNFRelation() {
        return nfNormalizationPenaltyPerIncorrectNFRelation;
    }

    public void setNfNormalizationPenaltyPerIncorrectNFRelation(int nfNormalizationPenaltyPerIncorrectNFRelation) {
        this.nfNormalizationPenaltyPerIncorrectNFRelation = nfNormalizationPenaltyPerIncorrectNFRelation;
    }
}
