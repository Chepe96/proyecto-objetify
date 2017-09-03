public class Reproductor
{
    /**
     * Este metodo reproduce un archivo de la biblioteca.
     * @param unArchivo Recibe un objeto de archivo e imprime un mensaje con el
     *                  nombre de la cancion del objeto.
     */
    public void reproducir(/*String nombreArchivo*/Archivo unArchivo)
    {
        //simular la reproduccion
        System.out.println("Reproduciendo: " + unArchivo.dimeCancion());
    }
}