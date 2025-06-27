package ArreglosEstructuraD;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class introduccion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Arreglos estaticos
        // son de tamaño fijo, definido al momento de su creacion
        // No los podemos redimensionar
        // se usan cuando sabemos su tamaño
        // Nota: no podemos agregar elementos luego de creado
        int[] arr={1,2,35,5,6,7,9};
        int[] numeros =new int[2]; // 0,1,2,3,4
        numeros[0]=10;
        System.out.println(Arrays.toString(arr));
        // que inician en el indice 0
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("ingresde el valor en la posicion "+i);
            numeros[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i <numeros.length ; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("ingrese el tamaño del arreglo");
        int cant=scan.nextInt();
        String[] frutas = new String[cant];
        // frutas
        for (int i = 0; i <frutas.length ; i++) {
            System.out.println("ingresde la fruta en la posicion "+i);
            frutas[i]=scan.next();
        }

        System.out.println(Arrays.toString(frutas));

        for (int i = 0; i <frutas.length ; i++) {
            System.out.print(frutas[i]+" ");
        }
        System.out.println();

        // arreglos dinamicos
        // el tamaño cambia
        // Java.util
        // objetos, no tipos primitivos(int,double)
        // agregar, quitar, ordenar y buscar

        /*
        * | Método                  | Descripción                                       | Ejemplo aplicado                                                 |
| ----------------------- | ------------------------------------------------- | ---------------------------------------------------------------- |
| `add(element)`          | Agrega un elemento al final                       | `nombres.add("Marta");`                                          |
| `add(index, element)`   | Inserta un elemento en una posición específica    | `nombres.add(1, "Sofía");`                                       |
| `get(index)`            | Obtiene el elemento en la posición dada           | `nombres.get(0);`                                                |
| `set(index, element)`   | Reemplaza el elemento en la posición indicada     | `nombres.set(2, "Pedro");`                                       |
| `remove(index)`         | Elimina el elemento en la posición dada           | `nombres.remove(1);`                                             |
| `remove(Object o)`      | Elimina la **primera ocurrencia** del objeto dado | `nombres.remove("Ana");`                                         |
| `clear()`               | Elimina todos los elementos del ArrayList         | `nombres.clear();`                                               |
| `size()`                | Retorna la cantidad de elementos                  | `nombres.size();`                                                |
| `isEmpty()`             | Verifica si la lista está vacía                   | `nombres.isEmpty();`                                             |
| `contains(Object o)`    | Verifica si existe un elemento en la lista        | `nombres.contains("Luis");`                                      |
| `indexOf(Object o)`     | Devuelve el índice de la primera aparición        | `nombres.indexOf("Luis");`                                       |
| `lastIndexOf(Object o)` | Devuelve el índice de la última aparición         | `nombres.lastIndexOf("Luis");`                                   |
| `toArray()`             | Convierte el ArrayList en un arreglo (`Object[]`) | `Object[] arreglo = nombres.toArray();`                          |
| `equals(Object o)`      | Compara con otra lista (en orden y contenido)     | `nombres.equals(otraLista);`                                     |
| `clone()`               | Crea una copia superficial del ArrayList          | `ArrayList<String> copia = (ArrayList<String>) nombres.clone();` |
| ----------------------- | ------------------------------------------------- | ---------------------------------------------------------------- |
        * */
        ArrayList<String> nombres =new ArrayList<>();

        nombres.add("Ana");
        nombres.add("felipe");
        nombres.add("carlos");
        nombres.add(1,"carmen");
        nombres.set(2,"pepito");
        nombres.remove(1);
        nombres.remove("carlos");
        System.out.println(nombres.indexOf("carmen"));// indexOf -1 cuando el elemento no existe
        System.out.println(nombres.indexOf("pepito"));//1
        ArrayList<String> nom= (ArrayList<String>) nombres.clone();
        nom.set(0,"marta");
        System.out.println("copia "+nom);
        boolean existe=nombres.contains("carlos");
        System.out.println("nombre en la posicion 0 "+nombres.get(0));
        System.out.println("nombre en la posicion 1 "+nombres.get(1));
        System.out.println("cantidad "+ nombres.size());
        System.out.println(" existe el nombre ? "+existe);
        nombres.clear();

        // HashMap tipo clave : valor
        HashMap<String, Integer> edades =new HashMap<>();
        edades.put("ana",25);
        edades.put("marta",56);

        System.out.println(" edad de ana "+edades.get("ana"));
        System.out.println(edades);

        /*
        * | Necesitas...                            | Usa...       |
          | --------------------------------------- | ------------ |
          | Lista simple y dinámica                 | `ArrayList`  |
          | Muchos cambios (insertar/eliminar)      | `LinkedList` |
          | Evitar elementos repetidos              | `HashSet`    |
          | Elementos únicos y ordenados            | `TreeSet`    |
          | Relación clave-valor sin orden          | `HashMap`    |
          | Relación clave-valor ordenado por clave | `TreeMap`    |
        * */
    }
}
