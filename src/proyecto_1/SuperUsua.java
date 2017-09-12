package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class SuperUsua extends JFrame {

    private JButton Admin;
    private JButton Asig;
    private JButton Desig;
    private JButton Cajero;
    private JButton back;
    
    //*******************************************************
        private JButton SaldoA;
    private JButton TraEst;
    private JButton TraLib;
    private JButton Retiro;
    private JButton Histor;
   
   
  
    
    public void ProPisto() {

        setSize(600, 600);
        setTitle("Pro-Pisto");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);

        SaldoA = new JButton("Sado Actual");
        TraEst = new JButton("Transferencias a Estudiantes");
        TraLib = new JButton("Transferencias Libres");
        Retiro = new JButton("Retiro");
        Histor = new JButton("Historial");
        back = new JButton("Regresar");

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
        TraLib.reshape(20, 120,400, 50);
        Retiro.reshape(20, 170, 400, 50);
        Histor.reshape(20, 220, 400, 50);
        back.reshape(120, 420, 100, 20);
        
                 Login log= new Login();
                 String uap = log.Usuario.getText();
                UsuariosPro UP= new UsuariosPro();
                String Up[]=UP.USUARIO;
                
                
         SaldoA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                SaldoAActionPerformed(evt);
            }

            private void SaldoAActionPerformed(ActionEvent evt) {
               
                if (uap.equals("INGRID")) {
                 JOptionPane.showMessageDialog(null, "PINCHE PUTO 10000 quetzales");
                   
                    
                }else  {
                JOptionPane.showMessageDialog(null," Usuario:"+ uap);
                }
                    
                

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
    //*************************
   
    
    public void CashMoney(){
        
        setSize(600, 600);
        setTitle("Cash Money");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);

        SaldoA = new JButton("Sado Actual");
        TraEst = new JButton("Transferencias a Estudiantes");
        TraLib = new JButton("Transferencias Libres");
        Retiro = new JButton("Retiro");
        Histor = new JButton("Historial");

        //add
        add(SaldoA);
        add(TraEst);
        add(TraLib);
        add(Retiro);
        add(Histor);
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

        //pocicionar
        SaldoA.reshape(20, 20, 400, 50);
        TraEst.reshape(20, 70, 400, 50);
        TraLib.reshape(20, 120,400, 50);
        Retiro.reshape(20, 170, 400, 50);
        Histor.reshape(20, 220, 400, 50);

    }
    
    
    
    //*****************
    public void SUperUsuario(){
        
            setSize(600, 600);
        setTitle("Super Usuario");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);
        
        
         Admin = new JButton("Administrar");
        Asig = new JButton("Asignar");
        Desig = new JButton("Denominar");
        Cajero = new JButton("Cajero");
        back = new JButton("Regresar");

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
        
        //eventos
                Admin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                AdminActionPerformed(evt);
            }

            private void AdminActionPerformed(ActionEvent evt) {
                setVisible(false);
                AdmiFrame ad = new AdmiFrame();
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
