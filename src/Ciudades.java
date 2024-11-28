public class Ciudades extends Clima {
    String ciudad;
    String barrio;
    public Ciudades() {}

    public void Ciudades(){}

    public Ciudades(String nameContienente, String NombreRegion, String clima, String ciudad, String barrio) {
        super(nameContienente, NombreRegion, clima);
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public Ciudades(String clima, String ciudad, String barrio) {
        super(clima);
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    // metodo personalizado
    @Override
    public void mostrarPaises(){
        super.mostrarPaises();
        System.out.println(" La ciudad es: "+this.ciudad);
    }
}
