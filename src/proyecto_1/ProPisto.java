package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ProPisto extends JFrame {

    private JButton SaldoA;
    private JButton TraEst;
    private JButton TraLib;
    private JButton Retiro;
    private JButton Histor;
    private JButton back;
    
    public ProPisto() {

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
