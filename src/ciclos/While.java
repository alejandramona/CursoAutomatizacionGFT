package ciclos;

public class While {
    public static void main(String[] args) {
        // siempre y cuando la condicion se verdadera
        // los ciclos son utiles ahorrar tiempo, reducir errores y hacer codigo mas legible

        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        int regresivo=3;
        while (regresivo>0){
            System.out.println(regresivo);
            regresivo--;
        }
        System.out.println(" Feliz año nuevo");
    }
}
