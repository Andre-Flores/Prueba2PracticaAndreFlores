package prueba2practicaandreflores;

public class Figura {

    private double largo;
    private double alto;
    private double ancho;
    private String tipo;

    public Figura(double largo, double alto, double ancho, String tipo) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
        this.tipo = tipo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularArea() {
        double area = 0.0;
        if (tipo.equalsIgnoreCase("Cuadrado")) {
            area = largo * largo; 
        } else if (tipo.equalsIgnoreCase("Triangulo")) {
            area = (largo * alto) / 2; // A = ½ (b × h)
        } else if (tipo.equalsIgnoreCase("Rectangulo")) {
            area = largo * ancho; // L * W
        }
        return area;
    }

    public double calcularVolumen() {
        double volumen = 0.0;
        if (tipo.equalsIgnoreCase("Cuadrado")) {
            volumen = largo * largo * largo;
        } else if (tipo.equalsIgnoreCase("Triangulo")) {
            volumen = (largo * largo * largo) / 3; 
        } else if (tipo.equalsIgnoreCase("Rectangulo")) {
            volumen = largo * ancho * alto;
        }
        return volumen;
    }

    @Override
    public String toString() {
        return "Tipo de figura: " + tipo + "\nLargo: " + largo + "\nAlto: " + alto + "\nAncho: " + ancho + "\narea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }

    public static boolean validTipo(String tipo) {
        return tipo.equalsIgnoreCase("Cuadrado") || tipo.equalsIgnoreCase("Triangulo") || tipo.equalsIgnoreCase("Rectangulo");
    }
}
