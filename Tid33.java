// Filen Tid.java

import java.util.*;
import javax.swing.*;

public class Tid33 {

  static String klockan() {
    String s = Calendar.getInstance().getDate().toString();
    //    System.out.println(s);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String t = sdf.format(s); 
    System.out.println("test "+t);
   
    int i = s.indexOf(':');
    return s.substring(i-2, i+6);
  }

  // Testprogram
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Klockan �r llll : " + klockan());
  }
}
