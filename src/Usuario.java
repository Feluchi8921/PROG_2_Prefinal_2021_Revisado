public class Usuario implements Comparable<Usuario>{

    //Atributos
    private String nombre;
    private int anioRegistro;
    private String email;

    //Constructor

    public Usuario(String nombre, int anioRegistro, String email) {
        this.nombre = nombre;
        this.anioRegistro = anioRegistro;
        this.email = email;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Usuario otroUsuario){
        int resul = nombre.compareTo(otroUsuario.getNombre()); //Comparo por el nombre
        if(resul==0){ //Si tienen el mismo nombre comparo por email
            return email.compareTo(otroUsuario.getEmail());
        }
        return resul;
    }
}
