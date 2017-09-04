
package proyecto_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class SuperUsua extends JFrame {
    
     private JButton Admin;
    private JButton Asig;
    private JButton Desig;
    private JButton Cajero;

    public SuperUsua(){
        
        setSize(600, 600);
        setTitle("Super Usuario");
        setLayout(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setResizable(true);

        Admin = new JButton("Administrar");
        Asig = new JButton("Asignar");
        Desig = new JButton("Denominar");
        Cajero = new JButton("Cajero");
       

        //add
        add(Admin);
        add(Asig);
        add(Desig);
        add(Cajero);
   
        //prop
        Admin.setHorizontalTextPosition(SwingConstants.CENTER);
        Admin.setVerticalTextPosition(SwingConstants.BOTTOM);

        Asig.setHorizontalTextPosition(SwingConstants.CENTER);
        Asig.setVerticalTextPosition(SwingConstants.BOTTOM);

        Desig.setHorizontalTextPosition(SwingConstants.CENTER);
        Desig.setVerticalTextPosition(SwingConstants.BOTTOM);

        Cajero.setHorizontalTextPosition(SwingConstants.CENTER);
        Cajero.setVerticalTextPosition(SwingConstants.BOTTOM);


        //pocicionar
        Admin.reshape(20, 20, 400, 50);
        Asig.reshape(20, 70, 400, 50);
        Desig.reshape(20, 120,400, 50);
        Cajero.reshape(20, 170, 400, 50);
  
        
    }
    
}
