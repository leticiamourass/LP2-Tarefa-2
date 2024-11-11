// Exemplo de Agregação

class Livro {
    String titulo;

    Livro(String titulo) {
        this.titulo = titulo;
    }
}

class Biblioteca {
    Livro livro;
    
    Biblioteca(Livro livro) {
        this.livro = livro;
    }
    
    void mostrarLivro() {
        System.out.println("Livro na biblioteca: " + livro.titulo);
    }
}

public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java para Iniciantes");
        Biblioteca biblioteca = new Biblioteca(livro1);
        biblioteca.mostrarLivro();  // Exibe "Livro na biblioteca: Java para Iniciantes"
    }
}
