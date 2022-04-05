package ejercicio_grupal;

public class Empleado extends Persona {
  int fechaIncorporacion;
  String despacho;

  public int getFechaIncorporacion() {
    return fechaIncorporacion;
  }

  public void setFechaIncorporacion(int fechaIncorporacion) {
    this.fechaIncorporacion = fechaIncorporacion;
  }

  public String getDespacho() {
    return despacho;
  }

  public void setDespacho(String despacho) {
    this.despacho = despacho;
  }
}
