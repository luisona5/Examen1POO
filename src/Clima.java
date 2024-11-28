public class Clima extends  Regiones{
    String Clima;
    public Clima() {
        super();
    }



    public Clima(String nameContienente, String NombreRegion, String clima) {
        super(nameContienente, NombreRegion);
        this.Clima = clima;
    }

    public Clima(String clima) {
        this.Clima = clima;
    }

    public String getClima() {
        return Clima;
    }

    public void setClima(String clima) {
        Clima = clima;
    }
    //

    @Override
    public void mostrarPaises(){
        super.mostrarPaises();
        System.out.println("Clima: " + Clima);
    }

}
