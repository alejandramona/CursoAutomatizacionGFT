public class Operadores {
    public static void main(String[] args) {
        /*
        * Java divide los operadores en los siguientes grupos:

Operadores aritméticos
Operadores de asignación
Operadores de comparación
Operadores lógicos
Operadores bit a bit

Los operadores aritméticos
*  se utilizan para realizar operaciones matemáticas comunes.

Operator	Name	Description               	Example
+	Addition	Adds together two values	x + y
-	Subtraction	Subtracts one value from another	x - y
*	Multiplication	Multiplies two values	x * y
/	Division	Divides one value by another	x / y
%	Modulus	Returns the division remainder	x % y
++	Increment	Increases the value of a variable by 1	++x
--	Decrement	Decreases the value of a variable by 1	--x

Operadores de asignación de Java
* Los operadores de asignación se utilizan para asignar valores a las variables.

Operator	Example
=	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
&=	x &= 3	x = x & 3
|=	x |= 3	x = x | 3
^=	x ^= 3	x = x ^ 3
>>=	x >>= 3	x = x >> 3
<<=	x <<= 3	x = x << 3

En el siguiente ejemplo, usamos el operador de asignación () Para asignar el valor 10 a una variable llamada x:=

Ejemplo
int x = 10;

El operador de asignación de suma () agrega un valor a una variable:+=

Ejemplo
int x = 10;
x += 5;

Operadores de comparación de Java
Los operadores de comparación se utilizan para comparar dos valores (o variables). Esto es importante en la programación,
porque nos ayuda a encontrar respuestas y tomar decisiones.


Operator	Name	Example
==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y

En el siguiente ejemplo, usamos el operador mayor que () para averiguar si 5 es mayor que 3:>

Ejemplo
int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3

Operadores lógicos Java
También puede probar valores or con operadores lógicos.true false

Los operadores lógicos se utilizan para determinar la lógica entre variables o valores:

Operator	Name	Description	Example
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        * */

        System.out.println(4+5);
        int result=6-9;
        int num1=6;
        int num2=100;
        System.out.println(num2*num1);
        System.out.println(num1++);
        System.out.println(num1++);
        System.out.println(num1++);
        System.out.println("---------------------");
        System.out.println(num1--);
        System.out.println(num1--);
        System.out.println(num1--);
        System.out.println(num1--);

        int num=34;
        num1=num1+num2;
        num+=num2;
        System.out.println(num);
        num-=num2;
        System.out.println(num);
        num*=num2;
        System.out.println(num);
    }
}
