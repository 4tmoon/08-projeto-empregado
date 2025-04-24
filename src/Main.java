public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(1111, "Matheus", 10, 5);
        empregado[1] = new EmpregadoHorista(2222, "Juninho", 100, 20);
        empregado[2] = new EmpregadoHorista(333, "Toninho", 50, 25);

        for (Empregado x : empregado) {
            System.out.println(x); //toString()
            System.out.println(x.calcularSalario());
        }
    }
}
