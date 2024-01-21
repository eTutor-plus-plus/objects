package at.jku.dke.etutor.objects.dispatcher.nf;

public class NFExerciseDTO {
    /**
     * Name of base relation
     */
    private String nfBaseRelationName;

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
     * Number of points deducted for every attribute of the base relation that is not present in any of the
     * resulting relations in a normalization task
     */
    private int nfNormalizationPenaltyPerLostAttribute;

    /**
     * Number of points deducted if the resulting relations cannot be re-combined into the base relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyForLossyDecomposition;

    /**
     * Number of points deducted for every non-canonical functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerNonCanonicalDependency;

    /**
     * Number of points deducted for every trivial functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerTrivialDependency;

    /**
     * Number of points deducted for every extraneous attribute on the left-hand side of a functional
     * dependency in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerExtraneousAttributeInDependencies;

    /**
     * Number of points deducted for every redundant functional dependency in a resulting relation in
     * a normalization task
     */
    private int nfNormalizationPenaltyPerRedundantDependency;

    /**
     * Number of points deducted for every functional dependency that was lost during the decomposition
     * process and exceeds the maximum permitted number of lost functional dependencies in a normalization task
     */
    private int nfNormalizationPenaltyPerExcessiveLostDependency;

    /**
     * Number of points deducted for every functional dependency that would have to exist in a resulting
     * relation due to the decomposition process but does not in a normalization task
     */
    private int nfNormalizationPenaltyPerMissingNewDependency;

    /**
     * Number of points deducted for every functional dependency that exists in a resulting relation, even
     * though it is not supposed to (due to the decomposition process, more specifically the RBR algorithm) in a
     * normalization task
     */
    private int nfNormalizationPenaltyPerIncorrectNewDependency;

    /**
     * Number of points deducted for every missing key in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerMissingKey;

    /**
     * Number of points deducted for every incorrect key in a resulting relation in a normalization task
     */
    private int nfNormalizationPenaltyPerIncorrectKey;

    /**
     * Number of points deducted for every resulting relation that does not match or exceed the required
     * normal form in a normalization task
     */
    private int nfNormalizationPenaltyPerIncorrectNFRelation;

    /**
     * Returns name of base relation
     */
    public String getNfBaseRelationName() {
        return nfBaseRelationName;
    }

    /**
     * Sets name of base relation
     */
    public void setNfBaseRelationName(String nfBaseRelationName) {
        this.nfBaseRelationName = nfBaseRelationName;
    }

    /**
     * Returns attributes of base relation
     */
    public String getNfBaseAttributes() {
        return nfBaseAttributes;
    }

    /**
     * Sets attributes of base relation
     */
    public void setNfBaseAttributes(String nfBaseAttributes) {
        this.nfBaseAttributes = nfBaseAttributes;
    }

    /**
     * Returns functional dependencies of base relation
     */
    public String getNfBaseDependencies() {
        return nfBaseDependencies;
    }

    /**
     * Sets functional dependencies of base relation
     */
    public void setNfBaseDependencies(String nfBaseDependencies) {
        this.nfBaseDependencies = nfBaseDependencies;
    }

    /**
     * Returns the id of the NF task subtype
     */
    public String getNfTaskSubtypeId() {
        return nfTaskSubtypeId;
    }

    /**
     * Sets the id of the NF task subtype
     */
    public void setNfTaskSubtypeId(String nfTaskSubtypeId) {
        this.nfTaskSubtypeId = nfTaskSubtypeId;
    }

    // Keys determination

    /**
     * Returns the number of points deducted per missing key in a keys determination task
     */
    public int getNfKeysDeterminationPenaltyPerMissingKey() {
        return nfKeysDeterminationPenaltyPerMissingKey;
    }

    /**
     * Sets the number of points deducted per missing key in a keys determination task
     */
    public void setNfKeysDeterminationPenaltyPerMissingKey(int nfKeysDeterminationPenaltyPerMissingKey) {
        this.nfKeysDeterminationPenaltyPerMissingKey = nfKeysDeterminationPenaltyPerMissingKey;
    }

