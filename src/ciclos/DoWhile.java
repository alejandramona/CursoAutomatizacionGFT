package ciclos;

public class DoWhile {
    public static void main(String[] args) {
        // ejecuta el codigo almenos una vez sin importar si la condicion es verdadera o falsa
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<5);

        /*
        *
        * El do/whilebucle siempre se ejecuta al menos una vez, incluso si la condición ya es falsa. Esto difiere de un while  normal,
        * que lo omitiría por completo si la condición es falsa al inicio.

         Este comportamiento resulta do/whileútil cuando desea asegurarse de que algo suceda al menos una vez,
         como mostrar un mensaje o solicitar la entrada del usuario.

        * */
    }
}
