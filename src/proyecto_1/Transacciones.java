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
    private JButton Efec1;
    private JButton Efec2;
    private JButton Efec3;
    private JButton Efec4;
    private JButton Efec5;
    private JButton Efec6;
    private JComboBox Lista;
    static String Listado[] = new String[6];
    static String GUARDA[][] = new String[10][5];
    Login Log = new Login();
    static String DE1="";
    static String DE2="";
    static String DE3="";
    static String DE4="";
    static String DE5="";
    static String DE6="";
    

    public void SaldoActual() {

        setSize(600, 600);
        setTitle("Saldo Actual");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        DateFormat Horas = new SimpleDateFormat("hh:mm:ss   dd/MM/yyyy");
        lbsaldo = new JLabel("Saldo: ");
        Saldo = new JLabel("");
        lbusua = new JLabel("Usuario: ");
        Usua = new JLabel("");
        lbemp = new JLabel("Empresa: ");
        Emp = new JLabel("");
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

        lbsaldo.reshape(200, 100, 100, 40);
        Saldo.reshape(300, 100, 1000, 40);
        lbusua.reshape(200, 200, 100, 40);
        Usua.reshape(300, 200, 1000, 40);
        lbemp.reshape(200, 300, 100, 40);
        Emp.reshape(300, 300, 100, 40);
        back.reshape(200, 420, 300, 20);
        Hora.reshape(600, 420, 300, 20);
        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        for (int i = 0; i < 10; i++) {

            if (Log.Usuario.getText().equals(GUARDA[i][1])) {

                Usua.setText(GUARDA[i][3]);
                Saldo.setText(GUARDA[i][4]);
                Emp.setText(GUARDA[i][0]);
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
        Efec1 = new JButton(DE1);
        Efec2 = new JButton(DE2);
        Efec3 = new JButton(DE3);
        Efec4 = new JButton(DE4);
        Efec5 = new JButton(DE5);
        Efec6 = new JButton(DE6);
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

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE1);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE1);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

            }
        });
        Efec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec2ActionPerformed(evt);

            }

            private void Efec2ActionPerformed(ActionEvent evt) {
                
                                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE2);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE2);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

            }
        });
        Efec3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec3ActionPerformed(evt);

            }

            private void Efec3ActionPerformed(ActionEvent evt) {
                
                                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE3);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE3);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

            }
        });
        Efec4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec4ActionPerformed(evt);

            }

            private void Efec4ActionPerformed(ActionEvent evt) {
                
                                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE4);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE4);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

            }
        });
        Efec5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec5ActionPerformed(evt);

            }

            private void Efec5ActionPerformed(ActionEvent evt) {
                
                                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE5);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE5);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

            }
        });
        Efec6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec6ActionPerformed(evt);

            }

            private void Efec6ActionPerformed(ActionEvent evt) {
                
                                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                        if (Log.Usuario.getText().equals(GUARDA[i][1]) && Lista.getSelectedItem().equals(GUARDA[j][1])) {

                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE6);
                            GUARDA[i][4] = "";
                            int Res2= Integer.parseInt(GUARDA[j][4])+Integer.parseInt(DE6);
                            GUARDA[j][4]="";
                            String RE = Integer.toString(Res);
                            String RE2 = Integer.toString(Res2);
                            GUARDA[i][4] = RE;
                            GUARDA[j][4]=RE2;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]+GUARDA[j][4]);
                        }
                    }

                }

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
        Efec1 = new JButton(DE1);
        Efec2 = new JButton(DE2);
        Efec3 = new JButton(DE3);
        Efec4 = new JButton(DE4);
        Efec5 = new JButton(DE5);
        Efec6 = new JButton(DE6);
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
        Efec1 = new JButton(DE1);
        Efec2 = new JButton(DE2);
        Efec3 = new JButton(DE3);
        Efec4 = new JButton(DE4);
        Efec5 = new JButton(DE5);
        Efec6 = new JButton(DE6);
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

                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {

                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE1)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE1);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

            }
        });
        Efec2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {
                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE2)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE2);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

            }
        });
        Efec3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {
                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {

                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE3)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE1);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

            }
        });
        Efec4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {
                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE4)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE4);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

            }
        });
        Efec5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {

                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE5)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE5);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

            }
        });
        Efec6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Efec1ActionPerformed(evt);

            }

            private void Efec1ActionPerformed(ActionEvent evt) {

                for (int i = 0; i < 10; i++) {

                    if (Log.Usuario.getText().equals(GUARDA[i][1])) {

                        if (Integer.parseInt(GUARDA[i][4]) > Integer.parseInt(DE6)) {
                            int Res = Integer.parseInt(GUARDA[i][4]) - Integer.parseInt(DE6);
                            GUARDA[i][4] = "";
                            String RE = Integer.toString(Res);
                            GUARDA[i][4] = RE;
                            JOptionPane.showMessageDialog(null, "" + GUARDA[i][4]);
                        } else {

                            JOptionPane.showMessageDialog(null, "Sado Insuficiente");
                        }

                    }

                }

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
