public class TestCylinder {
    public static void main(String[] args) {
        // Teste com cilindro padrão (raio, cor, altura padrões)
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Base area: " + c1.getArea());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println();

        // Teste com altura especificada
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);
        System.out.println("Base area: " + c2.getArea());
        System.out.println("Volume: " + c2.getVolume());
        System.out.println();

        // Teste com raio e altura especificados
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);
        System.out.println("Base area: " + c3.getArea());
        System.out.println("Volume: " + c3.getVolume());
        System.out.println();

        // Teste com raio, altura e cor especificados
        Cylinder c4 = new Cylinder(3.0, 5.0, "blue");
        System.out.println(c4);
        System.out.println("Base area: " + c4.getArea());
        System.out.println("Volume: " + c4.getVolume());
    }
}
