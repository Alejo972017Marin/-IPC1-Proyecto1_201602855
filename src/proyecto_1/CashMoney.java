
package proyecto_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class CashMoney extends JFrame{
    private JButton SaldoA;
    private JButton TraEst;
    private JButton TraLib;
    private JButton Retiro;
    private JButton Histor;
    
    public CashMoney(){
        
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
    
}
