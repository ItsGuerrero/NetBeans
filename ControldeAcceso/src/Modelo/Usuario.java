
package Modelo;


public class Usuario {
    //Atributos
    private String usuario;
    private String contraseña;
    private String respuesta;
    //Contrutores
    public Usuario(String usuario,String contraseña,String respuesta){
        this.contraseña=contraseña;
        this.respuesta=respuesta;
        this.usuario=usuario;
    }
    //Metodos
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    //ToString

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contraseña=" + contraseña + ", respuesta=" + respuesta + '}';
    }
    
}
