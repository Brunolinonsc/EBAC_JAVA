public class Horista extends Empregado {

    private Double precoHora;

    private Double totalHoraTrabalhada;

    @Override
    public Double vencimento() {
        return precoHora*totalHoraTrabalhada;
    }

}
