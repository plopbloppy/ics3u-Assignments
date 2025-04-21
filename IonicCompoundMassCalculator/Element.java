public enum Element {
    
    LITHIUM(6.9410, "Li", 1),
    NITROGEN(14.007, "N", -3),
    OXYGEN(15.999, "O", -2),
    FLUORINE(18.998, "F", -1),
    SODIUM(22.990, "Na", 1),
    MAGNESIUM(24.305, "Mg", 2),
    ALUMINUM(26.982, "Al", 3),
    PHOSPHORUS(30.974, "P", -3),
    SULFUR(32.065, "S", -2),
    CHLORINE(35.453, "Cl", -1),
    POTASSIUM(39.098, "K", 1),
    CALCIUM(40.078, "Ca", 2),
    BROMINE(79.904, "Br", -1),
    STRONTIUM(87.620, "Sr", 2),
    IODINE(126.90, "I", -1),
    BARIUM(137.33, "Ba", 2);

    private double atomicMass;
    private String symbol;
    private int ionicCharge; 

    Element(double atomicMass, String symbol, int ionicCharge) {
        this.atomicMass = atomicMass;
        this.symbol = symbol;
        this.ionicCharge = ionicCharge;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getIonicCharge() {
        return ionicCharge;
    }

    private boolean isIonicCompound(Element element) {
        return !(ionicCharge * element.getIonicCharge() > 0);
    }

    private double calculateIonicCompoundMass(Element element) {
        if (Math.abs(ionicCharge) == Math.abs(element.getIonicCharge())) {
            return atomicMass + element.getAtomicMass();
        } else {
            return atomicMass * Math.abs(element.getIonicCharge()) + element.getAtomicMass() * Math.abs(ionicCharge);
        }
    }

    public void printIonicCompoundMass(Element element) {
        if (isIonicCompound(element)) {
            System.out.println(calculateIonicCompoundMass(element));
        } else {
            System.out.println("Not valid input!");
        }
    }

    private String constructChemicalFormula(Element element) {
        String chemicalFormula; 

        if (Math.abs(ionicCharge) == Math.abs(element.getIonicCharge())) {
            chemicalFormula = symbol + element.getSymbol();
        } else if (ionicCharge > 0) {
            chemicalFormula = symbol + Math.abs(element.getIonicCharge()) + element.getSymbol() + Math.abs(ionicCharge);
        } else {
            chemicalFormula = element.getSymbol() + Math.abs(ionicCharge) + symbol + Math.abs(element.getIonicCharge());
        }
        return chemicalFormula.replace("1", "");
    }

    public void printIonicCompound(Element element) {
        if (isIonicCompound(element)) {
            System.out.println(constructChemicalFormula(element));
        } else {
            System.out.println("Not valid input!");
        }
    }
}