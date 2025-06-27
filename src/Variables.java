public class Variables {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println(2+3);
        System.out.print("desde java");
        System.out.println();
        // java que sirve para mostrar - " texto ´´ - caracteres
        //Pascal Case nombres de los archivos - de clase
        // ClasePersona
        // camelCase - variables y metodos
        // sumaValoresPositivos

        /*
        * Calcular el area de un rectangulo
        * @param ancho
        * @param alto
        * @return el area calculada
        * */
        /*
        * son contenedores
        * String- almacenar texto como Hola, los valores se escriben en comillas "" No promitiva
        * int - almacenar numeros enteros, sin decimal, 123 o -123 primitivas
        * float - almacenar numeros con punto flotante o decimales , 19.99 o -19.99  32bits primitivas
        * Double - almacena numeros decimales 64 bits primitivas
        * char - almacenar caracteres invidiviales 'z' 0-9 A-Z o a-z primitivas
        * boolean true - false primitivas
        * */
        /*
          reglas generales para nombrar variables
        * Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar.
          Los nombres deben comenzar con una letra
          Los nombres deben comenzar con una letra minúscula y no pueden contener espacios en blanco.
          Los nombres también pueden comenzar con $ y _
          Los nombres distinguen entre mayúsculas y minúsculas ("myVar" y "myvar" son variables diferentes)
          Las palabras reservadas (como las palabras clave de Java, como into boolean) no se pueden usar como nombres
        *
        * */
        String nombreEmpleado="pepito";
        System.out.println(nombreEmpleado);
        nombreEmpleado="andres";
        System.out.println(nombreEmpleado);
        // distingue entre mayusculas y minusculas
        int myVar= 5;
        int MyVar=10;
        int MYVAR=15;
        System.out.println(myVar);
        System.out.println(MyVar);
        System.out.println(MYVAR);
        // vacias
        int numeroTotal=0;
        int numVal;
        System.out.println(numeroTotal);
        float numeroDecimal=0.0f;
        float num=0;
        double numeroDoble=0.0;
        // char no se permite inicializar vacio
        char letra='B';
        // boolean
        boolean estado=false;
        boolean verificar= 5<10;
        System.out.println(verificar);






    }
}
