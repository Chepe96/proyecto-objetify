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
    public boolean agregarCancion(/*String nombreArchivo*/Archivo unArchivo)
    {
        canciones.add(unArchivo);
        return true;
    }
    
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
    
    public int totalArchivos()
    {
        int totalCanciones = canciones.size();
        return totalCanciones;
    }
    
    public boolean borrarCancion(Archivo unArchivo)
    {
        int existe = this.buscarCancion(unArchivo.dimeCancion());
        if(existe==-1)
        {
            return false;
        }
        canciones.remove(existe);
        return true;
    }
    
    public int buscarCancion(String nomCancion)
    {
        for(int i=0;i<canciones.size();i++)
        {
            if(canciones.get(i).equals(nomCancion))
            {
                return i;
            }
        }
        return -1;
    }
}