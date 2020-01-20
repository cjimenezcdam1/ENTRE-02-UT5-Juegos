/**
 * Un objeto de esta clase guarda informaci�n relativa a un juego
 * 
 * @author Christian Jim�nez Cuesta 
 */
public class Juego {
    private static final String SEPARADOR = ":";
    private String titulo;
    private Genero genero;
    private int year;
    private int[] valoraciones;

    /**
     *  Inicializa los atributos a partir de la informaci�n recibida
     *  Esta informaci�n se encuentra en linea
     */
    public Juego(String linea) {
        //Se obtienen todos los datos a partir de la linea y se eliminan los espacios
        String[] lineaParseada = linea.split(SEPARADOR);
        for(int i = 0; i < lineaParseada.length; i++){
            lineaParseada[i] = lineaParseada[i].trim();
        }
        //Se asigna el titulo
        titulo = lineaParseada[0].toUpperCase();
        //Se asigna el genero
        lineaParseada[1] = lineaParseada[1].toUpperCase();
        genero = Genero.valueOf(lineaParseada[1]);
        //Se asigna el a�o
        year = Integer.valueOf(lineaParseada[2]);
        //Se asignan las valoraciones
        valoraciones = new int[10];
        for(int i = 0; i < valoraciones.length; i++){
            valoraciones[i] = Integer.valueOf(lineaParseada[i + 3]);
        }
    }
    
    /**
     * accesor t�tulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * accesor g�nero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * accesor year
     */
    public int getYear() {
        return year;
    }

    /**
     * accesor valoraciones
     */
    public int[] getValoraciones() {
        return valoraciones;
    }

    /**
     * total votos emitidos
     */
    public int getVotos() {
        int votos = 0;
        for(int i = 0; i < valoraciones.length; i++){
            votos += valoraciones[i];
        }
        return votos;
    }

    /**
     *  obtener valoraci�n media
     */
    public double getValoracionMedia() {
        int media = 0;
        
        media /= 
        return 0;
    }

    /**
     *  Un usuario punt�a el juego con un valor entre 1 y 10 
     */
    public void puntuar(int puntuacion) {

    }

    /**
     * Representaci�n textual del juego 
     * (Ver enunciado)
     */
    public String toString() {
        return titulo + "\nG�nero: " + this.genero +
        "| Lanzamiento: " + this.year +
        "\nValoraci�n (" + getVotos() + " votos): "
        + String.format("%.2f", this.getValoracionMedia());

    }

    public static void main(String[] args) {
        Juego juego1 = new Juego(
                "Steep: deportes: 2016  : 0:0:0:0: 0: 0:0:0:12:  10");
        System.out.println(juego1.toString());

        Juego juego2 = new Juego(
                "For the King: estrategia: 2018  : 0:0:0:7: 12: 0:33:13:2: 0");
        System.out.println(juego2.toString());

    }
}
