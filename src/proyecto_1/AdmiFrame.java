package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private JComboBox cbEmpresa;
    Object tab[];
    private Object Datoss[][]={{"No","Nombre","Deposito","Empresa"},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""},{" ","","",""}};
    private String Cab[] ={"No","Nombre","Deposito","Empresa"};
    
    private String Cash[] ={"Pro-Pisto", "Cahs-Money"};
    


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
        cbEmpresa = new JComboBox(Cash);
        tbtTabla = new JTable(Datoss,Cab);

        add(lbUsuario);
        add(txUsuario);
        add(lbDeposito);
        add(txDeposito);
        add(btAgregar);
        add(btBorrar);
        add(tbtTabla);
        add(cbEmpresa);
        
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
        tbtTabla.reshape(250, 80, 300, 400);
        cbEmpresa.reshape(260, 20, 100, 30);
        
                btAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                AgregarActionPerformed(evt);
            }

            private void AgregarActionPerformed(ActionEvent evt) {
                int cont=0;
                String nombre = txUsuario.getText();
                String Deposito = txUsuario.getText();
                String empresa = cbEmpresa.getToolTipText();
                    Object acom[]={ cont++,nombre,Deposito,empresa};
                
                    
                

            }
            

        });
                
           
        
    }
    


}
