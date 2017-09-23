package proyecto_1;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SuperUsua extends JFrame {
    
    private JButton Admin;
    private JButton Asig;
    private JButton Desig;
    private JButton Cajero;
    private JButton back;

    //**********************************************************************************************************************************************************
    private JButton SaldoA;
    private JButton TraEst;
    private JButton TraLib;
    private JButton Retiro;
    private JButton Histor;
    private JPanel jPanel1;
    
     //Instancias 
      UsuariosPro UP = new UsuariosPro();
      Login log = new Login();
      AdmiFrame ad = new AdmiFrame();
      private JLabel Imagen;

    public void ProPisto() {


        setSize(600, 600);
        setTitle("Pro-Pisto");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        this.getContentPane().setBackground(Color.GREEN);

        jPanel1 = new JPanel();
        SaldoA = new JButton("Sado Actual");
        TraEst = new JButton("Transferencias a Estudiantes");
        TraLib = new JButton("Transferencias Libres");
        Retiro = new JButton("Retiro");
        Histor = new JButton("Historial");
        back = new JButton("ATRAS");
        Imagen= new JLabel();
        //add
        add(jPanel1);
        add(SaldoA);
        add(TraEst);
        add(TraLib);
        add(Retiro);
        add(Histor);
        add(back);
        add(Imagen);
        //prop
        jPanel1.setBackground(Color.GREEN);
        SaldoA.setHorizontalTextPosition(SwingConstants.CENTER);
        SaldoA.setVerticalTextPosition(SwingConstants.BOTTOM);

        TraEst.setHorizontalTextPosition(SwingConstants.CENTER);
        TraEst.setVerticalTextPosition(SwingConstants.BOTTOM);

        TraLib.setHorizontalTextPosition(SwingConstants.CENTER);
        TraLib.setVerticalTextPosition(SwingConstants.BOTTOM);

        Retiro.setHorizontalTextPosition(SwingConstants.CENTER);
        Retiro.setVerticalTextPosition(SwingConstants.BOTTOM);

        Histor.setHorizontalTextPosition(SwingConstants.CENTER);
        Histor.setVerticalTextPosition(SwingConstants.BOTTOM);

        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        //pocicionar
        SaldoA.reshape(20, 20, 400, 50);
        TraEst.reshape(20, 70, 400, 50);
        TraLib.reshape(20, 120, 400, 50);
        Retiro.reshape(20, 170, 400, 50);
        Histor.reshape(20, 220, 400, 50);
        back.reshape(120, 420, 100, 20);
        Imagen.reshape(600,200,400,400);
        ImageIcon imagen = new ImageIcon("src/proyecto_1/ProPisto.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
        Imagen.setIcon(icono);
        this.repaint();
        
        String uap = log.Usuario.getText();
        
        
        

        SaldoA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                SaldoAActionPerformed(evt);
            }

            private void SaldoAActionPerformed(ActionEvent evt) {
                setVisible(false);
                Transacciones TR= new Transacciones();
                TR.SaldoActual();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);


          

            }

        });
        
     TraEst.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             TraEstActionPerformed(evt);
         }
         private void TraEstActionPerformed(ActionEvent evt){
                    setVisible(false);
                Transacciones TR= new Transacciones();
                TR.TransferenciaStudent();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
         
     });
     TraLib.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             TraLibActionPerformed(evt);
         }
         private void TraLibActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.TransferenciaLibre();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
     });
     
     Retiro.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             RetiroActionPerformed(evt);
             
         }
         private void RetiroActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.Retiro();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
         }
         
     });
        
     Histor.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             HistorActionPerformed(evt);
         }
         private void HistorActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.Historial();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
     });
    
        

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                Login lo = new Login();
                lo.setVisible(true);
            }

        });

    }
        //**********************************************************************************************************************************************************
    
   
     
    public void CashMoney() {

        setSize(600, 600);
        setTitle("Cash Money");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        this.getContentPane().setBackground(Color.GRAY);
        SaldoA = new JButton("Sado Actual");
        TraEst = new JButton("Transferencias a Estudiantes");
        TraLib = new JButton("Transferencias Libres");
        Retiro = new JButton("Retiro");
        Histor = new JButton("Historial");
        back = new JButton("ATRAS");

        //add
        add(SaldoA);
        add(TraEst);
        add(TraLib);
        add(Retiro);
        add(Histor);
        add(back);
        //prop
        SaldoA.setHorizontalTextPosition(SwingConstants.CENTER);
        SaldoA.setVerticalTextPosition(SwingConstants.BOTTOM);

        TraEst.setHorizontalTextPosition(SwingConstants.CENTER);
        TraEst.setVerticalTextPosition(SwingConstants.BOTTOM);

        TraLib.setHorizontalTextPosition(SwingConstants.CENTER);
        TraLib.setVerticalTextPosition(SwingConstants.BOTTOM);

        Retiro.setHorizontalTextPosition(SwingConstants.CENTER);
        Retiro.setVerticalTextPosition(SwingConstants.BOTTOM);

        Histor.setHorizontalTextPosition(SwingConstants.CENTER);
        Histor.setVerticalTextPosition(SwingConstants.BOTTOM);

        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        //pocicionar
        SaldoA.reshape(20, 20, 400, 50);
        TraEst.reshape(20, 70, 400, 50);
        TraLib.reshape(20, 120, 400, 50);
        Retiro.reshape(20, 170, 400, 50);
        Histor.reshape(20, 220, 400, 50);
        back.reshape(120, 420, 100, 20);
        Imagen= new JLabel();
        add(Imagen);
        
        Imagen.reshape(600,200,400,400);
        ImageIcon imagen = new ImageIcon("src/proyecto_1/CashMoney.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
        Imagen.setIcon(icono);
        this.repaint();
        
        
                SaldoA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                SaldoAActionPerformed(evt);
            }

            private void SaldoAActionPerformed(ActionEvent evt) {
                setVisible(false);
                Transacciones TR= new Transacciones();
                TR.SaldoActual();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);


          

            }

        });
        
     TraEst.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             TraEstActionPerformed(evt);
         }
         private void TraEstActionPerformed(ActionEvent evt){
                    setVisible(false);
                Transacciones TR= new Transacciones();
                TR.TransferenciaStudent();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
         
     });
     TraLib.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             TraLibActionPerformed(evt);
         }
         private void TraLibActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.TransferenciaLibre();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
     });
     
     Retiro.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             RetiroActionPerformed(evt);
             
         }
         private void RetiroActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.Retiro();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
         }
         
     });
        
     Histor.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent evt){
             HistorActionPerformed(evt);
         }
         private void HistorActionPerformed(ActionEvent evt){
              setVisible(false);
                Transacciones TR= new Transacciones();
                TR.Historial();
                
                TR.setExtendedState(JFrame.MAXIMIZED_BOTH);
                TR.setVisible(true);
             
         }
     });

        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                Login lo = new Login();
                lo.setVisible(true);
            }

        });

    }

    //**********************************************************************************************************************************************************
    public void SUperUsuario() {

        setSize(600, 600);
        setTitle("Super Usuario");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);

        Admin = new JButton("Administrar");
        Asig = new JButton("Asignar");
        Desig = new JButton("Denominar");
        Cajero = new JButton("Cajero");
        back = new JButton("ATRAS");

        //add
        add(Admin);
        add(Asig);
        add(Desig);
        add(Cajero);
        add(back);
        //prop
        Admin.setHorizontalTextPosition(SwingConstants.CENTER);
        Admin.setVerticalTextPosition(SwingConstants.BOTTOM);

        Asig.setHorizontalTextPosition(SwingConstants.CENTER);
        Asig.setVerticalTextPosition(SwingConstants.BOTTOM);

        Desig.setHorizontalTextPosition(SwingConstants.CENTER);
        Desig.setVerticalTextPosition(SwingConstants.BOTTOM);

        Cajero.setHorizontalTextPosition(SwingConstants.CENTER);
        Cajero.setVerticalTextPosition(SwingConstants.BOTTOM);

        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        //pocicionar
        Admin.reshape(20, 20, 400, 50);
        Asig.reshape(20, 70, 400, 50);
        Desig.reshape(20, 120, 400, 50);
        Cajero.reshape(20, 170, 400, 50);
        back.reshape(120, 420, 100, 20);
        Imagen= new JLabel();
        add(Imagen);
        
        Imagen.reshape(600,200,600,400);
        ImageIcon imagen = new ImageIcon("src/proyecto_1/Super.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
        Imagen.setIcon(icono);
        this.repaint();
        
        //eventos
        Admin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                AdminActionPerformed(evt);
            }

            private void AdminActionPerformed(ActionEvent evt) {
                setVisible(false);
                
                ad.AdmiFrame();
                ad.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ad.setVisible(true);

            }

        });
        
        Asig.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                AsigActionPerformed(evt);
                
            }
            private void AsigActionPerformed(ActionEvent evt){
                
                setVisible(false);
                ad.Asignar();
                ad.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ad.setVisible(true);
                
            }
        });
        
                Desig.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                DesigActionPerformed(evt);
                
            }
            private void DesigActionPerformed(ActionEvent evt){
                
                setVisible(false);
                ad.Denominaciones();
                ad.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ad.setVisible(true);
                
            }
        });

        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {
                setVisible(false);
                Login lo = new Login();
                lo.setVisible(true);
            }

        });

    }

}
