package fazendinha;
    public class Teste{
    public Teste() {
    }
    public static void main (String[] args){
        //3 cabeças de gado
        double g;
        Gado gado1= new Gado();
        gado1.setNome("Marronzinha");
        gado1.setCorPelo("marrom");
        gado1.setConsumo(540);
        gado1.setMansidao("muito mansa");

        Gado gado2= new Gado();
        gado2.setNome("Pretinha");
        gado2.setCorPelo("preta");
        gado2.setConsumo(390);
        gado2.setMansidao("mansa");

        Gado gado3= new Gado();
        gado3.setNome("Malhadona");
        gado3.setCorPelo("malhada");
        gado3.setConsumo(450);
        gado3.setMansidao("brava");
        g = gado1.getConsumo() + gado2.getConsumo() + gado3.getConsumo();
        System.out.println("o total de ração mensal para os gados é: " +g);

        //2 Cavalos
        double c;
        Cavalo cavalo1= new Cavalo();
        cavalo1.setNome("Branquinho");
        cavalo1.setCorPelo("branco");
        cavalo1.setConsumo(90);
        cavalo1.setVelocmax(40);

        Cavalo cavalo2= new Cavalo();
        cavalo2.setNome("Marronzinho");
        cavalo2.setCorPelo("marrom");
        cavalo2.setConsumo(150);
        cavalo2.setVelocmax(70);
        c= cavalo1.getConsumo() + cavalo2.getConsumo();
        System.out.println("o total de ração mensal para os cavalos é: "+c);

        // 5 galinhas
        double a;
        double x;

        Galinha galinha1= new Galinha();
        galinha1.setNome("Branquilda");
        galinha1.setCorPelo("branca");
        galinha1.setConsumo(3.2);
        galinha1.setTipo("Cornish");

        Galinha galinha2= new Galinha();
        galinha2.setNome("Marronilda");
        galinha2.setCorPelo("marrom");
        galinha2.setConsumo(3.6);
        galinha2.setTipo("Rhode Island");

        Galinha galinha3= new Galinha();
        galinha3.setNome("Pretonilda");
        galinha3.setCorPelo("preta");
        galinha3.setConsumo(3.6);
        galinha3.setTipo("Brahma");

        Galinha galinha4= new Galinha();
        galinha4.setNome("Azunilda");
        galinha4.setCorPelo("azul escuro");
        galinha4.setConsumo(3.5);
        galinha4.setTipo("D'Angola");

        Galinha galinha5= new Galinha();
        galinha5.setNome("Malhanilda");
        galinha5.setCorPelo("malhada");
        galinha5.setConsumo(3.4);
        galinha5.setTipo("Sussex");
        a= galinha1.getConsumo() + galinha2.getConsumo() + galinha3.getConsumo() +galinha4.getConsumo() +galinha5.getConsumo() ;
        System.out.println("o consumo de ração total das galinhas foi: "+a);
        x= a+g+c;
        System.out.println("o consumo de ração total de todos os animais foi: "+x);

    }

}