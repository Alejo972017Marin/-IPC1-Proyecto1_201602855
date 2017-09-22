package proyecto_1;



class UsuariosPro extends AdmiFrame{

    UsuariosPro UPO= new UsuariosPro();
    
    // public Object USUARIO[][] = {{"alejo","123"}, {"ingrid", "123"},{"silvia","123"}};
    //public String USUARIO[][] = new String[4][2];
     public Object USUARIOP[][]= new Object[10][2];
    int contador=0;
    
    public boolean UsuariosPro(Object User, Object Pas) {
        
    
        for (int i = 0; i < 10; i++) {
           USUARIOP[contador][0] = GUARDA[contador][1] ;
           USUARIOP[contador][1] = GUARDA[contador][2] ;
           contador++;
        }
               
        Object USUC = "";
        Object PASU = "";
        for (Object Usutem[] : USUARIOP) {
            for (Object usut : Usutem) {
                USUC = usut;
    
                for (Object pasut : Usutem) {
                    PASU = pasut;

                    if (User.equals(USUC) && Pas.equals(PASU)) {
                        return true;
                    }

                }

            }

        }

        return false;

    }
    
    
    
    

}
