package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {

    public JTextField Usuario;
    private JLabel usuario;
    //private JTextField Pasword;
    //private JLabel pasword;
    private JButton Aceptar;
    private JButton Cancelar;
    public String UAPp;

    public Login() {
        setSize(320, 220);
        setTitle("Login");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);

        //Inicializar 
        Usuario = new JTextField(10);
        usuario = new JLabel("USUARIO:");
        //  Pasword = new JTextField(4);
        //  pasword = new JLabel("PIN:");
        Aceptar = new JButton("Confirmar");
        Cancelar = new JButton("Cancelar");
        
      

        //agregar
        //add();
        add(usuario);
        add(Usuario);
        // add(pasword);
        // add(Pasword);
        add(Aceptar);
        add(Cancelar);
        //prop

        Aceptar.setHorizontalTextPosition(SwingConstants.CENTER);
        Aceptar.setVerticalTextPosition(SwingConstants.BOTTOM);

        Cancelar.setHorizontalTextPosition(SwingConstants.CENTER);
        Cancelar.setVerticalTextPosition(SwingConstants.BOTTOM);

        //posicionar
        // .reshape(x,y,dimx,dimy);
        usuario.reshape(20, 20, 100, 20);
        Usuario.reshape(120, 20, 100, 20);
        // pasword.reshape(20, 45, 100, 20);
        // Pasword.reshape(120, 45, 100, 20);
        Aceptar.reshape(20, 67, 95, 30);
        Cancelar.reshape(120, 67, 95, 30);
 //igualando valores usuarip
                         
        
        //events
        //BOTON ACEPTAR ACCION
        Aceptar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                AceptarActionPerformed(evt);
            }

            private void AceptarActionPerformed(ActionEvent evt) {
                if (Usuario.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Introdusca su Usuario ");
                    Usuario.requestFocusInWindow();
                    return;
                }

                //validadndo
                SuperUsuario sup = new SuperUsuario();

                if (sup.SuperUsuario(Usuario.getText())) {
                    Usuario.setText(" ");
                    setVisible(false);
                    SuperUsua Sup = new SuperUsua();
                    Sup.SUperUsuario();

                    Sup.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    Sup.setVisible(true);

                    return;
                }

                UsuariosPro UP = new UsuariosPro();
                if (UP.UsuariosPro(Usuario.getText())) {
                       
                    Usuario.setText(" ");
                    setVisible(false);
                         SuperUsua Sup = new SuperUsua();
                    Sup.ProPisto();

                    Sup.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    Sup.setVisible(true);

                    return;
                }

                UsuariosCash UC = new UsuariosCash();
                if (UC.UsuariosCash(Usuario.getText())) {

                    Usuario.setText(" ");
                    setVisible(false);
                   SuperUsua Sup = new SuperUsua();
                   Sup.CashMoney();

                    Sup.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    Sup.setVisible(true);

                    return;

                } else {
                    Usuario.setText(" ");
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
                    return;
                }

                //QQQQQQ
            }

        });
        //BOTTON CANCELAR ACCION
        Cancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                CancelarActionPerformed(evt);
            }

            private void CancelarActionPerformed(ActionEvent evt) {

                Usuario.setText(" ");

            }

        });

    }
    
    
    


}
