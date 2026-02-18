import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean seguir = true;

        while (seguir) 
        {
            System.out.println("********Bienvenido a mi carrito********");
            System.out.println("Seleccione la opción que desea...");
            System.out.println("1. registrar pedido"
                                + "\n2. Buscar pedido"
                                + "\n3. Modificar pedido"
                                +"\n4.salir " );
            
            int e = sc.nextInt();
            switch (e) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                    
                default:
                    break;
            }
        }
    }
}