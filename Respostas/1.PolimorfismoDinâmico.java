class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latido");
    }
}

class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerSom();  // Exibe "Latido"
    }
}
