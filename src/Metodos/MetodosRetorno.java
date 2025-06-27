package Metodos;

public class MetodosRetorno {
    public int suma(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        MetodosRetorno mr=new MetodosRetorno();
        System.out.println(mr.suma(34,78));
    }
}
