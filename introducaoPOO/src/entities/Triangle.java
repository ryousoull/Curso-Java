package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // criando um metodo/funcao

    public double area() {
        double p = (a + b + c) / 2.00;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
