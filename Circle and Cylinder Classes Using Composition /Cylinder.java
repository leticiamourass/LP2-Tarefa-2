public class Cylinder {
   private Circle base;   // Atributo do tipo Circle, representando a base do cilindro
   private double height;
   
   // Construtor com valores padrão
   public Cylinder() {
      base = new Circle(); // Inicializa o objeto Circle
      height = 1.0; 
   }

   // Construtor com altura especificada
   public Cylinder(double height) {
      base = new Circle(); // Inicializa o objeto Circle
      this.height = height;
   }

   // Construtor com raio e altura especificados
   public Cylinder(double radius, double height) {
      base = new Circle(radius); // Inicializa o objeto Circle com raio especificado
      this.height = height;
   }

   // Construtor com raio, altura e cor especificados
   public Cylinder(double radius, double height, String color) {
      base = new Circle(radius, color); // Inicializa o objeto Circle com raio e cor especificados
      this.height = height;
   }

   // Métodos getters e setters
   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   // Método para calcular o volume do cilindro
   public double getVolume() {
      return base.getArea() * height;  // Área da base (círculo) * altura
   }

   // Sobrescrever o método toString
   @Override
   public String toString() {
      return "Cylinder: " + base.toString() + ", height=" + height;
   }
}
