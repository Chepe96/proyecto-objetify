public class Archivo
{
    private String cancion;
    
    /**
     * Captura una nueva canción y le asigna un nombre.
     * @param nombreCancion Recibe una cadena con un nombre y se lo asigna
     *                      al objeto.
     */
    public Archivo(String nombreCancion)
    {
        cancion = nombreCancion;
    }
    
    /**
     * Regresa el nombre de la cancion que se agrego.
     */
    public String dimeCancion()
    {
        return cancion;
    }
}