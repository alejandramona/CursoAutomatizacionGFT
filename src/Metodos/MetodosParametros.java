package Metodos;

public class MetodosParametros {
    public void suma(int num1,int num2){
        System.out.println(num1+num2);
    }

    public void verificarEdades(int edad){
        if(edad>=18){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("no es mayor de edad");
        }
    }
    public static void main(String[] args) {
      MetodosParametros mp=new MetodosParametros();

      mp.suma(34,56);
      mp.suma(10,56);
      mp.suma(34,100);

      mp.verificarEdades(34);
      mp.verificarEdades(5);
      mp.verificarEdades(18);
    }
}
