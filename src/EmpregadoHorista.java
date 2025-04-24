public class EmpregadoHorista extends Empregado {
    int horasTrabalhadas;
    double valorHoraTrabalhada;

    public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada / 100;
    }
}
