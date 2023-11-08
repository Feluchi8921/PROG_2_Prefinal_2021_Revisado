import java.util.ArrayList;

public class Video extends Elemento implements Comparable<Video>{
    //Atributos
    private Usuario usuario;
    private int duracion;
    private int cantVistas;
    private int cantGusta;
    private int cantDisgusta;
    private int anioRegistro;
    private ArrayList<String> palabrasClave;


    //Constructor
    public Video(String titulo, Usuario usuario, int duracion, int cantVistas, int cantGusta, int cantDisgusta, int anioRegistro) {
        super(titulo);
        this.usuario = usuario;
        this.duracion = duracion;
        this.cantVistas = cantVistas;
        this.cantGusta = cantGusta;
        this.cantDisgusta = cantDisgusta;
        this.anioRegistro = anioRegistro;
        this.palabrasClave = new ArrayList<>();
    }
    //Getters and Setters

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantVistas() {
        return cantVistas;
    }

    public void setCantVistas(int cantVistas) {
        this.cantVistas = cantVistas;
    }

    public int getCantGusta() {
        return cantGusta;
    }

    public void setCantGusta(int cantGusta) {
        this.cantGusta = cantGusta;
    }

    public int getCantDisgusta() {
        return cantDisgusta;
    }

    public void setCantDisgusta(int cantDisgusta) {
        this.cantDisgusta = cantDisgusta;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    //Metodo add
    public void addPalabrasClaves(String pc){
        if (!palabrasClave.contains(pc)) {
            palabrasClave.add(pc);
        }
    }

    //Agregar un boolean tienePalabra Clave
    public boolean tienePalabraClave(String pc){
        return palabrasClave.contains(pc);
    }
    @Override
    public ArrayList<Video> buscar(Filtro c){
        ArrayList<Video> listarVideo = new ArrayList<>();
        if(c.cumple(this)){
            listarVideo.add(this);
        }
        return listarVideo;
    }

    @Override
    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> listarPalabrasClaves = new ArrayList<>();
        for (String p: palabrasClave) {
            if(!listarPalabrasClaves.contains(p)){
                listarPalabrasClaves.add(p);
            }
        }
        return listarPalabrasClaves;
    }

    @Override
    public int cantVideos(){
        return 1;
    }
    @Override
    public int getDuracion(){
        return this.duracion;
    }

    @Override
    public int compareTo(Video otroVideo) {
       return usuario.compareTo(otroVideo.getUsuario());
    }
}
