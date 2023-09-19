public class variables{
    public static void main(String[]args){
        
/*
    Información de variables en Java
    Las variables Java son un espacio de memoria en el que guardamos un
    determinado valor (o dato).
    Para definir una variable seguiremos la estructura:
 
    "" [privacidad] tipo_variable identificador; ""
                                  ("nombre")
  
    Java es un lenguaje de tipado estático.
    Se dice de un lenguaje de programación que usa un tipado estático cuando
    la comprobación de tipificación se realiza durante la compilación, y no
    durante la ejecución.
    Si un lenguaje puede hacer que una variable tenga diferente tipos dependiendo
    del momento
    se llama lenguaje de programación de tipado estático.
 
    Ejemplos de lenguajes que usan tipado estático son C, C++, Java y Haskell.
    
    Por lo cual todas las variables tendrán un tipo de dato
    (ya sea un tipo de dato primitivo o una clase) y un nombre de identificador.
    
    El tipo de dato se asignará a la hora de definir la variable.
    Además, en el caso de que las variables sean propiedades de objetos tendrán
    una privacidad.
    Ejemplos ⬇️ ⬇️ ⬇️
 **/
        int numero = 2;
        String cadena = "Hola";
        double decimal = 2.4;
        boolean flag = true;
        long longi = 2;
/**
 Dentro de Java podemos encontrar los siguientes tipos de variables:

    1. Variables de instancia (campos no estáticos), son las variables 
    que están definidas dentro de un objeto pero que no tienen un 
    modificador de estáticas (static). Suelen llevar un modificador de
    visibilidad (public, private, protected) definiéndose.
   
    2. Variables de clase (campos estáticos), son aquellas 
    variables que están precedidas del modificador static. 
    Esto indica que solo hay una instancia de dicha variable. 
    Es decir, aunque tengamos N objetos de la clase, la variable 
    estática solo se instancia una vez.
    
    3. Constantes, Si además queremos que el valor no pueda cambiar nunca la definiremos como final.
    y generalmente se escriben con mayusculas
    Ejemplo:
 */
        class Triangulo {
            private long base;
            private long altura;
            static long lados = 3;
            public double d=1;
            final static double PI = 3.14159;
        
        }  
/*
    4. Variables locales, son variables temporales cuyo ámbito 
        de visibilidad es el método sobre el que están definidas. 
        No pueden ser accedidas desde otra parte del código. 
        Se las distingue de las variables de instancia ya que 
        estas no llevan modificadores de visibilidad delante.
        Ejemplo: int variable = 2;

    5. Parámetros, son las variables recibidas como parámetros 
    de los métodos. Su visibilidad será el código que contenga dicho método

    Ejemplo: 
    public Triangulo(long base, long altura){...}
 */
   
 }
}