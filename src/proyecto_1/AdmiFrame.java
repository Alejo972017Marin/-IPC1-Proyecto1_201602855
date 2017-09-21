package proyecto_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class AdmiFrame extends JFrame {
    DefaultTableModel model= new DefaultTableModel();
    private JLabel lbUsuario;
    private JLabel lbDeposito;
    private JLabel usuLogin;
    private JLabel pasUsu;
    private JTextField txUsuario;
    public JTextField txDeposito;
    public JTextField UsuLogin;
    public JTextField PasUsu;
    private JComboBox cbEmpresa;
    private JButton btAgregar;
    private JButton btBorrar;
    JTable tbtTabla;
    private JButton back;
    int cont=0;
    int Codigo, sueldo;
    String Nombre, empresa;
    private Object datoss[][] = {{"Codigo", "Nombre", "Deposito", "Empresa", "UsuarioLogin", "ContraceñaLogin"}};
    private Object cab[]={"Codigo", "Nombre", "Deposito", "Empresa", "UsuarioLogin", "ContraceñaLogin"};
    private String Cash[] = {"Pro-Pisto", "Cahs-Money"};
    static String GUARDA[][]= new String[6][5];
    public AdmiFrame() {

        setSize(600, 600);
        setTitle("Administracion");
        JScrollPane sp = new JScrollPane(tbtTabla);
        getContentPane().add(sp);

        setLayout(null);
        //setDefaultCloseOperation(AdmiFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(AdmiFrame.HIDE_ON_CLOSE);
        setResizable(true);

        lbUsuario = new JLabel("Usuario:");
        txUsuario = new JTextField(10);
        lbDeposito = new JLabel("Deposito");
        txDeposito = new JTextField(10);
        usuLogin = new JLabel("Usuario Login:");
        UsuLogin = new JTextField(10);
        pasUsu = new JLabel("Contraseña : ");
        PasUsu = new JTextField(10);
        btAgregar = new JButton("Agregar");
        btBorrar = new JButton("Borrar");
        cbEmpresa = new JComboBox(Cash);
        tbtTabla= new JTable(datoss,cab);
        tbtTabla = new JTable(model);
        back = new JButton("ATRAS");

        model.addColumn("No");
        model.addColumn("Nombre");
        model.addColumn("Deposito");
        model.addColumn("Usuario");
        model.addColumn("Contraceña");
        this.tbtTabla.setModel(model);
        
        add(lbUsuario);
        add(txUsuario);
        add(lbDeposito);
        add(txDeposito);
        add(usuLogin);
        add(UsuLogin);
        add(pasUsu);
        add(PasUsu);
        add(btAgregar);
        add(btBorrar);
        add(tbtTabla);
        add(cbEmpresa);
        add(back);

        btAgregar.setHorizontalTextPosition(SwingConstants.CENTER);
        btAgregar.setVerticalTextPosition(SwingConstants.BOTTOM);

        btBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
        btBorrar.setVerticalTextPosition(SwingConstants.BOTTOM);

        back.setHorizontalTextPosition(SwingConstants.CENTER);
        back.setVerticalTextPosition(SwingConstants.BOTTOM);

        lbUsuario.reshape(20, 20, 100, 30);
        txUsuario.reshape(100, 20, 100, 30);
        lbDeposito.reshape(20, 80, 100, 30);
        txDeposito.reshape(100, 80, 100, 30);
        usuLogin.reshape(20, 140, 100, 30);//
        UsuLogin.reshape(100, 140, 100, 30);
        pasUsu.reshape(20, 200, 100, 30);//
        PasUsu.reshape(100, 200, 100, 30);
        btAgregar.reshape(20, 250, 100, 50);
        btBorrar.reshape(120, 250, 100, 50);
        tbtTabla.reshape(250, 80, 400, 500);
        cbEmpresa.reshape(260, 20, 100, 30);
        back.reshape(120, 420, 100, 20);
        // UsuariosCash UC = new UsuariosCash();
        //String UsuCash[] = UC.UsuCash;

        UsuariosPro UPO = new UsuariosPro();
        
        
        btAgregar.addActionListener(new ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }

            private void btAgregarActionPerformed(ActionEvent evt) {
       
                    GUARDA[cont][0]="";
                    GUARDA[cont][1]=UsuLogin.getText();
                    GUARDA[cont][2]=PasUsu.getText();
                    GUARDA[cont][3]=txUsuario.getText();
                    GUARDA[cont][4]=txDeposito.getText();
                    model.addRow(GUARDA);      
                

                cont++;
            }
            

        });
       
       
        btBorrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }

            private void btBorrarActionPerformed(ActionEvent evt) {
            
               
                        JOptionPane.showMessageDialog(null, "reg: " + GUARDA[0][0]);
                        JOptionPane.showMessageDialog(null, "UsuLog: " + GUARDA[0][1]);
                        JOptionPane.showMessageDialog(null, "pas: " + GUARDA[0][2]);
                        JOptionPane.showMessageDialog(null, "Usuario: " + GUARDA[0][3]);
                        JOptionPane.showMessageDialog(null, "Deposito: " + GUARDA[0][4]);
                        JOptionPane.showMessageDialog(null, "reg: " + GUARDA[1][0]);
                        JOptionPane.showMessageDialog(null, "UsuLog: " + GUARDA[1][1]);
                        JOptionPane.showMessageDialog(null, "pas: " + GUARDA[1][2]);
                        JOptionPane.showMessageDialog(null, "Usuario: " + GUARDA[1][3]);
                        JOptionPane.showMessageDialog(null, "Deposito: " + GUARDA[1][4]);
                
                        

                    
                

            }

        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }

            private void backActionPerformed(ActionEvent evt) {

                setVisible(false); 
                new Login().setVisible(true); 
                
                
            }

        });

    }

    public void Asignar() {

    }

    public void Cajero() {

    }

    public void Denominaciones() {
        

    }

}
