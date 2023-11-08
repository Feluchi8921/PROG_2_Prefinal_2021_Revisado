import java.util.ArrayList;
import java.util.Collections;

public class PlayListSponsor extends PlayList{

    //Atributo
    private Video pago;

    //Constructor

    public PlayListSponsor(String titulo, Usuario usuario, int duracion, int cantVistas, int cantGusta, int cantDisgusta, int anioRegistro, int demora, Video pago) {
        super(titulo, usuario, duracion, cantVistas, cantGusta, cantDisgusta, anioRegistro, demora);
        this.pago = pago;
    }


    //Getters and Setters
    public Video getPago() {
        return pago;
    }

    public void setPago(Video pago) {
        this.pago = pago;
    }

    @Override
    public ArrayList<Video> buscar(Filtro c){
        ArrayList<Video> listarVideos = super.buscar(c);
        listarVideos.add(0, pago);
        return listarVideos;
    }
}
