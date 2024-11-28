import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t----BIENVENIDO---------");

        Paises pais1 = new Paises("America Central");
        pais1.mostrarPaises();

        Paises pais2=new Paises("Europa","España");
        pais2.mostrarPaises();




    }
}







