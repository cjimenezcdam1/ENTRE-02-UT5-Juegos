/**
 * Punto de entrada a la aplicación
 * 
 * @author Christian Jiménez Cuesta  
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)
    {
        if(args.length != 2){
            System.out.println("Error en argumentos" + 
                "\nSintaxis: java AppRevistaJuegosOnLine <nombre> <n>");
        }else{
            //Creación de la revista
            String nombre = args[0];
            int total = Integer.parseInt(args[1]);
            RevistaOnLineJuegos revista = new RevistaOnLineJuegos(nombre, total);
            //Cargar juegos desde fichero
            revista.leerDeFichero();
            //Mostrar la revista
            System.out.println(revista.toString());
        }
    }
}
