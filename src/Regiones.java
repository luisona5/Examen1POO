
public class Regiones extends Continentes {
    String NombreRegion;

    public Regiones(){}

    public Regiones(String nameContienente, String NombreRegion) {
        super(nameContienente);
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
        System.out.println("Nombre del Pais: "+getNombreRegion());
    }
}
