public class Paises extends Continentes {
    String nombre;


    // construccion de un constructor vacio
    public Paises() {}


    // construccion de un constructor

    public Paises(String nameContienente, String nombre) {
        super(nameContienente);
        this.nombre = nombre;
    }

    // constructor hijo
    public Paises(String name) {
    this.nombre = name;
    }

    // construccion de setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // metodo personalizado
  @Override
    public void mostrarPaises(){
        super.mostrarPaises();
        System.out.println("Nombre del Pais: " + nombre);

    }
}