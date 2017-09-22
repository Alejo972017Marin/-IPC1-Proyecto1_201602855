package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Transacciones extends JFrame {

    JLabel Saldo;
    JLabel Usua;
    JLabel Emp;
    private JButton back;
    String GUARDA[][] = new String[5][5];

    public void SaldoActual() {

        GUARDA[0][0] = "*";
        GUARDA[0][1] = "alejo";
        GUARDA[0][2] = "123";
        GUARDA[0][3] = "Jose Alejandro";
        GUARDA[0][4] = "3000";

        GUARDA[1][0] = "*";
        GUARDA[1][1] = "ingrid";
        GUARDA[1][2] = "123";
        GUARDA[1][3] = "Colindres";
        GUARDA[1][4] = "3000";

        GUARDA[2][0] = "*";
        GUARDA[2][1] = "jose";
        GUARDA[2][2] = "123";
        GUARDA[2][3] = "Jose Grande";
        GUARDA[2][4] = "4000";

        GUARDA[3][0] = "*";
        GUARDA[3][1] = "karina";
        GUARDA[3][2] = "123";
        GUARDA[3][3] = "Karina Salpor";
        GUARDA[3][4] = "6000";

        GUARDA[4][0] = "*";
        GUARDA[4][1] = "silvia";
        GUARDA[4][2] = "123";
        GUARDA[4][3] = "Silvia Marleny";
        GUARDA[4][4] = "500";

        setSize(600, 600);
        setTitle("ProPisto");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);

        Saldo = new JLabel("");
        Usua = new JLabel("");
        Emp = new JLabel("ProPisto");
        back = new JButton("ATRAS");
        add(Saldo);
        add(Usua);
        add(Emp);
        add(back);

        SuperUsua SUP = new SuperUsua();
        Login Log = new Login();

        Saldo.reshape(100, 100, 100, 40);
        Usua.reshape(100, 300, 100, 40);
        Emp.reshape(100, 500, 100, 40);
        back.reshape(120, 420, 100, 20);
        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        for (int i = 0; i < 5; i++) {

            if (GUARDA[i][1].equals(Log.Usuario.getText())) {

                Usua.setText(GUARDA[i][1]);
                Saldo.setText(GUARDA[i][4]);

            }

        }

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

    public void TransferenciaStudent() {

    }

    public void TransferenciaLibre() {

    }

    public void Retiro() {

    }

    public void Historial() {

    }

}
