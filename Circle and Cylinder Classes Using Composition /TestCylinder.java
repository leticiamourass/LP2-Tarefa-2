public class TestCylinder {
   public static void main(String[] args) {
      // Testando o cilindro com construtor padrão
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder: " 
            + "radius=" + c1.base.getRadius() 
            + " height=" + c1.getHeight()
            + " base area=" + c1.base.getArea() 
            + " volume=" + c1.getVolume());

      // Testando o cilindro com altura especificada
      Cylinder c2 = new Cylinder(10.0);
      System.out.println("Cylinder: "
            + "radius=" + c2.base.getRadius() 
            + " height=" + c2.getHeight() 
            + " base area=" + c2.base.getArea() 
            + " volume=" + c2.getVolume());

      // Testando o cilindro com raio e altura especificados
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println("Cylinder: "
            + "radius=" + c3.base.getRadius() 
            + " height=" + c3.getHeight() 
            + " base area=" + c3.base.getArea() 
            + " volume=" + c3.getVolume());
   }
}
