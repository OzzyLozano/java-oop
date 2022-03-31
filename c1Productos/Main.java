package c1Productos;

public class Main {
  public static void main(String[] args) {
    ProductoFresco producto_fresco = new ProductoFresco();
    System.out.println("\nProducto Fresco. ");
    System.out.println(producto_fresco.getFechaEnvasado("21 Febrero"));
    System.out.println(producto_fresco.getFechaCaducidad("07 Marzo"));
    System.out.println(producto_fresco.getNumLote("1236547"));
    System.out.println(producto_fresco.getPaisOrigen("Mexico"));

    ProductoRefrigerado producto_refrigerado = new ProductoRefrigerado();
    System.out.println("\nProducto Refrigerado. ");
    System.out.println(producto_refrigerado.getFechaEnvasado("21 Febrero"));
    System.out.println(producto_refrigerado.getFechaCaducidad("07 Marzo"));
    System.out.println(producto_refrigerado.getNumLote("1236547"));
    System.out.println(producto_refrigerado.getPaisOrigen("Mexico"));
    System.out.println(producto_refrigerado.getTemperaturaRecomendada("15C"));
    System.out.println(producto_refrigerado.getCodigoSupervision("321564879"));

    ProductoCongelado producto_congelado = new ProductoCongelado();
    System.out.println("\nProducto Congelado. ");
    System.out.println(producto_congelado.getMetodoCongelacion("Aire"));
    System.out.println(producto_congelado.getFechaEnvasado("21 Febrero"));
    System.out.println(producto_congelado.getFechaCaducidad("07 Marzo"));
    System.out.println(producto_congelado.getNumLote("1236547"));
    System.out.println(producto_congelado.getPaisOrigen("Mexico"));
    System.out.println(producto_congelado.getTemperaturaRecomendada("7C"));
    System.out.println(producto_congelado.getNitrogeno("37%"));
    System.out.println(producto_congelado.getOxigeno("25%"));
    System.out.println(producto_congelado.getDioxido("23%"));
    System.out.println(producto_congelado.getVapor("15%"));

    System.out.println("\nProducto Congelado. ");
    System.out.println(producto_congelado.getMetodoCongelacion("Agua"));
    System.out.println(producto_congelado.getFechaEnvasado("21 Febrero"));
    System.out.println(producto_congelado.getFechaCaducidad("07 Marzo"));
    System.out.println(producto_congelado.getNumLote("1236547"));
    System.out.println(producto_congelado.getPaisOrigen("Mexico"));
    System.out.println(producto_congelado.getTemperaturaRecomendada("7C"));
    System.out.println(producto_congelado.getSalinidadAgua("50g"));

    System.out.println("\nProducto Congelado. ");
    System.out.println(producto_congelado.getMetodoCongelacion("Nitrogeno"));
    System.out.println(producto_congelado.getFechaEnvasado("21 Febrero"));
    System.out.println(producto_congelado.getFechaCaducidad("07 Marzo"));
    System.out.println(producto_congelado.getNumLote("1236547"));
    System.out.println(producto_congelado.getPaisOrigen("Mexico"));
    System.out.println(producto_congelado.getTemperaturaRecomendada("7C"));
    System.out.println(producto_congelado.getExposicionNitrogeno("300s"));
  }
}
