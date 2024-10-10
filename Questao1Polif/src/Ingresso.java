abstract class Ingresso {
    private double valor;
    private double valorAdicional;
    private String localizacao;
    private String tipo;

    public Ingresso(double valor, double valorAdicional, String localizacao) {
        this.valor  = valor + valorAdicional;
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }
    public void imprimeValor(){
        System.out.println("Valor: " + valor);
    }

    public void imprimeTipo(){
        System.out.println("Tipo: " + tipo);
    }


}
