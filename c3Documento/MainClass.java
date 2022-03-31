package c3Documento;

public class MainClass {
  public static void main(String[] args) {
    DocTexto doc_texto = new DocTexto();
    System.out.println(doc_texto.getNombre("[Nombre]"));
    System.out.println(doc_texto.getTamano(89));
    System.out.println(doc_texto.getCodificacion("[Codificacion]"));
    System.out.println(doc_texto.getCantPalabras(12332));
    System.out.println(doc_texto.getCantParrafos(853));

    DocVideo doc_video = new DocVideo();
    System.out.println(doc_video.getNombre("[Nombre]"));
    System.out.println(doc_video.getTamano(678));
    System.out.println(doc_video.getDuracion(14));
    System.out.println(doc_video.getResumen("[lorem ipsum ...]"));
  }
}
