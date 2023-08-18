package fazendinha;

public class Galinha {
    private String Nome;
    private String CorPelo;
    private double Consumo;
    private String Tipo;
    

    public Galinha () {
        this.Nome = "Unknown";
        this.CorPelo = "Unknown";
        this.Consumo = 0.0;
        this.Tipo = "Unknown";
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
    public void setConsumo(double Consumo){
        this.Consumo = Consumo;
    }
    public double getConsumo(){
        return this.Consumo;
    }
     public void setTipo(String Tipo) {
        this.Tipo = Tipo.toUpperCase();
     }
  
     public String getTipo() {
        return this.Tipo;
     }
    
        
     }


