package principal;



public class Teste {
	public static void main(String[] args) {
		Ponto2D[] pontos = new Ponto2D[4];
        Espaco2D espaco = new Espaco2D();

        //circulo
        pontos[0] = new Ponto2D(2, 1);
        pontos[1] = new Ponto2D(5, 2);
        espaco.adicionaForma(espaco.criaForma(pontos));

        //quadrado
        pontos[0] = new Ponto2D(0, 0);
        pontos[1] = new Ponto2D(0, 2);
        pontos[2] = new Ponto2D(2, 2);
        pontos[3] = new Ponto2D(2, 0);
        espaco.adicionaForma(espaco.criaForma(pontos));

        //triangulo
        pontos[0] = new Ponto2D(0, 0);
        pontos[1] = new Ponto2D(4, 0);
        pontos[2] = new Ponto2D(2, 3);
        pontos[3] = null;
        espaco.adicionaForma(espaco.criaForma(pontos));

        System.out.println(espaco.calculaAreaTotal());
        System.out.println(espaco.calculaPerimetroTotal());
        System.out.println(espaco.mostraTipoTriangulo());
    }

}
