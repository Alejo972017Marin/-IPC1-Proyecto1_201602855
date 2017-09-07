package proyecto_1;

class UsuariosPro {

    private String USUARIO="INGRID";
    


    public boolean UsuariosPro(String User) {

        if (User.equals(USUARIO)) {
            return true;
        } else {
            return false;
        }

    }
    
    public String getUSUARIO( ){
    return this.USUARIO;
  }
 
  public void setUSUARIO(){
   
      
    this.USUARIO = USUARIO;
  }

 
    
    

}
