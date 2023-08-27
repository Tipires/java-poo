
package aula;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Relogio rolex = new Relogio();

        Scanner scanner = new Scanner(System.in);
        System.out.print("qual o modelo de relogio voce deseja?(12 ou 24) ");
        String formato = scanner.nextLine();

    if(formato.equals("24")){
        for(int h=0; h<24;h++){
            for(int m=0; m<60;m++){
                rolex.ticTac();
                System.out.print(rolex.getHora().getValor());
                System.out.print(" : ");
                System.out.println(rolex.getMinuto().getValor());
                
            }
        }
    }
    else{
        
        

        for (int h = 1; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String time = rolex.mostrarHora();
                System.out.println(time);
            }
        }
    }
    }
}
