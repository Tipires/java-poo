package fazendinha;

public class Gado {
    private String Nome;
    private String CorPelo;
    private int Consumo;
    private String Mansidao;

    public Gado(){
        this.Nome = "Unknown";
        this.CorPelo = "Unknown";
        this.Consumo = 0;
        this.Mansidao = "Unknown";
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
    public void setMansidao(String Mansidão) {
        this.Mansidao = Mansidao.toUpperCase();
     }
  
     public String getMansidao() {
        return this.Mansidao;
     }
    
        
     }

