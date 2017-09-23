package proyecto_1;



class UsuariosPro{
     public Object USUARIOP[][] = {{"alejo","123"}, {"ingrid", "123"},{"silvia","123"},{"jose","123"}};
    //public String USUARIO[][] = new String[4][2];

    // public static Object USUARIOP[][]= new Object[10][5];
    
    public boolean UsuariosPro(Object User, Object Pas) {
        

        
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
