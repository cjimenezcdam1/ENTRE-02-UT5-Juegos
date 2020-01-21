import java.util.Arrays;
/**
 * Punto de entrada a la aplicaci�n
 * 
 * @author Christian Jim�nez Cuesta  
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)
    {
        if(args.length != 2){
            System.out.println("Error en argumentos" + 
                "\nSintaxis: java AppRevistaJuegosOnLine <nombre> <n>");
        }else{
            //Creaci�n de la revista
            String nombre = args[0];
            int total = Integer.parseInt(args[1]);
            RevistaOnLineJuegos revista = new RevistaOnLineJuegos(nombre, total);
            //Cargar juegos desde fichero
            revista.leerDeFichero();
            //Mostrar la revista
            System.out.println(revista.toString());
            //Se agrega puntuaci�n a algunos juegos
            System.out.println("***************************************");
            System.out.println("Puntuando...");
            revista.puntuar("Planet Zoo", 8);
            revista.puntuar("Steep", 7);
            revista.puntuar("Catastronauts", 9);
            revista.puntuar("Wattam", 9);
            System.out.println("Despu�s de puntuar la revista queda\n");
            //Se vuelve a mostrar la revista
            System.out.println(revista.toString());
            //Se muestran los juegos con valoracion media mayor a 8.2
            System.out.println("***************************************");
            System.out.println("Juegos con valoraci�n media > 8.2");
            String[] juegosMayorValoracion = revista.valoracionMayorQue(8.2);
            System.out.println(Arrays.toString(juegosMayorValoracion));
            //Borrar juegos de ROL
            System.out.println("***************************************");
            System.out.println("Borrando juegos de g�nero ROL...");
            System.out.println("Borrados " + revista.borrarDeGenero(Genero.ROL) + " juegos");
            //Se vuelve a imprimir la revista
            System.out.println(revista.toString());
        }
    }
}