    /**
     * Returns the number of points deducted per incorrect key in a keys determination task
     */
    public int getNfKeysDeterminationPenaltyPerIncorrectKey() {
        return nfKeysDeterminationPenaltyPerIncorrectKey;
    }

    /**
     * Sets the number of points deducted per incorrect key in a keys determination task
     */
    public void setNfKeysDeterminationPenaltyPerIncorrectKey(int nfKeysDeterminationPenaltyPerIncorrectKey) {
        this.nfKeysDeterminationPenaltyPerIncorrectKey = nfKeysDeterminationPenaltyPerIncorrectKey;
    }

    // Attribute closure

    /**
     * Returns base attributes for closure in an attribute closure task
     */
    public String getNfAttributeClosureBaseAttributes() {
        return nfAttributeClosureBaseAttributes;
    }

    /**
     * Sets base attributes for closure in an attribute closure task
     */
    public void setNfAttributeClosureBaseAttributes(String nfAttributeClosureBaseAttributes) {
        this.nfAttributeClosureBaseAttributes = nfAttributeClosureBaseAttributes;
    }

    /**
     * Returns the number of points deducted per missing attribute an attribute closure task
     */
    public int getNfAttributeClosurePenaltyPerMissingAttribute() {
        return nfAttributeClosurePenaltyPerMissingAttribute;
    }

    /**
     * Sets the number of points deducted per missing attribute an attribute closure task
     */
    public void setNfAttributeClosurePenaltyPerMissingAttribute(int nfAttributeClosurePenaltyPerMissingAttribute) {
        this.nfAttributeClosurePenaltyPerMissingAttribute = nfAttributeClosurePenaltyPerMissingAttribute;
    }

    /**
     * Returns the number of points deducted per incorrect attribute in an attribute closure task
     */
    public int getNfAttributeClosurePenaltyPerIncorrectAttribute() {
        return nfAttributeClosurePenaltyPerIncorrectAttribute;
    }

    /**
     * Sets the number of points deducted per incorrect attribute in an attribute closure task
     */
    public void setNfAttributeClosurePenaltyPerIncorrectAttribute(int nfAttributeClosurePenaltyPerIncorrectAttribute) {
        this.nfAttributeClosurePenaltyPerIncorrectAttribute = nfAttributeClosurePenaltyPerIncorrectAttribute;
    }

    // Minimal cover

    /**
     * Returns the number of points deducted per non-canonical functional dependency in a minimal cover task
     */
    public int getNfMinimalCoverPenaltyPerNonCanonicalDependency() {
        return nfMinimalCoverPenaltyPerNonCanonicalDependency;
    }

    /**
     * Sets the number of points deducted per non-canonical functional dependency in a minimal cover task
     */
    public void setNfMinimalCoverPenaltyPerNonCanonicalDependency(int nfMinimalCoverPenaltyPerNonCanonicalDependency) {
        this.nfMinimalCoverPenaltyPerNonCanonicalDependency = nfMinimalCoverPenaltyPerNonCanonicalDependency;
    }

    /**
     * Returns the number of points deducted per trivial functional dependency in a minimal cover task
     */
    public int getNfMinimalCoverPenaltyPerTrivialDependency() {
        return nfMinimalCoverPenaltyPerTrivialDependency;
    }

    /**
     * Sets the number of points deducted per trivial functional dependency in a minimal cover task
     */
    public void setNfMinimalCoverPenaltyPerTrivialDependency(int nfMinimalCoverPenaltyPerTrivialDependency) {
        this.nfMinimalCoverPenaltyPerTrivialDependency = nfMinimalCoverPenaltyPerTrivialDependency;
    }

    /**
     * Returns the number of points deducted per extraneous attribute on the left-hand side of a functional
     * dependency in a minimal cover task
     */
    public int getNfMinimalCoverPenaltyPerExtraneousAttribute() {
        return nfMinimalCoverPenaltyPerExtraneousAttribute;
    }

