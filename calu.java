import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionLister{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionsButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Calculator(){

    }

    public static void main(String[] args) {
		
          Calculator calc = new Calculator();
    }
}