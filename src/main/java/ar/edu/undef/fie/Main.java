package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        int [] lista1 = {4, 5, 6, 3, 2, 4};
        int [] lista2 = {4, 5, 70, 30, 80, 90};
        int [] interseccion = {};

        for (int valor : lista1){
            for (int valor1 : lista2){
                if (valor == valor1){
                    interseccion; // queria agregarlo a la interseccion pero no sabia como

                    System.out.println("La interseccion es: " + interseccion);
                }
            }
        }
    }
}


/*
3. Hacer un programa que inicialice dos listas y muestre por pantalla la intersección entre las mismas.
 */