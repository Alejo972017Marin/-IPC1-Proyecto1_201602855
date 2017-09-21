
package proyecto_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Transacciones extends JFrame {

    JLabel Saldo;
    JLabel Usua;
    JLabel Emp;

    public void SaldoActual(){
         setSize(600, 600);
        setTitle("Cash Money");
        setLayout(null);
        setDefaultCloseOperation(SuperUsua.EXIT_ON_CLOSE);
        setResizable(true);
        
        Saldo = new JLabel("");
        Usua = new JLabel("");
        Emp = new JLabel("ProPisto");
        add(Saldo);
        add(Usua);
        add(Emp);
        
        SuperUsua SUP= new SuperUsua();
        
        
        Saldo.reshape(100,100,100,40);
        Usua.reshape(100,300,100,40);
        Emp.reshape(100,500,100,40);
        
                        for (int i = 0; i < 5; i++) {
                    
                    if (SUP.GUARDA[i][1].equals("silvia")) {
                        
                        Usua.setText(SUP.GUARDA[i][1]);
                        Saldo.setText(SUP.GUARDA[i][4]);
  
                        
                    }
                    
                }
        
       
            
            
            
       
        
        
   
    }
    
    public void TransferenciaStudent(){
        
        
    }
    
    public void TransferenciaLibre(){
        
    }
    
    public void Retiro(){
        
        
        
        
    }
    
    public void Historial(){
        
    }
    
    
    
    
    
}
