import java.util.ArrayList;

public abstract class Elemento{
    //Atributos
    private String titulo;


    //Constructor
    public Elemento(String titulo){
        this.titulo=titulo;
    }

    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodos abstractos
    public abstract ArrayList<Video> buscar(Filtro c);
    public abstract ArrayList<String> getPalabrasClaves();
    public abstract int cantVideos();
    public abstract int getDuracion();
}
