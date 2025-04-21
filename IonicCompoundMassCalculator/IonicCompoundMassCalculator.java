public class IonicCompoundMassCalculator {

    public static void main(String[] args) {
        System.out.println(Element.BERYLLIUM.getAtomicMass());
        Element.NITROGEN.printIonicCompoundMass(Element.LITHIUM);
        Element.NITROGEN.printIonicCompound(Element.NITROGEN);
    }
}
