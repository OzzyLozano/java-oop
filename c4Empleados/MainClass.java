package c4Empleados;

public class MainClass {
  private static void nxtln() {
    System.out.println("");
  }

  public static void main(String[] args) {
    nxtln();
    Empleados e = new Empleados();
    System.out.println(e.getNombre("Ozzy", "Lozano"));
    System.out.println(e.getEdad(20));
    System.out.println(e.getCedula("asd685sa"));
    System.out.println(e.getEstadoCivil(true));
    System.out.println(e.getSalario(8656.23));
    System.out.println(e.getClasificacion());

    nxtln();
    Programador p = new Programador();
    System.out.println(p.getCodigoPhora(23));
    System.out.println(p.getLenguaje("JavaScript"));
  }
}
