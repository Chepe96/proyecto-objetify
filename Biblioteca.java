import java.util.ArrayList;

public class Biblioteca
{
    /*private ArrayList<String>canciones;*/
    private ArrayList<Archivo>canciones;
    private Reproductor reproductor;
    
    public Biblioteca()
    {
        canciones = new ArrayList<Archivo>();
        reproductor=new Reproductor();
    }
    
    /**
     * Este metodo agrega una nueva cancion a la biblioteca.
     * @param unArchivo Este parametro me permite agregar un objeto directamente.
     */
    public void agregarCancion(/*String nombreArchivo*/Archivo unArchivo)
    {
        canciones.add(unArchivo);
    }
    
    /*public void reproducirCancion(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }*/
    
    
}