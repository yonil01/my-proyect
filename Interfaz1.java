package Proyect;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;

public class Interfaz1 extends JFrame implements ActionListener{
    JPanel panel;
    ImageIcon imagen1;  
    JLabel ima1,lblusuario,lblconraseña,lblaviso1;
    JTextField txtusuario,txtcontraseña;
    JButton btniniciar,btncancelar,btncrear;
    InterfazCrear v1=new InterfazCrear();
    public Interfaz1(){
       this.setSize(400,600);
       this.setTitle("Cuenta de Usuario");
       this.setLocationRelativeTo(this);
       this.setIconImage(new ImageIcon(getClass().getResource("../iamgen/descarga.png")).getImage());
       panel();
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    void panel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        imagen();
        label();
        texto();
        boton();
    }
    void label(){
        lblusuario = new JLabel();
        lblusuario.setText("Usuario:");
        lblusuario.setBounds(80, 180, 100, 20);
        panel.add(lblusuario);
        //
        lblconraseña=new JLabel();
        lblconraseña.setText("Contraseña:");
        lblconraseña.setBounds(80, 220, 100, 20);
        panel.add(lblconraseña);
        //
        lblaviso1=new JLabel("Crear una cuenta");
        lblaviso1.setBounds(145, 300, 150, 20);
        lblaviso1.setFont(new Font("Calibri", Font.BOLD, 14));
        Font font=lblaviso1.getFont();
        Map atributes=font.getAttributes();
        atributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblaviso1.setFont(font.deriveFont(atributes));
        lblaviso1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cambia(lblaviso1,Color.BLUE, Color.BLACK);
        lblaviso1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                v1.setVisible(true);
                dispose();
            }
});
        panel.add(lblaviso1);
   }
    void texto(){
        txtusuario=new JTextField();
        txtusuario.setBounds(80, 200, 230, 20);
        panel.add(txtusuario);
        //
        txtcontraseña=new JTextField();
        txtcontraseña.setBounds(80, 240, 230, 20);
        panel.add(txtcontraseña);
    }
    void imagen(){ 
        imagen1=new ImageIcon("ima1.jpg");
        ima1=new JLabel();
        ima1.setBounds(135, 50, 100, 100);
        ima1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(ima1.getWidth(), ima1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(ima1);
    }
    void boton(){
        btniniciar=new JButton();
        btniniciar.setText("iniciar sesion");
        btniniciar.setBounds(80, 270, 110, 20);
        
        btniniciar.addActionListener(this);
        panel.add(btniniciar);
        //
        btncancelar=new JButton();
        btncancelar.setText("cancelar");
        btncancelar.setBounds(200, 270, 110, 20);
        btncancelar.addActionListener(this);
        panel.add(btncancelar);
    }
    void cambia(JLabel tex,Color c1,Color c2){
        tex.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent r){
                tex.setForeground(c1);
            }
            @Override
            public void mouseExited(MouseEvent e){
                tex.setForeground(c2);
            }
});
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btncancelar){
           System.exit(0);
        }
    }
}
