package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        // Namorada namora = new Namorada();
        Porteiro porteiro = new Porteiro();

        // porteiro.registrarObservadores(namora);
        porteiro.registrarObservadores(e -> System.out.println("Surpresa via Lambda"));
        porteiro.monitorar();
    }

}
