public class EmpregadoHorista extends Empregado {
    int horasTrabalhadas;
    double valorHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int horasTrabalhadas, double valorHoraTrabalhada) {
        super(matricula, nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada / 100;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Horas trabalhadas: " + horasTrabalhadas + "\n";
        aux += "Valor da hora trabalhada: " + valorHoraTrabalhada + "\n";
        return aux;
    }
}
