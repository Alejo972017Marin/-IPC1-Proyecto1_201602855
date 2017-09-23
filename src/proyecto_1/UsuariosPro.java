package proyecto_1;



class UsuariosPro extends Transacciones{
    
    
        
    public boolean SuperUsuario(String User, String Pas){
        
        return User.equals("IPC1")&& Pas.equals("IPC1"); 
        
        
    }

    
    public boolean UsuariosPro(Object User, Object Pas) {
        

        
        Object USUC = "";
        Object PASU = "";
        for (Object Usutem[] : GUARDA) {
            for (Object usut : Usutem) {
                USUC = usut;
    
                for (Object pasut : Usutem) {
                    PASU = pasut;

                             for(Object empt:Usutem){
                               if (User.equals(USUC) && Pas.equals(PASU)&& empt.equals("Pro-Pisto")) {
                        return true;
                    }
               }

                }

            }

        }

        return false;

    }
    
   

    public boolean UsuariosCash(String User, String Pas) {

        Object USUC = "";
        Object PASU = "";
        Object EmpT ="";
    
        
        for (Object Usutem[] : GUARDA) {
            for (Object usut : Usutem) {
                USUC = usut;
    
                for (Object pasut : Usutem) {
                    PASU = pasut;
                    
                    for(Object empt:Usutem){
                               if (User.equals(USUC) && Pas.equals(PASU)&& empt.equals("Cahs-Money")) {
                        return true;
                    }
               }
                  
                   
//"Pro-Pisto", "Cahs-Money"
                   

                }

            }

        }

        return false;

    }
    
    
    
  
    

}
