// Classe abstrata Animal
public abstract class Animal {
   // Método abstrato que deve ser implementado pelas subclasses
   public abstract void makeSound();
   
   // Método concreto (não abstrato) para representar o comportamento de dormir
   public void sleep() {
      System.out.println("This animal is sleeping.");
   }
}
