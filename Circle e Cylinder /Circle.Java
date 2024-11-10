public class Circle {
    // Atributos privados
    private double radius;
    private String color;

    // Construtor padrão (default)
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Construtor com apenas o raio
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Construtor com raio e cor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter para o raio
    public double getRadius() {
        return radius;
    }

    // Setter para o raio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter para a cor
    public String getColor() {
        return color;
    }

    // Setter para a cor
    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular a área do círculo
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Método toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
