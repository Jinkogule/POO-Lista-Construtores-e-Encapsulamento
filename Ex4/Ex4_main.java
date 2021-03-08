public class Ex4_main {
    public static void main(String[] args) {

        System.out.println("Fim do mundo:");
        Data fimdomundo1 = new Data(21, 12, 2012);
        System.out.println(fimdomundo1.getData1());

        Data fimdomundo2 = new Data("Dezembro", 21, 2012);
        System.out.println(fimdomundo2.getData2());

        Data fimdomundo3 = new Data(366, 2012);
        System.out.println(fimdomundo3.getData3());
        System.out.println("");

        System.out.println("Morte de Napoleão:");
        Data mortenapo1 = new Data(5, 5, 1821);
        System.out.println(mortenapo1.getData1());

        Data mortenapo2 = new Data("Maio", 5, 1821);
        System.out.println(mortenapo2.getData2());

        Data mortenapo3 = new Data(365, 1821);
        System.out.println(mortenapo3.getData3());
    }
}
