public class Ex4_main {
    public static void main(String[] args) {
        Data fimdomundo = new Data();
        System.out.println("Fim do mundo:");
        System.out.println(fimdomundo.data("Dezembro", 21, 2012));
        System.out.println(fimdomundo.data(21, 12, 2012));
        System.out.println(fimdomundo.data(366, 2012));
        System.out.println("");

        System.out.println("Morte de Napoleão:");
        Data atentado = new Data();
        System.out.println(fimdomundo.data("Maio", 5, 1821));
        System.out.println(fimdomundo.data(5, 5, 1821));
        System.out.println(fimdomundo.data(365, 1821));
    }
}
