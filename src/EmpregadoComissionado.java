public class EmpregadoComissionado extends Empregado {
    double totalVendas;
    double comissao;

    public double calcularSalario() {
        return totalVendas * comissao / 100;
    }
}