    /**
     * Sets the number of points deducted per extraneous attribute on the left-hand side of a functional
     * dependency in a minimal cover task
     */
    public void setNfMinimalCoverPenaltyPerExtraneousAttribute(int nfMinimalCoverPenaltyPerExtraneousAttribute) {
        this.nfMinimalCoverPenaltyPerExtraneousAttribute = nfMinimalCoverPenaltyPerExtraneousAttribute;
    }

    /**
     * Returns the number of points deducted per redundant functional dependency in a minimal cover task
     */
    public int getNfMinimalCoverPenaltyPerRedundantDependency() {
        return nfMinimalCoverPenaltyPerRedundantDependency;
    }

    /**
     * Sets the number of points deducted per redundant functional dependency in a minimal cover task
     */
    public void setNfMinimalCoverPenaltyPerRedundantDependency(int nfMinimalCoverPenaltyPerRedundantDependency) {
        this.nfMinimalCoverPenaltyPerRedundantDependency = nfMinimalCoverPenaltyPerRedundantDependency;
    }

    /**
     * Returns the number of points deducted per missing functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    public int getNfMinimalCoverPenaltyPerMissingDependencyVsSolution() {
        return nfMinimalCoverPenaltyPerMissingDependencyVsSolution;
    }

    /**
     * Sets the number of points deducted per missing functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    public void setNfMinimalCoverPenaltyPerMissingDependencyVsSolution(int nfMinimalCoverPenaltyPerMissingDependencyVsSolution) {
        this.nfMinimalCoverPenaltyPerMissingDependencyVsSolution = nfMinimalCoverPenaltyPerMissingDependencyVsSolution;
    }

    /**
     * Returns the number of points deducted per incorrect functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    public int getNfMinimalCoverPenaltyPerIncorrectDependencyVsSolution() {
        return nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;
    }

    /**
     * Sets the number of points deducted per incorrect functional dependency in a minimal cover task
     * (compared to the correct solution)
     */
    public void setNfMinimalCoverPenaltyPerIncorrectDependencyVsSolution(int nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution) {
        this.nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution = nfMinimalCoverPenaltyPerIncorrectDependencyVsSolution;
    }

    // Normal form determination

    /**
     * Returns the number of points deducted for an incorrect total normal form in a normal form determination
     * task
     */
    public int getNfNormalFormDeterminationPenaltyForIncorrectOverallNormalform() {
        return nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;
    }

    /**
     * Sets the number of points deducted for an incorrect total normal form in a normal form determination
     * task
     */
    public void setNfNormalFormDeterminationPenaltyForIncorrectOverallNormalform(int nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform) {
        this.nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform = nfNormalFormDeterminationPenaltyForIncorrectOverallNormalform;
    }

    /**
     * Returns the number of points deducted per incorrectly determined normal form of a functional dependency
     * in a normal form determination task
     */
    public int getNfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform() {
        return nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;
    }

    /**
     * Sets the number of points deducted per incorrectly determined normal form of a functional dependency
     * in a normal form determination task
     */
    public void setNfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform(int nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform) {
        this.nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform = nfNormalFormDeterminationPenaltyPerIncorrectDependencyNormalform;
    }

    // Normalization

    /**
     * Returns the minimum normal form level which the resulting relations must have in a normalization
     * task
     */
    public String getNfNormalizationTargetLevel() {
        return nfNormalizationTargetLevel;
    }

    /**
     * Sets the minimum normal form level which the resulting relations must have in a normalization
     * task
     */
    public void setNfNormalizationTargetLevel(String nfNormalizationTargetLevel) {
        this.nfNormalizationTargetLevel = nfNormalizationTargetLevel;
    }

    /**
     * Returns the maximum number of functional dependencies that is permitted to be lost in the
     * decomposition process before points are deducted in a normalization task
     */
    public int getNfNormalizationMaxLostDependencies() {
        return nfNormalizationMaxLostDependencies;
    }

    /**
     * Sets the maximum number of functional dependencies that is permitted to be lost in the
     * decomposition process before points are deducted in a normalization task
     */
    public void setNfNormalizationMaxLostDependencies(int nfNormalizationMaxLostDependencies) {
        this.nfNormalizationMaxLostDependencies = nfNormalizationMaxLostDependencies;
    }

