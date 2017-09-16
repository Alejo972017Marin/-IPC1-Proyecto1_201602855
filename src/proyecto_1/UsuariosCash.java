package proyecto_1;

public class UsuariosCash {

    public String UsuCash[] = {"Alejandro", "Marin", "Ana", "Silvia"};
    public String PasCash[] = {"123"};

    public boolean UsuariosCash(String user, String Pas) {

        for (String USUTem : UsuCash) {
            for (String Pastem : PasCash) {

                if (user.equals(USUTem) && Pas.equals(Pastem)) {
                    return true;
                }
            }

        }
        return false;

    }

}
