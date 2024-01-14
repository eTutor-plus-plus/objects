package at.jku.dke.etutor.objects.dispatcher.nf;

public class NFExerciseDTO {
    /**
     * Attributes of base relation
     */
    private String nfBaseAttributes;

    /**
     * Functional dependencies of base relation
     */
    private String nfBaseDependencies;

    /**
     * The id of the NF task subtype
     */
    private String nfTaskSubtypeId;

    // Keys determination

    /**
     * Number of points deducted per missing key in a keys determination task
     */
    private int nfKeysDeterminationPenaltyPerMissingKey;

    /**
     * Number of points deducted per incorrect key in a keys determination task
     */
    private int nfKeysDeterminationPenaltyPerIncorrectKey;

    // Attribute closure

    /**
     * Base attributes for closure in an attribute closure task
     */
    private String nfAttributeClosureBaseAttributes;

    /**
     * Number of points deducted per missing attribute an attribute closure task
     */
    private int nfAttributeClosurePenaltyPerMissingAttribute;

    /**
     * Number of points deducted per incorrect attribute in an attribute closure task
     */
    private int nfAttributeClosurePenaltyPerIncorrectAttribute;

    // Minimal cover

    /**
     * Number of points deducted per non-canonical functional dependency in a minimal cover task
     */
    private int nfMinimalCoverPenaltyPerNonCanonicalDependency;

    /**
     * Number of points deducted per trivial functional dependency in a minimal cover task
     */
    private int nfMinimalCoverPenaltyPerTrivialDependency;

    /**
     * Number of points deducted per extraneous attribute on the left-hand side of a functional
     * dependency in a minimal cover task
     */
    private int nfMinimalCoverPenaltyPerExtraneousAttribute;

    /**
     * Number of points deducted per redundant functional dependency in a minimal cover task
     */
    private int nfMinimalCoverPenaltyPerRedundantDependency;

    /**
     * Number of points deducted per missing functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    private int nfMinimalCoverPenaltyPerMissingDependencyVsSolution;

    /**
     * Number of points deducted per incorrect functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    private int nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;

    // Normal form determination

    /**
     * Number of points deducted for an incorrect total normal form in a normal form determination
     * task
     */
    private int nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;

    /**
     * Number of points deducted per incorrectly determined normal form of a functional dependency
     * in a normal form determination task
     */
    private int nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;

    // Normalization

    /**
     * The minimum normal form level which the resulting relations must have in a normalization
     * task
     */
    private String nfNormalizationTargetLevel;

    /**
     * The maximum number of functional dependencies that is permitted to be lost in the
     * decomposition process before points are deducted in a normalization task
     */
    private int nfNormalizationMaxLostDependencies;

    /**
     * Points deducted for every attribute of the base relation that is not present in any of the
     * resulting relations in a normalization task
     */
    private int nfNormalizationPenaltyPerLostAttribute;

    /**
     * Points deducted if the resulting relations cannot be re-combined into the base relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyForLossyDecomposition;

    /**
     * Points deducted for every non-canonical functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerNonCanonicalDependency;

    /**
     * Points deducted for every trivial functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerTrivialDependency;

    /**
     * Points deducted for every extraneous attribute on the left-hand side of a functional
     * dependency in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerExtraneousAttributeInDependencies;

    /**
     * Points deducted for every redundant functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerRedundantDependency;

    /**
     * Points deducted for every functional dependency that was lost during the decomposition
     * process and exceeds the maximum permitted number of lost functional dependencies in a normalization task
     */
    private int nfNormalizationPenaltyPerExcessiveLostDependency;

    /**
     * Points deducted for every functional dependency that would have to exist in a resulting
     * relation due to the decomposition process but does not in a normalization task
     */
    private int nfNormalizationPenaltyPerMissingNewDependency;

    /**
     * Points deducted for every functional dependency that exists in a resulting relation, even
     * though it is not supposed to (due to the decomposition process, more specifically the RBR algorithm) in a
     * normalization task
     */
    private int nfNormalizationPenaltyPerIncorrectNewDependency;

    /**
     * Points deducted for every missing key in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerMissingKey;

    /**
     * Points deducted for every incorrect key in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerIncorrectKey;

    /**
     * Points deducted for every resulting relation that does not match or exceed the required
     * normal form in a normalization task
     */
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
