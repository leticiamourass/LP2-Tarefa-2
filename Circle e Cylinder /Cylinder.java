public class Cylinder extends Circle {
    // Atributo privado para a altura
    private double height;

    // Construtor padrão (default)
    public Cylinder() {
        super(); // Chama o construtor padrão de Circle
        this.height = 1.0;
    }

    // Construtor com altura específica, mas raio e cor padrão
    public Cylinder(double height) {
        super(); // Chama o construtor padrão de Circle
        this.height = height;
    }

    // Construtor com raio e altura específicos, mas cor padrão
    public Cylinder(double radius, double height) {
        super(radius); // Chama o construtor de Circle com raio
        this.height = height;
    }

    // Construtor com raio, altura e cor específicos
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Chama o construtor de Circle com raio e cor
        this.height = height;
    }

    // Getter para a altura
    public double getHeight() {
        return height;
    }

    // Setter para a altura
    public void setHeight(double height) {
        this.height = height;
    }

    // Método para calcular o volume do cilindro
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override do método getArea para calcular a área de superfície do cilindro
    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * Math.PI * getRadius() * height;
        return 2 * baseArea + lateralArea;
    }

    // Método toString para a classe Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
