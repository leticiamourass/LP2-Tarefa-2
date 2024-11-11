// Exemplo de Herança

class Animal {
    void som() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    void som() {
        System.out.println("Latido");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.som();  // Exibe "Latido"
    }
}
