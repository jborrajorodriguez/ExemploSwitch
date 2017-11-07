package exemploswitch;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class ExemploSwitch {

    public static void main(String[] args) {
        Metodos dia=new Metodos();
        System.out.println("*** Menú ***\n1-Lunes\n2-martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sabado\n7-Domingo\nPreme opción");
        Scanner teclado=new Scanner(System.in);
        String cd=teclado.nextLine();
        dia.comparar(cd);
    }

}
