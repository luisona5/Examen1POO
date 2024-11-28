public class Continentes {
    String nameContienente;

    public Continentes() {

    }

    public Continentes(String nameContienente) {
        this.nameContienente = nameContienente;
    }
    public String getNameContienente() {
        return nameContienente;
    }
    public void setNameContienente(String nameContienente) {
        this.nameContienente = nameContienente;
    }

    // metodo personalizado

    public void mostrarPaises(){
        System.out.println("\t-----INFORMACION GENERAL----\n");
        System.out.println("el pasi se encuentra en el continente: "+nameContienente);
    }
}
