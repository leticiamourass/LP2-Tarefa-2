// Exemplo de Composição

class Motor {
    void ligar() {
        System.out.println("Motor ligado");
    }
}

class Carro {
    Motor motor = new Motor();
    
    void ligarCarro() {
        motor.ligar();  // O carro liga o motor
    }
}

public class Teste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.ligarCarro();  // Exibe "Motor ligado"
    }
}
