package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class SuperUsua extends JFrame {

    private JButton Admin;
    private JButton Asig;
    private JButton Desig;
    private JButton Cajero;
    private JButton back;

    public SuperUsua() {

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
