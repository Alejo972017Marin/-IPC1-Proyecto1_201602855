package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Transacciones extends JFrame {

    JLabel Saldo;
    JLabel Usua;
    JLabel Emp;
    private JLabel lbsaldo;
    private JLabel lbusua;
    private JLabel lbemp;
    private JLabel Hora;

    private JButton back;
    String GUARDA[][] = new String[5][5];
    private JButton Efec1;
    private JButton Efec2;
    private JButton Efec3;
    private JButton Efec4;
    private JButton Efec5;
    private JButton Efec6;
    private JComboBox Lista;
    private String Listado[] = {"Seleccione", "Est1", "Est2", "Est3", "Est4", "Est5", "Est6"};

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

        Date Hor;
        Calendar cal;
        setSize(600, 600);
        setTitle("Saldo Actual");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        Hor = new Date();
        DateFormat Horas = new SimpleDateFormat("hh:mm:ss   dd/MM/yyyy");
        lbsaldo = new JLabel("Saldo: ");
        Saldo = new JLabel("");
        lbusua = new JLabel("Usuario: ");
        Usua = new JLabel("");
        lbemp = new JLabel("Empresa: ");
        Emp = new JLabel("ProPisto");
        back = new JButton("TRANSACCION NUEVA");
        Hora = new JLabel(Horas.format(new Date()));
        add(Saldo);
        add(Usua);
        add(Emp);
        add(back);
        add(lbsaldo);
        add(lbusua);
        add(lbemp);
        add(Hora);
        SuperUsua SUP = new SuperUsua();
        Login Log = new Login();

        lbsaldo.reshape(200, 100, 100, 40);
        Saldo.reshape(300, 100, 100, 40);
        lbusua.reshape(200, 200, 100, 40);
        Usua.reshape(300, 200, 100, 40);
        lbemp.reshape(200, 300, 100, 40);
        Emp.reshape(300, 300, 100, 40);
        back.reshape(200, 420, 300, 20);
        Hora.reshape(600, 420, 300, 20);
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
        setSize(600, 600);
        setTitle("Transferencias Predeterminadas");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        Efec1 = new JButton("50");
        Efec2 = new JButton("100");
        Efec3 = new JButton("200");
        Efec4 = new JButton("300");
        Efec5 = new JButton("400");
        Efec6 = new JButton("500");
        Lista = new JComboBox(Listado);
        back = new JButton("TRANSACCION NUEVA");

        add(Efec1);
        add(Efec2);
        add(Efec3);
        add(Efec4);
        add(Efec5);
        add(Efec6);
        add(Lista);
        add(back);

        Efec1.reshape(200, 200, 200, 50);
        Efec2.reshape(200, 300, 200, 50);
        Efec3.reshape(200, 400, 200, 50);
        Efec4.reshape(600, 200, 200, 50);
        Efec5.reshape(600, 300, 200, 50);
        Efec6.reshape(600, 400, 200, 50);
        Lista.reshape(200, 100, 200, 50);
        back.reshape(200, 500, 100, 20);
         Efec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {
                

            }
        });
        Efec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

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

    public void TransferenciaLibre() {
        setSize(600, 600);
        setTitle("Transferencias Libres");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        Efec1 = new JButton("50");
        Efec2 = new JButton("100");
        Efec3 = new JButton("200");
        Efec4 = new JButton("300");
        Efec5 = new JButton("400");
        Efec6 = new JButton("500");
        Lista = new JComboBox(Listado);
        back = new JButton("TRANSACCION NUEVA");

        add(Efec1);
        add(Efec2);
        add(Efec3);
        add(Efec4);
        add(Efec5);
        add(Efec6);
        add(Lista);
        add(back);

        Efec1.reshape(200, 200, 200, 50);
        Efec2.reshape(200, 300, 200, 50);
        Efec3.reshape(200, 400, 200, 50);
        Efec4.reshape(600, 200, 200, 50);
        Efec5.reshape(600, 300, 200, 50);
        Efec6.reshape(600, 400, 200, 50);
        Lista.reshape(200, 100, 200, 50);
        back.reshape(200, 500, 100, 20);

        Efec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

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

    public void Retiro() {

        setSize(600, 600);
        setTitle("Retiro");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        Efec1 = new JButton("50");
        Efec2 = new JButton("100");
        Efec3 = new JButton("200");
        Efec4 = new JButton("300");
        Efec5 = new JButton("400");
        Efec6 = new JButton("500");
        back = new JButton("TRANSACCION NUEVA");

        add(Efec1);
        add(Efec2);
        add(Efec3);
        add(Efec4);
        add(Efec5);
        add(Efec6);
        add(back);

        Efec1.reshape(200, 200, 200, 50);
        Efec2.reshape(200, 300, 200, 50);
        Efec3.reshape(200, 400, 200, 50);
        Efec4.reshape(600, 200, 200, 50);
        Efec5.reshape(600, 300, 200, 50);
        Efec6.reshape(600, 400, 200, 50);
        back.reshape(200, 500, 100, 20);

         Efec1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

            }
        });
        Efec6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

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

    public void Historial() {

    }

}
