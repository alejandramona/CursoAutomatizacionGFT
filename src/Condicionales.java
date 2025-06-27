public class Condicionales {
    public static void main(String[] args) {
        /**
         * Ya sabes que Java soporta las condiciones lógicas habituales de las matemáticas:
         *
         * Menos de: a < b
         * Menor o igual que: a <= b
         * Mayor que: a > b
         * Mayor o igual que: a >= b
         * Igual a a == b
         * No es igual a: a != b
         * Puede utilizar estas condiciones para realizar diferentes acciones para diferentes decisiones.
         *
         * Java tiene las siguientes sentencias condicionales:
         *
         * Se utiliza para especificar un bloque de código que se va a ejecutar, si una condición especificada es verdadera if
         * Se utiliza para especificar un bloque de código que se va a ejecutar, si la misma condición es falsaelse
         * Se utiliza para especificar una nueva condición que se va a probar, si la primera condición es falsa else if
         * Se utiliza para especificar muchos bloques de código alternativos que se van a ejecutar switch
         */

        if(10>50){
            System.out.println("es mayor");
        }else {
            System.out.println("es menor");
        }

        int dia=4;
        if(dia==1){
            System.out.println("el dia es lunes");
        }else if(dia==2){
            System.out.println("el dia es martes");
        } else if(dia==3){
            System.out.println("el dia es miercoles");
        }else if(dia==4){
            System.out.println("el dia es jueves");
        } else if (dia==5) {
            System.out.println("el dia es viernes");
        }else {
            System.out.println("dia no laboral o invalido");
        }

        /*
        * Si la nota es:

          Mayor o igual a 90 → "Excelente"

          Entre 80 y 89 → "Muy bien"

          Entre 60 y 79 → "Regular"

          Menor de 60 → "Reprobado"
        * */
        int nota=55;

        if(nota>=90){
            System.out.println("Excelente");
        } else if (nota>=80) {
            System.out.println("Muy bien");
        } else if (nota>=60) {
            System.out.println("regular");
        }else {
            System.out.println("Reprobado");
        }

        dia=2;
        switch (dia){
            case 1:
                System.out.println("el dia es lunes");
             break;
            case  2:
                System.out.println("el dia es martes");
             break;
            case  3:
                System.out.println("el dia es miercoles");
                break;
            default:
                System.out.println("dia no valido");

        }

        System.out.println("|---------------------|");
        System.out.println("|         Menu        |");
        System.out.println("|     1. suma         |");
        System.out.println("|     2. resta        |");
        System.out.println("|---------------------|");
        int opcion=2;
        switch (opcion){
            case 1:
                System.out.println("el resultado de la suma es : "+(32+89));
                break;
            case 2:
                System.out.println("el resultado de la resta es : "+(32-100));
                break;
            default:
                System.out.println("la opcion del menu no es correcta");
                break;
        }
        /*
        *                                                                       Uso if / else if / else              switch
          Condiciones complejas (con comparaciones, rangos, lógica booleana)        ✔️ Ideal                           ❌ No recomendable
          Comparar una sola variable con varios valores exactos (int, char, String) ✔️ Funciona                        ✔️ Ideal
          Evaluar rangos (ej: x >= 10 && x < 20)                                    ✔️ Necesario                       ❌ No soportado directamente
          Mayor legibilidad con muchos casos concretos                              ❌ Se vuelve largo                 ✔️ Más limpio
        * */

    }
}
