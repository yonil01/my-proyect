package Proyect;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;

public class VentanaMenu extends JFrame implements ActionListener{
    JPanel panel,panel1;
    JLabel nombre;
    JComboBox combo;
    ImageIcon imagen1,imagen2;
    JButton boton,boton1;
    JMenuBar bar;
    public VentanaMenu(){
    this.setSize(500,500);
    this.setTitle("Menu del usuario");
    this.setLocationRelativeTo(this);
   //this.setLayout(null);
    inicio();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    void inicio(){
        panel=new JPanel();
        panel.setLayout(null);
       //panel.setBounds(10, 10, 460, 60);
        panel.setBackground(java.awt.Color.decode("#0C512A"));
        this.getContentPane().add(panel);
        label();
        //boton();
        menu();
    
        
    }
    void label(){
        nombre = new JLabel("Rojas Rivadneiro Yonil Milton");
        nombre.setBounds(30, 20, 300, 30);
        nombre.setForeground(java.awt.Color.decode("#000000"));
        nombre.setFont(new Font("Calibri", Font.BOLD, 23));
        panel.add(nombre);
    }
    void boton(){
        combo=new JComboBox();
                combo.setBounds(410, 20, 30, 30);
                combo.setToolTipText("hola");
                combo.setVisible(false);
                panel.add(combo);
                
        imagen1=new ImageIcon("ima2.jpg");
        boton=new JButton();
        boton.setBounds(410, 20, 30, 30);
        boton.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                combo.setVisible(true);
            }
});
        boton.addActionListener(this);
        panel.add(boton);
    }
    void menu(){
        imagen1=new ImageIcon("e.jpg");
        imagen2=new ImageIcon("u.jpg");
          bar=new JMenuBar();
          bar.setBounds(410, 20, 30, 30);
          JMenu menu1=new JMenu();
          menu1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
          menu1.setBounds(410, 20, 30, 30);
          JMenuItem hello=new JMenuItem("Informacion Personal");
          hello.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
          hello.setBounds(100,100, 200, 20);
          JMenuItem a1=new JMenuItem("aasssdddsa");
          JMenuItem a2=new JMenuItem("rrrrr");
          menu1.add(hello);
           menu1.add(a1);
          bar.add(menu1);
          panel.add(bar);
          
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
