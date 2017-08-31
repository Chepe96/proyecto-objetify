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
    
    public void agregarCancion(/*String nombreArchivo*/Archivo unArchivo)
    {
        canciones.add(unArchivo);
    }
    
    /*public void reproducirCancion(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }*/
    
    
}