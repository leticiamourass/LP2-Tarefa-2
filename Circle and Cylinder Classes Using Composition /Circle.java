public class Circle {
   private double radius;
   private String color;
   
   // Construtores
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }

   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }

   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   // Métodos getters e setters
   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   // Método para calcular a área
   public double getArea() {
      return Math.PI * radius * radius;
   }

   // Método para representar o círculo como string
   @Override
   public String toString() {
      return "Circle[radius=" + radius + ", color=" + color + "]";
   }
}
