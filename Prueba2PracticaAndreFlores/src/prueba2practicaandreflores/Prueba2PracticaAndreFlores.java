package prueba2practicaandreflores;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba2PracticaAndreFlores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();

        System.out.print("Ingrese la cantidad de figuras que desea crear: ");
        int cantidadFiguras = entrada.nextInt();

        for (int i = 0; i < cantidadFiguras; i++) {
            System.out.println("\nFigura numero: " + (i + 1));

            String tipo = null; // aqui lo hizo netbeans, solo toque un hint.
            boolean tipoValido = false;
            while (!tipoValido) {
                System.out.print("Ingrese el tipo de figura (Cuadrado, Triangulo, Rectangulo): ");
                tipo = entrada.next();
                if (Figura.validTipo(tipo)) {
                    tipoValido = true;
                } else {
                    System.out.println("Tipo de figura invalido. Intente otra vez.");
                }
            }

            System.out.print("Ingrese el largo: ");
            double largo = entrada.nextDouble();
            System.out.print("Ingrese el alto: ");
            double alto = entrada.nextDouble();
            System.out.print("Ingrese el ancho: ");
            double ancho = entrada.nextDouble();

            Figura figura = new Figura(largo, alto, ancho, tipo);
            figuras.add(figura);
        }

        System.out.println("-------- Lista de Figuras --------");
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println("Figura #" + (i + 1));
            System.out.println(figuras.get(i).toString());
        }
    }
}


    

