package ciclos;

public class For {
    public static void main(String[] args) {
        // for cuando sabemos de donde hasta donde vamos, cantidad
        // cuando sabemos exactmente cuantas veces requiere recorrerse un bloque de codigo
        // incremento
        // i=1 .. 1++ = 2
        // 2++ =3
        // i+=2 si quiero incremento de 2 en 2
        // i+=3
        // i+=10
        for (int i = 0; i <=5 ; i+=1) {
            System.out.println(i);
        }
        // decremento
        //i=10
        // i-=1   10-=1 = 9
        // 9-=1 = 8
        for (int i = 5; i >=1; i--) {
            System.out.println(" decrementando : "+i);
        }
        // contadores
        // 3
        int cont=0;
        for (int i = 1; i <=5 ; i+=1) {
            System.out.println(i);
            cont+=1;
        }
        System.out.println("la cantidad de iteraciones fueron: "+cont);

        // acumuladores
        int suma=0;
        for (int i = 1; i <=5 ; i+=1) {
            System.out.println(i);
           suma+=i;           // 1 +2 =3
        }
        System.out.println("la suma es: "+suma);
        double promedio=suma/5;
        System.out.println("el promedio es "+promedio);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println("-----------------");
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                System.out.println("--------------------------------");
            }
        }

        for (int i = 1; i <=3 ; i++) { // 1,2,3
            for (int j = 1; j <=3 ; j++) { // 1,2,3   1,2,3   1,2,3
                System.out.println("i: "+i+" j: "+j+" = "+(i*j));
            }
        }
    }
}
