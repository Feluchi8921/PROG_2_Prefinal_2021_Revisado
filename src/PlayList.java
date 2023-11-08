import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PlayList extends Video{
    //Atributos
    private ArrayList<Elemento> elementos;
    private int demora;

    //Constructor

    public PlayList(String titulo, Usuario usuario, int duracion, int cantVistas, int cantGusta, int cantDisgusta, int anioRegistro, int demora) {
        super(titulo, usuario, duracion, cantVistas, cantGusta, cantDisgusta, anioRegistro);
        this.elementos = new ArrayList<>();
        this.demora=demora;
    }
    //Getters and Setters

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    //Metodo addElemento
    public void addElemento(Elemento e){
        if(!elementos.contains(e)){
            elementos.add(e);
        }
    }

    //Metodo listar
    public ArrayList<Elemento> listarELementos(){
        ArrayList<Elemento> listaElemento = new ArrayList<>();
        for(Elemento e: elementos){
            listaElemento.add(e);
        }
        return listaElemento;
    }

    @Override
    public ArrayList<Video> buscar(Filtro c){
        ArrayList<Video> listarVideos = new ArrayList<>();
        for (Elemento e: elementos) {
            listarVideos.addAll(e.buscar(c));
            }
        //Si quiero ordenado le paso colection sort e implemento los compareTo
        Collections.sort(listarVideos); //Tengo que implementar el compareTo en Video
        return listarVideos;
    }

    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> listarPalabrasClaves = new ArrayList<>();
        for (Elemento e: elementos) {
            ArrayList<String> aux = e.getPalabrasClaves();
            for(String a : aux) {
                if (!listarPalabrasClaves.contains(a)) {
                    listarPalabrasClaves.add(a);
                }
            }
        }
        return listarPalabrasClaves;
        
    }
    public int cantVideos(){
        int cantidad=0;
        for (Elemento e : elementos) {
            cantidad+=e.cantVideos();
        }
        return cantidad;
    }
    public int getDuracion(){
        int duracion=0;
        for(Elemento e : elementos){
            duracion+=e.getDuracion();
        }
        return duracion+demora;
    }
}
