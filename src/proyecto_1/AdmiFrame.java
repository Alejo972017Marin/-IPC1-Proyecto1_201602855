package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdmiFrame extends JFrame {

    private JLabel lbUsuario;
    private JLabel lbDeposito;
    private JTextField txUsuario;
    private JTextField txDeposito;
    private JButton btAgregar;
    private JButton btBorrar;
    private JTable tbtTabla;
    Object tab[];
    Object Datoss[];
    


    public AdmiFrame() {

        setSize(600, 600);
        setTitle("Administracion");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);

        lbUsuario = new JLabel("Usuario:");
        txUsuario = new JTextField(10);
        lbDeposito = new JLabel("Deposito");
        txDeposito = new JTextField(10);
        btAgregar = new JButton("Agregar");
        btBorrar = new JButton("Borrar");
        tbtTabla = new JTable(100,4);

        add(lbUsuario);
        add(txUsuario);
        add(lbDeposito);
        add(txDeposito);
        add(btAgregar);
        add(btBorrar);
        add(tbtTabla);

        btAgregar.setHorizontalTextPosition(SwingConstants.CENTER);
        btAgregar.setVerticalTextPosition(SwingConstants.BOTTOM);

        btBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
        btBorrar.setVerticalTextPosition(SwingConstants.BOTTOM);

        
        lbUsuario.reshape(20, 20, 100, 30);
        txUsuario.reshape(100, 20, 100, 30);
        lbDeposito.reshape(20, 80,100, 30);
        txDeposito.reshape(100, 80, 100, 30);
        btAgregar.reshape(20, 150, 100, 50);
        btBorrar.reshape(120, 150, 100, 50);
        tbtTabla.reshape(250, 50, 300, 400);
        
                btAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                CancelarActionPerformed(evt);
            }

            private void CancelarActionPerformed(ActionEvent evt) {

                String nombre = txUsuario.getText();
                String Deposito = txUsuario.getText();
                    Object acom[]={nombre,Deposito};
                
                

            }

        });
        
    }
    
        public void llenarTabla(String nombre , double deposito){
       
        this.Datoss[10]= tab[10];
        
        
    }

}