    /**
     * Returns the number of points deducted for every attribute of the base relation that is not present in any of the
     * resulting relations in a normalization task
     */
    public int getNfNormalizationPenaltyPerLostAttribute() {
        return nfNormalizationPenaltyPerLostAttribute;
    }

    /**
     * Sets the number of points deducted for every attribute of the base relation that is not present in any of the
     * resulting relations in a normalization task
     */
    public void setNfNormalizationPenaltyPerLostAttribute(int nfNormalizationPenaltyPerLostAttribute) {
        this.nfNormalizationPenaltyPerLostAttribute = nfNormalizationPenaltyPerLostAttribute;
    }

    /**
     * Returns the number of points deducted if the resulting relations cannot be re-combined into the base relation in
     * a normalization task
     */
    public int getNfNormalizationPenaltyForLossyDecomposition() {
        return nfNormalizationPenaltyForLossyDecomposition;
    }

    /**
     * Sets the number of points deducted if the resulting relations cannot be re-combined into the base relation in
     * a normalization task
     */
    public void setNfNormalizationPenaltyForLossyDecomposition(int nfNormalizationPenaltyForLossyDecomposition) {
        this.nfNormalizationPenaltyForLossyDecomposition = nfNormalizationPenaltyForLossyDecomposition;
    }

    /**
     * Returns the number of points deducted for every non-canonical functional dependency in a resulting relation in
     * a normalization task
     */
    public int getNfNormalizationPenaltyPerNonCanonicalDependency() {
        return nfNormalizationPenaltyPerNonCanonicalDependency;
    }

    /**
     * Sets the number of points deducted for every non-canonical functional dependency in a resulting relation in
     * a normalization task
     */
    public void setNfNormalizationPenaltyPerNonCanonicalDependency(int nfNormalizationPenaltyPerNonCanonicalDependency) {
        this.nfNormalizationPenaltyPerNonCanonicalDependency = nfNormalizationPenaltyPerNonCanonicalDependency;
    }

    /**
     * Returns the number of points deducted for every trivial functional dependency in a resulting relation in
     * a normalization task
     */
    public int getNfNormalizationPenaltyPerTrivialDependency() {
        return nfNormalizationPenaltyPerTrivialDependency;
    }

    /**
     * Sets the number of points deducted for every trivial functional dependency in a resulting relation in
     * a normalization task
     */
    public void setNfNormalizationPenaltyPerTrivialDependency(int nfNormalizationPenaltyPerTrivialDependency) {
        this.nfNormalizationPenaltyPerTrivialDependency = nfNormalizationPenaltyPerTrivialDependency;
    }

    /**
     * Returns the number of points deducted for every extraneous attribute on the left-hand side of a functional
     * dependency in a resulting relation in a normalization task
     */
    public int getNfNormalizationPenaltyPerExtraneousAttributeInDependencies() {
        return nfNormalizationPenaltyPerExtraneousAttributeInDependencies;
    }

    /**
     * Sets the number of points deducted for every extraneous attribute on the left-hand side of a functional
     * dependency in a resulting relation in a normalization task
     */
    public void setNfNormalizationPenaltyPerExtraneousAttributeInDependencies(int nfNormalizationPenaltyPerExtraneousAttributeInDependencies) {
        this.nfNormalizationPenaltyPerExtraneousAttributeInDependencies = nfNormalizationPenaltyPerExtraneousAttributeInDependencies;
    }

    /**
     * Returns the number of points deducted for every redundant functional dependency in a resulting relation in
     * a normalization task
     */
    public int getNfNormalizationPenaltyPerRedundantDependency() {
        return nfNormalizationPenaltyPerRedundantDependency;
    }

    /**
     * Sets the number of points deducted for every redundant functional dependency in a resulting relation in
     * a normalization task
     */
    public void setNfNormalizationPenaltyPerRedundantDependency(int nfNormalizationPenaltyPerRedundantDependency) {
        this.nfNormalizationPenaltyPerRedundantDependency = nfNormalizationPenaltyPerRedundantDependency;
    }

