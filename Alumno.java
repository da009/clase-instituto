
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    public static final int NOTA_APROBADO = 5;
    private int numClase;
    private int notas[];
    public static int numeroAlumnos = 0;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        notas = new int[0];
        numeroAlumnos += 1;
        numClase = numeroAlumnos;
    }
    
    /**
     * permite introducir las notas del alumno
     */
    public void introducirNotas(int nota)
    {
        int size[] = new int[notas.length + 1];
        int cont;
        for(cont = 0; cont < notas.length; cont++)
        {
            size[cont] = notas[cont];
        }
        size[cont] = nota;
        notas = size;
    }
    
    /**
     * devuelve la nota media del alumno
     */
    public int mostrarMedia()
    {
        int media = 0;
        int cont;
        if (notas.length != 0)
        {
            for (cont = 0; cont < notas.length; cont++)
            {
                media += notas[cont];
            }
            media = (media / cont);
        }   
        return media;
    }
    
    /**
     * devuelve un valor boolean para saber si el alumno tiene una nota media que le permita aprobar
     */
    public boolean aprobado()
    {
          return (mostrarMedia() >= NOTA_APROBADO);
    }

    /**
     * muestra los datos del alumno
     */
    public void mostrarDatos()
    {
        String todasLasNotas = "[]";
        int media = 0;
            if (notas.length != 0)
            {
            todasLasNotas = "[" + notas[0];
            for (int cont = 1; cont < notas.length; cont++)
            {            
                todasLasNotas += ", " + notas[cont];
            }
            todasLasNotas += "]"; 
        }
        
        if (mostrarMedia() != 0)
        {
            media = mostrarMedia();
        }
        System.out.println("Alumno: " + nombre + "\n Edad: " + edad + "\n Número de clase: " + numClase +
            "\n Notas: " + todasLasNotas + "\n Nota media: " + media + "\n");
    }
}
