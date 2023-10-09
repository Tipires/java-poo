
package contabilidade2023;

public class Comissionado extends Empregado {
    protected double valorVendas;

    public Comissionado(String nome, String sobrenome, int numIdentidade, double valorVendas) {
        super(nome, sobrenome, numIdentidade);
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
 
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return valorVendas*0.6;
    }
}
