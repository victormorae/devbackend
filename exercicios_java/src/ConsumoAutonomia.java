public class ConsumoAutonomia {

    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50.0;
        double combustivelDisponivel = 20.0;
        double distanciaViagem = 200.0;
        double autonomiaMax = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelDisponivel;

        System.out.println("Autonomia máxima do veículo: "+ autonomiaMax +" km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");

        if (autonomiaAtual < distanciaViagem) {
            System.out.println("Você não vai conseguir completar a viagem. Precisa abastecer o carro.");

        } else if (autonomiaAtual >= distanciaViagem ) {
            System.out.println("Você conseguirá completar a viagem sem abastecer.");

        }

    }

}
