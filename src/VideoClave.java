public class VideoClave extends Video{

    public VideoClave(String titulo, Usuario usuario, int duracion, int cantVistas, int cantGusta, int cantDisgusta, int anioRegistro) {
        super(titulo, usuario, duracion, cantVistas, cantGusta, cantDisgusta, anioRegistro);
    }

    @Override
    public boolean tienePalabraClave(String pc){

        return true;
    }
}
