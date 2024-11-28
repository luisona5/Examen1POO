
public class Regiones extends Paises {
    String NombreRegion;

    public Regiones(){}

    public Regiones(String nameContienente, String NombreRegion,String nombre) {
        super(nameContienente,nombre);
        this.NombreRegion = NombreRegion;

    }
    public Regiones( String NombreRegion) {
        this.NombreRegion = NombreRegion;
    }

    public String getNombreRegion() {
        return NombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        NombreRegion = nombreRegion;
    }

    @Override
    public void mostrarPaises(){
        super.mostrarPaises();
        System.out.println("Nombre del Pais: "+NombreRegion);
    }
}
