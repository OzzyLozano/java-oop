import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainClass extends JFrame implements ActionListener {
  int x = 16;
  int y = 24;
  JButton coordenadas[][] = new JButton[x][y];

  JMenuBar Barra = new JMenuBar();
  JMenu Archivo = new JMenu("Archivo");
  JMenu Reiniciar = new JMenu("Reiniciar");
  JMenuItem Nuevo = new JMenuItem("Nuevo");
  JMenuItem Salir = new JMenuItem("Salir");
  JLabel Nombre = new JLabel("ozzy", JLabel.CENTER);

  MainClass() {
    Nuevo.addActionListener(this);
    Archivo.add(Nuevo);
    Salir.addActionListener(this);
    Archivo.add(Salir);
    Barra.add(Archivo);
    Barra.add(Reiniciar);
    setJMenuBar(Barra);

    JPanel Principal = new JPanel();
    Principal.setLayout(new GridLayout(x, y));

    add(Nombre, "North");
    add(Principal, "Center");

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });

    setSize(1050, 740);
    setResizable(true);
    setTitle("uwu");
    setVisible(true);
  }

  public static void main(String[] args) {
    new MainClass();
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
  }
}
