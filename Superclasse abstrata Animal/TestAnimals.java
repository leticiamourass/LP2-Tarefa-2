// Testar as classes Animal, Dog e Cat
public class Main {
   public static void main(String[] args) {
      // Criando objetos Dog e Cat
      Animal myDog = new Dog();
      Animal myCat = new Cat();
      
      // Chamando os métodos makeSound() e sleep() em ambos os objetos
      myDog.makeSound();  // Saída: Woof! Woof!
      myDog.sleep();      // Saída: This animal is sleeping.
      
      myCat.makeSound();  // Saída: Meow! Meow!
      myCat.sleep();      // Saída: This animal is sleeping.
   }
}
