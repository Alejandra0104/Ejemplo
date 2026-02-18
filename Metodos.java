import java.util.Scanner;

public class Metodos 
{
    Scanner sc = new Scanner(System.in);

    public objFastFood[][] ingresarVentas (objFastFood[][] m)
    {
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                //elobjeto se crea adentro para que cada vez que se ejecute el renueve la informacion (encapsulación)
                objFastFood obj = new objFastFood();
                System.out.println("ingrese tipo de comida");
                System.out.println("1. Perro");
                System.out.println("2. Hamburguesa");
                System.out.println("3. Salchipapas");
                System.out.println("4. Perra");
                obj.setTipo(sc.nextInt());

                System.out.println("Ingrese tamaño");
                System.out.println("1. Grande");
                System.out.println("2. Mediano");
                System.out.println("3. Pequeña");
                obj.setTam(sc.nextInt());

                if (obj.getTipo() == 1) 
                {
                 obj.setDescripcion("perrito caliente muy bueno del estadio con carne");

                } else if (obj.getTipo() ==2) {
                   obj.setDescripcion("Hamburguesita lo mas de rica"); 
                }


            }
        }
    }
}
    