    /**
     * Returns the number of points deducted for every functional dependency that was lost during the decomposition
     * process and exceeds the maximum permitted number of lost functional dependencies in a normalization task
     */
    public int getNfNormalizationPenaltyPerExcessiveLostDependency() {
        return nfNormalizationPenaltyPerExcessiveLostDependency;
    }

    /**
     * Sets the number of points deducted for every functional dependency that was lost during the decomposition
     * process and exceeds the maximum permitted number of lost functional dependencies in a normalization task
     */
    public void setNfNormalizationPenaltyPerExcessiveLostDependency(int nfNormalizationPenaltyPerExcessiveLostDependency) {
        this.nfNormalizationPenaltyPerExcessiveLostDependency = nfNormalizationPenaltyPerExcessiveLostDependency;
    }

    /**
     * Returns the number of points deducted for every functional dependency that would have to exist in a resulting
     * relation due to the decomposition process but does not in a normalization task
     */
    public int getNfNormalizationPenaltyPerMissingNewDependency() {
        return nfNormalizationPenaltyPerMissingNewDependency;
    }

    /**
     * Sets the number of points deducted for every functional dependency that would have to exist in a resulting
     * relation due to the decomposition process but does not in a normalization task
     */
    public void setNfNormalizationPenaltyPerMissingNewDependency(int nfNormalizationPenaltyPerMissingNewDependency) {
        this.nfNormalizationPenaltyPerMissingNewDependency = nfNormalizationPenaltyPerMissingNewDependency;
    }

    /**
     * Returns the number of points deducted for every functional dependency that exists in a resulting relation, even
     * though it is not supposed to (due to the decomposition process, more specifically the RBR algorithm) in a
     * normalization task
     */
    public int getNfNormalizationPenaltyPerIncorrectNewDependency() {
        return nfNormalizationPenaltyPerIncorrectNewDependency;
    }

    /**
     * Sets the number of points deducted for every functional dependency that exists in a resulting relation, even
     * though it is not supposed to (due to the decomposition process, more specifically the RBR algorithm) in a
     * normalization task
     */
    public void setNfNormalizationPenaltyPerIncorrectNewDependency(int nfNormalizationPenaltyPerIncorrectNewDependency) {
        this.nfNormalizationPenaltyPerIncorrectNewDependency = nfNormalizationPenaltyPerIncorrectNewDependency;
    }

    /**
     * Returns the number of points deducted for every missing key in a resulting relation in a normalization task
     */
    public int getNfNormalizationPenaltyPerMissingKey() {
        return nfNormalizationPenaltyPerMissingKey;
    }

    /**
     * Sets the number of points deducted for every missing key in a resulting relation in a normalization task
     */
    public void setNfNormalizationPenaltyPerMissingKey(int nfNormalizationPenaltyPerMissingKey) {
        this.nfNormalizationPenaltyPerMissingKey = nfNormalizationPenaltyPerMissingKey;
    }

    /**
     * Returns the number of points deducted for every incorrect key in a resulting relation in a normalization task
     */
    public int getNfNormalizationPenaltyPerIncorrectKey() {
        return nfNormalizationPenaltyPerIncorrectKey;
    }

    /**
     * Sets the number of points deducted for every incorrect key in a resulting relation in a normalization task
     */
    public void setNfNormalizationPenaltyPerIncorrectKey(int nfNormalizationPenaltyPerIncorrectKey) {
        this.nfNormalizationPenaltyPerIncorrectKey = nfNormalizationPenaltyPerIncorrectKey;
    }

    /**
     * Returns the number of points deducted for every resulting relation that does not match or exceed the required
     * normal form in a normalization task
     */
    public int getNfNormalizationPenaltyPerIncorrectNFRelation() {
        return nfNormalizationPenaltyPerIncorrectNFRelation;
    }

    /**
     * Sets the number of points deducted for every resulting relation that does not match or exceed the required
     * normal form in a normalization task
     */
    public void setNfNormalizationPenaltyPerIncorrectNFRelation(int nfNormalizationPenaltyPerIncorrectNFRelation) {
        this.nfNormalizationPenaltyPerIncorrectNFRelation = nfNormalizationPenaltyPerIncorrectNFRelation;
    }
}
