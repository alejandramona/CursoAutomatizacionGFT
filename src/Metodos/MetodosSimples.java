package Metodos;

public class MetodosSimples {

    public static void saludar(){
        System.out.println("Hola, mundo desde java");
    }
    public void conexionErronea(){
        System.out.println("Error al intentar conectar en la BDD");
    }
    public void suma(){
        System.out.println(2+3);
    }
    public static void main(String[] args) {
        MetodosSimples ms=new MetodosSimples();
        // un metodo es un bloque de codigo que solop se ejecuta cuando se llama
        // pasar datos, conocidos como parametros
        // se utilizan para realizar determinadas acciones y tambien se conocen

        /*
| Tipo                            | Tiene parámetros | Devuelve algo | Ejemplo                              |
| ------------------------------- | ---------------- | ------------- | ------------------------------------ |
| Método simple                   | ❌                | ❌             | `public void saludar()`              |
| Método con parámetros           | ✅                | ❌             | `public void saludar(String nombre)` |
| Método con retorno              | ❌                | ✅             | `public int obtenerNumero()`         |
| Método con parámetros y retorno | ✅                | ✅             | `public int sumar(int a, int b)`     |
        * */
        saludar();
        saludar();
        saludar();
        saludar();
        saludar();

        ms.conexionErronea();
        ms.conexionErronea();
        ms.conexionErronea();
        ms.conexionErronea();

        ms.suma();
        ms.suma();
    }
}
