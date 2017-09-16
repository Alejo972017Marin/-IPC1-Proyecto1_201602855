package proyecto_1;



class UsuariosPro {

     public Object USUARIO[][] = {{"INGRID", "KARINA"}, {"SALPOR", "COLINDRES"},{"JOSE","ALEJANDRO"}};
    //public String USUARIO[][] = new String[4][2];

    public boolean UsuariosPro(Object User, Object Pas) {
        Object USUC = "";
        Object PASU = "";
        for (Object Usutem[] : USUARIO) {
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
