package aula;

public class Contador {
    private int valor;
    private int limite;

    public Contador(){
        valor=0;
        limite= 999;

    }
    public Contador(int valor, int limite){
        this.valor=valor;
        this.limite=limite;

    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public int getValor(){
        return valor;
    }
    public void setLimite(int limite){
        this.limite=limite;
    }
    public int setLimite(){
        return limite;
    }
    public void contar(){
        valor++;
        if (valor == limite){
            valor=0;
        }
    }
     
}
