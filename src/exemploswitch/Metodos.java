package exemploswitch;

/**
 * @author jborrajorodriguez
 */
public class Metodos {
    public void comparar(String opcion){
        switch(opcion){
            case "uno":System.out.println("Lunes");
            break;
            case "dos":System.out.println("Martes");
            break;
            case "tres":System.out.println("Miercoles");
            break;
            case "cuatro":System.out.println("Jueves");
            break;
            case "cinco":System.out.println("Viernes");
            break;
            case "seis":System.out.println("Sabado");
            break;
            case "siete":System.out.println("Domingo");
            break;
            default:System.out.println("Error");
        }
    }

}
