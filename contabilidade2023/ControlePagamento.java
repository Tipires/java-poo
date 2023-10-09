
package contabilidade2023;
import java.util.ArrayList;

public class ControlePagamento {

    private ArrayList<Passivo> pagamentos;

 public ControlePagamento() {
		pagamentos = new ArrayList<>();
	}


    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }

   
public ControlePagamento(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }
    public void setPagamentos(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }


    public void addPagamento(Passivo pagamento) {
        pagamentos.add(pagamento);
    }

    public double controleContas(int dia, int mes){

            double totalcontas=0;

            for(Passivo pagContas : pagamentos){
                if(pagContas instanceof Conta){
                    if(pagContas instanceof Titulo){
                        totalcontas+=((Titulo)pagContas).getValorAPagar(dia, mes);
                    }
                    else{
                        totalcontas+=((Concessionaria)pagContas).getValorAPagar(0, 0);
                    }
            }
        }
            return totalcontas;
    }
    
    public double controleEmpregado(){
        double totalempregado=0;

        for(Passivo pagEmpregado : pagamentos){
            if(pagEmpregado instanceof Empregado){
                if(pagEmpregado instanceof Assalariado){
                    totalempregado+=((Assalariado)pagEmpregado).getValorAPagar(0, 0);

                }
                else if(pagEmpregado instanceof Tercerizado){
                    totalempregado+=((Tercerizado)pagEmpregado).getValorAPagar(0, 0);

                }
                else if(pagEmpregado instanceof Comissionado){
                    totalempregado+=((Comissionado)pagEmpregado).getValorAPagar(0, 0);

                }
                 else if(pagEmpregado instanceof AssalariadoComissionado){
                    totalempregado+=((AssalariadoComissionado)pagEmpregado).getValorAPagar(0, 0);

                }
            }

  

        }
  return totalempregado;

    }
    public double controlePagTotal (int dia, int mes){
        return controleContas(dia, mes)+controleEmpregado();
    }

}
