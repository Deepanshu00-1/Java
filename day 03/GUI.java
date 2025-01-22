package day03;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        // Graphical User Interface
        String name = JOptionPane.showInputDialog("Enter Your Name");
        // JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Hello "+name+" you are "+age+" years old and "+height+" cm tall");

    }
}
