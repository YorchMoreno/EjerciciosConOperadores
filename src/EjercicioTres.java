import javax.swing.*;

public class EjercicioTres {
    public static void main(String[] args) {


        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre completo");
        String nonbre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre completo");
        String nonbre3 = JOptionPane.showInputDialog("Ingrese el tercer nombre completo");
        
        if (nombre1.length() > nonbre2.length() & nombre1.length() > nonbre3.length()){
            JOptionPane.showMessageDialog(null,"el nombre de " + nombre1 + " es el mas largo");
        } else if (nonbre2.length() > nombre1.length() & nonbre2.length() > nonbre3.length()) {
            JOptionPane.showMessageDialog(null,"el nombre de " + nonbre2 + " es el mas largo");
        } else if (nonbre3.length() > nombre1.length() & nonbre3.length() > nonbre2.length()) {
            JOptionPane.showMessageDialog(null,"el nombre de " + nonbre3 + " es el mas largo");
        }
    }
}
