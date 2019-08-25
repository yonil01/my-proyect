package Proyect;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class InterfazCrear extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lblaviso1,lblnombre,lblapellido,lbledad,lblcorreo,lblcontra,lblnrocel,lblcodigo,lblejem1,lblejem2,lblejem3,lblejem4;
    JTextField txtnombre,txtapellido,txtedad,txtcorreo,txtcontra,txtnrocel,txtcodigo;
    JButton btnregistar,btnlimpiar,btnatras;
    JPasswordField contra;
    MetodoCrear a=new MetodoCrear();
    Interfaz1 v0;
    public InterfazCrear(){
        this.setSize(500, 500);
        this.setTitle("Crear Cuenta");
        this.setLocationRelativeTo(this);
        this.setIconImage(new ImageIcon(getClass().getResource("../iamgen/ima1.jpg")).getImage());
        panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void panel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        label();
        texto();
        boton();
    }
    void label(){
        lblaviso1=new JLabel("COMPLETE SUS DATOS");
        lblaviso1.setBounds(180, 20, 200, 30);
        panel.add(lblaviso1);
        
        lblnombre=new JLabel("Nombre: ");
        lblnombre.setBounds(40,60,100,20);
        panel.add(lblnombre);
        
        lblapellido=new JLabel("Apellido: ");
        lblapellido.setBounds(40,110,100,20);
        panel.add(lblapellido);
        
        lbledad=new JLabel("Edad: ");
        lbledad.setBounds(40,160,100,20);
        panel.add(lbledad);
        
        lblcorreo=new JLabel("Correo: ");
        lblcorreo.setBounds(40,210,100,20);
        panel.add(lblcorreo);
        
        lblejem1=new JLabel("ejemplo: ejemplo@hotmail.com");
        lblejem1.setBounds(40,245,200,20);
        lblejem1.setFont(new Font("Calibri",1,11));
        panel.add(lblejem1);
        
        lblcontra=new JLabel("Contraseña: ");
        lblcontra.setBounds(40,260,100,20);
        panel.add(lblcontra);
        
        lblejem2=new JLabel("Mas de 8 caracteres");
        lblejem2.setBounds(40,295,200,20);
        lblejem2.setFont(new Font("Calibri",1,11));
        panel.add(lblejem2);
        
        lblnrocel=new JLabel("Nro. Celular: ");
        lblnrocel.setBounds(40,310,100,20);
        panel.add(lblnrocel);
        
        
        lblcodigo=new JLabel("CODIGO: ");
        lblcodigo.setFont(new Font("Tahoma", 1, 11));
        lblcodigo.setBounds(280,80,100,20);
        panel.add(lblcodigo);
        
        lblejem3=new JLabel("Codigo de 2 caracteres");
        lblejem3.setBounds(280,115,130,20);
        lblejem3.setFont(new Font("Calibri",1,11));
        panel.add(lblejem3);
    }
    String PlaceHolder="";
    void setPlaceHolder(String PlaceHolder){
        this.PlaceHolder=PlaceHolder;
    }
    String getPlaceHolder(){
        return PlaceHolder;
    }
    void texto(){

        txtnombre=new JTextField();
        txtnombre.setBounds(40, 80, 200, 20);
        typed(txtnombre, true, false, 0);
        pressed(txtnombre, "Nombre");
        Focus(txtnombre, "Nombre");
        mouse(txtnombre, "Nombre");
        textmensaje(txtnombre,"Nombre",0);
        panel.add(txtnombre);
        
        txtapellido=new JTextField();
        txtapellido.setBounds( 40, 130, 200, 20);
        typed(txtapellido, true, false, 0);  
        pressed(txtapellido, "Apellido");
        Focus(txtapellido, "Apellido");
        mouse(txtapellido, "Apellido");
        textmensaje(txtapellido,"Apellido",0);
        panel.add(txtapellido);
        
        txtedad=new JTextField();
        txtedad.setBounds(40, 180, 200, 20);
        typed(txtedad,false, true, 2);
        pressed(txtedad, "Edad");
        Focus(txtedad, "Edad");
        mouse(txtedad, "Edad");
        textmensaje(txtedad,"Edad",0);
        panel.add(txtedad);
        
        txtcorreo=new JTextField();
        txtcorreo.setBounds(40, 230, 200, 20);
        pressed(txtcorreo, "ejemplo: ejemplo@hotmail.com");
        Focus(txtcorreo, "ejemplo: ejemplo@hotmail.com");
        mouse(txtcorreo, "ejemplo: ejemplo@hotmail.com");
        textmensaje(txtcorreo,"ejemplo: ejemplo@hotmail.com",0);
        panel.add(txtcorreo);
        
        txtnrocel=new JTextField();
        txtnrocel.setBounds(40, 330, 200, 20);
        typed(txtnrocel, false, true, 9);
        pressed(txtnrocel, "Ejemplo: 987654321");
        Focus(txtnrocel, "Ejemplo: 987654321");
        mouse(txtnrocel, "Ejemplo: 987654321");
        textmensaje(txtnrocel, "Ejemplo: 987654321",0);
        panel.add(txtnrocel);
        
        txtcodigo=new JTextField();
        txtcodigo.setBounds(280,100,100,20);
        typed(txtcodigo, false, true, 2);
        pressed(txtcodigo, "Ejemplo: 21");
        Focus(txtcodigo, "Ejemplo: 21");
        mouse(txtcodigo, "Ejemplo: 21");
        textmensaje(txtcodigo,"Ejemplo: 21",0);
        panel.add(txtcodigo);
        
        
        contra=new JPasswordField();
        contra.setBounds(40,280,200,20);
        pressed(contra, "**********");
        Focus(contra, "**********");
        mouse(contra, "**********");
        textmensaje(contra, "**********", 0);
        panel.add(contra);


    }
    void typed(JTextField let,boolean A,boolean B,int nro){
        let.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char a=e.getKeyChar();
                if(A){
                    if(Character.isDigit(a)){
                    e.consume();
                }
                }else{
                    if(!Character.isDigit(a)){
                        e.consume();
                    }
                }
                int nu=let.getText().length();
                if(B){
                    if(nu>=nro){
                    e.consume();
                }
                }
            }
});
    }
    void pressed(JTextField tex,String mensaje){
        tex.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent t){
                        Click(tex,mensaje);
                        tex.setBackground(Color.white);
                    }
});
    }
    void Focus(JTextField tex,String mensaje){
        tex.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e){
                textmensaje(tex, mensaje, tex.getText().length());
            }
});
    }
    void mouse(JTextField tex,String mensaje){
        tex.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                Click(tex,mensaje);
                tex.setBackground(Color.white);
            }
});
    }
    void textmensaje(JTextField letra,String mensaje,int tamaño){
        if(tamaño==0){
            letra.setText(mensaje);
            letra.setForeground(java.awt.Color.decode("#818181"));
        }
    }
    void Click(JTextField letra,String mensaje){
        if(letra.getText().equals(mensaje)){
        letra.setText("");
        letra.setForeground(java.awt.Color.decode("#000000"));
    }
    }

    void boton(){
        btnregistar=new JButton("Registrar");
        btnregistar.setBounds(330, 370, 100, 20);
        btnregistar.addActionListener(this);
        panel.add(btnregistar);
        
        btnatras=new JButton("Atras");
        btnatras.setBounds(220, 370, 100, 20);
        btnatras.addActionListener(this);
        panel.add(btnatras);
        
        btnlimpiar=new JButton("Limpiar");
        btnlimpiar.setBounds(280,140,100,20);
        btnlimpiar.addActionListener(this);
        panel.add(btnlimpiar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnregistar){
            if(Respuesta()){
                registrar();
            } 
        }
        
        if(e.getSource()==btnatras){
            v0=new Interfaz1();
            v0.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==btnlimpiar){
            limpiar();
        }
    }
    boolean Respuesta(){
        String ed=String.valueOf(getedad()); //YON
        String cd=String.valueOf(getcodigo());
        boolean h=true;
        h=prueba(h, txtnombre, "NOMBRE","Nombre");
        h=prueba(h, txtapellido, "APELLIDO","Apellido"); //CAR
        h=prueba(h, txtedad, "EDAD","Edad");
        h=prueba(h, txtcorreo, "CORREO","ejemplo: ejemplo@hotmail.com");
        h=prueba(h, txtcontra, "CONTRASEÑA","**********");
        h=prueba(h, txtnrocel, "NRO: CELULAR","Ejemplo: 987654321");
        h=prueba(h, txtcodigo, "CODIGO","Ejemplo: 21");
        return h;
    }
    boolean prueba(boolean k,JTextField u,String mensaje,String pro){
        if(k){
            k=rest(u, mensaje,pro);
        }
        return k;
    }
    boolean rest(JTextField t,String mensaje,String pru){
        if(t.getText().equals(pru)){
            t.setBackground(Color.red);
            mensaje("El "+mensaje+" esta incompleto!! :(");
            return false;
        }
        return true;
    }
    void limpiar(){
        otravez(txtnombre, "Nombre");
        otravez(txtapellido, "Apellido");
        otravez(txtedad, "Edad");
        otravez(txtcorreo, "ejemplo: ejemplo@hotmail.com");
        otravez(contra, "**********");
        otravez(txtnrocel, "Ejemplo: 987654321");
        otravez(txtcodigo, "Ejemplo: 21");
        
    }
    void otravez(JTextField tex,String mensaje){
        tex.setText(mensaje);
        tex.setForeground(java.awt.Color.decode("#818181"));
    }
    public String getnombre() {
        return txtnombre.getText();
    }

    public void setnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public String getapellido() {
        return txtapellido.getText();
    }

    public void setapellido(JTextField txtapellido) {
        this.txtapellido = txtapellido;
    }

    public String getedad() {
        return txtedad.getText();
    }

    public void setedad(JTextField txtedad) {
        this.txtedad = txtedad;
    }

    public String getcorreo() {
        return txtcorreo.getText();
    }

    public void setcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }
    String getcontra(){
        String cad="";
        char[] let=contra.getPassword();
        for(int i=0;i<let.length;i++){
            cad+=let[1];
        }
        return cad;
    }


    public String getnrocel() {
        return txtnrocel.getText();
    }

    public void setnrocel(JTextField txtnrocel) {
        this.txtnrocel = txtnrocel;
    }

    public String getcodigo() {
        return txtcodigo.getText();
    }

    public void setcodigo(JTextField txtcodigo) {
        this.txtcodigo = txtcodigo;
    }
    void mensaje(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    int edad(){
        return Integer.parseInt(txtedad.getText());
    }
    int codigo(){
        return Integer.parseInt(txtcodigo.getText());
    }
    void registrar(){
        Usuario e=a.buscar(codigo());
        if(e==null){
            e=new Usuario(getnombre(), getapellido(), edad(), getcorreo(), getcontra(), getnrocel(), codigo());
            a.aumentar(e);
            a.grabar();
            mensaje("El usuario fue registrado exitosamente :) ");
        }else{
            mensaje("El codigo ya existe");
        }
    }

}
