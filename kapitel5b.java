import javax.swing.*;

public class Kapitel5b {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("H�jd?");
    double h = Double.parseDouble(s);
    int i=0;
    boolean toBig = false;

    while (h > 0.01) {
      h = h * 0.7;
      i= i + 1;
      if (i > 100) {
	  toBig = true;
	  break;
      }
    }
    if (toBig) {
	JOptionPane.showMessageDialog(null, "H�jden �r f�r h�g och antalet studs blir fler �n 100 g�nger");
    }
    else {
	JOptionPane.showMessageDialog(null, "Den studsar " + i + " g�nger");
    }
  }
}