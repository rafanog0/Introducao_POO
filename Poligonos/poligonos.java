import java.lang.Math;

class Circulo{

    private double raio;

    public Circulo(double raio)
    {
        this.raio = raio;
    }

    public double calcularPerimetro()
    {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double calcularArea()
    {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}

class Triangulo{

    private double lado;

    public Triangulo(double lado)
    {
        this.lado = lado;
    }

    public double calcularPerimetro()
    {
        double perimetro = lado * 3;
        return perimetro;
    }

    public double calcularArea()
    {
        double area = (Math.pow(lado, 2) * Math.pow(3, 1/2))/4;
        return area;
    }
}

class Retangulo{

    private double base;
    private double altura;

    public Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro()
    {
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    public double calcularArea()
    {
        double area = base * altura;
        return area;
    }
}

class Quadrado{

    private double lado;

    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    public double calcularPerimetro()
    {
        double perimetro = (lado * 4);
        return perimetro;
    }

    public double calcularArea()
    {
        double area = Math.pow(lado, 2);
        return area;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Quadrado q1 = new Quadrado(6);
        Retangulo r1 = new Retangulo(8, 4);
        Triangulo t1 = new Triangulo(3);
        Circulo c1 = new Circulo(7.5);


        System.out.println("Area Quadrado: " + q1.calcularArea());
        System.out.println("Perimetro Quadrado: " + q1.calcularPerimetro());
        System.out.println("Área Retangulo: " + r1.calcularArea());
        System.out.println("Perimetro Retangulo: " + r1.calcularPerimetro());
        System.out.println("Área Circulo: " + c1.calcularArea());
        System.out.println("Perimetro Circulo: " + c1.calcularPerimetro());
        System.out.println("Área Triangulo: " + t1.calcularArea());
        System.out.println("Perimetro Triangulo: " + t1.calcularPerimetro());
    }

}