package fazendinha;



public class Cavalo {
    private String Nome;
    private String CorPelo;
    private int Consumo;
    private int Velocmax;
    

    public Cavalo(){
        this.Nome = "Unknown";
        this.CorPelo = "Unknown";
        this.Consumo = 0;
        this.Velocmax = 0;
    }
    public void setNome(String Nome) {
        this.Nome = Nome.toUpperCase();
     }
  
     public String getNome() {
        return this.Nome;
     }
   public void setCorPelo(String CorPelo) {
        this.CorPelo = CorPelo.toUpperCase();
     }
  
     public String getCorPelo() {
        return this.CorPelo;
     }
    public void setConsumo(int Consumo){
        this.Consumo = Consumo;
    }
    public int getConsumo(){
        return this.Consumo;
    }
    public void setVelocmax(int Velocmax){
        this.Velocmax = Velocmax;
    }
    public int getVelocmax(){
        return this.Velocmax;
    }
    
        
     }



