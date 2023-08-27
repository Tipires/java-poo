package aula;
public class Relogio{
    private Contador hora;
    private Contador minuto;

    public Relogio(){
        this.hora = new Contador(0,24);
        this.minuto = new Contador(0, 60);
        
        }
        public void setHora(Contador hora){
            this.hora=hora;
        }
        public Contador getHora(){
            return hora;
        }
        public void setMinuto(Contador minuto){
            this.minuto= minuto;
        }
        public Contador getMinuto(){
            return minuto;
        }
        public void ticTac(){
            minuto.contar();
            if(minuto.getValor()==0){
                hora.contar();

            }
        }
       

            public String mostrarHora() {
                ticTac();
                
                int hour = hora.getValor();
                int minute = minuto.getValor();
                
                String amPm = hour < 12 ? "AM" : "PM";
                
                if (hour > 12) {
                    hour -= 12;
                }
                
                String formattedMinute = minute < 10 ? "0" + minute : String.valueOf(minute);
                
                String retorno = hour + ":" + formattedMinute + " " + amPm;
                return retorno;
            }
        }
        
        
        
        
        
        
        
    
    
