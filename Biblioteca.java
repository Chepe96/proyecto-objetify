import java.util.ArrayList;
import java.util.Random;

public class Biblioteca
{
    /*private ArrayList<String>canciones;*/
    private ArrayList<Archivo>canciones;
    private Reproductor reproductor;
    Random aleatorios=new Random();
    
    /**
     * Inicializa las variables en el constructor.
     */
    public Biblioteca()
    {
        canciones = new ArrayList<Archivo>();
        reproductor=new Reproductor();
    }
    
    /**
     * Este metodo agrega una nueva cancion a la biblioteca.
     * @param unArchivo Este parametro me permite agregar un objeto directamente.
     */
    public boolean agregarCancion(/*String nombreArchivo*/Archivo unArchivo)
    {
        canciones.add(unArchivo);
        return true;
    }
    
    /**
     * Este metodo reproduce una cancion en especial de la biblioteca.
     * @param numCancion Recibe una posicion de la lista a reproducir y manda
     *                   llamar al metodo reproducir del reproductor.
     */
    public void reproducirCancion(int numCancion)
    {
        if(numCancion<=canciones.size())
        {
            reproductor.reproducir(canciones.get(numCancion));
        }
        else 
        {
            System.out.println("No se encontro el archivo");
        }
    }
    
    /**
     * Este metodo regresa el total de archivos dentro de la biblioteca.
     */
    public int totalArchivos()
    {
        int totalCanciones = canciones.size();
        return totalCanciones;
    }
    
    /**
     * Este metodo borra una cacion en especifico de la biblioteca.
     * @param unArchivo Recibe un objeto de archivo para borrar de la biblioteca.
     * @return Regresa un true si borro la cancion y un false si no.
     */
    public boolean borrarCancion(Archivo unArchivo)
    {
        int existe = this.buscarCancion(unArchivo.dimeCancion());
        if(existe==-1)
        {
            return false;
        }
        else
        {
            canciones.remove(unArchivo);
            return true;
        }
    }
    
    /**
     * Este metodo busca canciones dentro de la biblioteca.
     * @param nomCancion Recibe el nombre de la cancion a buscar en la biblioteca.
     * @return Regresa la posicion si la encontro y un -1 si no.
     */
    public int buscarCancion(String nomCancion)
    {
        for(int i=0;i<canciones.size();i++)
        {
            if(canciones.get(i).dimeCancion()==nomCancion)
            {
                return i;
            }
            break;
        }
        return -1;
    }
    
    /**
     * Este metodo reproduce todas las canciones que se encuentran
     * en la biblioteca.
     */
    public void reproducirTodas()
    {
        if(canciones.isEmpty())
        {
            System.out.println("No existen archivos");
        }
        else
        {
            for(int i=0;i<canciones.size();i++)
            {
                reproductor.reproducir(canciones.get(i));
            }
        }
    }
    
    /**
     * Este metodo borra todos los archivos de la biblioteca.
     */
    public void borrarTodas()
    {
        canciones.clear();
    }
    
    /**
     * Este metodo reproduce los archivos de la biblioteca aleatoriamente.
     */
    public void reproducirAleatorio()
    {
        int aleatorio = aleatorios.nextInt(canciones.size());
        reproductor.reproducir(canciones.get(aleatorio));
    }
}