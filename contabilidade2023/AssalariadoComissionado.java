
package contabilidade2023;



public class AssalariadoComissionado extends Comissionado {
    private double percentualbonus;
    
   
   
    

   
    public AssalariadoComissionado(String nome, String sobrenome, int numIdentidade, double valorVendas,
            double percentualbonus) {
        super(nome, sobrenome, numIdentidade, valorVendas);
        this.percentualbonus = percentualbonus;
    }

    public double getPercentualbonus() {
        return percentualbonus;
    }

    public void setPercentualbonus(double percentualbonus) {
        this.percentualbonus = percentualbonus;
    }
    public double getValorVendas (){
        return valorVendas;
    }

    public void setValorVendas (double valorVendas){
        this.valorVendas = valorVendas;
    }
    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return Passivo.SALARIO + valorVendas * 0.6 + Passivo.SALARIO*0.1;
    }
}
