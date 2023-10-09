package contabilidade2023;

public class SstemadePagamentoTeste {
    public static void main(String[] args) {
        Empregado assalariado = new Assalariado("Roberto", "Cleyson", 115, 3);
        Empregado terceirizado = new Tercerizado("Claudemyr", "Drugovisk", 242, 160);
        Empregado comissionado = new Comissionado("Cleyde", "Massarava", 856, 250000);
        Empregado asComissionado = new AssalariadoComissionado("xerox", "Silva", 266, 25000, 25);
        Conta titulo = new Titulo(13, 11, 1000);
        Conta concessionaria = new Concessionaria(15, 12, 1500);

        ControlePagamento contasPagamento = new ControlePagamento();
        contasPagamento.addPagamento(assalariado);
        contasPagamento.addPagamento(terceirizado);
        contasPagamento.addPagamento(comissionado);
        contasPagamento.addPagamento(asComissionado);
        contasPagamento.addPagamento(titulo);
        contasPagamento.addPagamento(concessionaria);

        System.out.println("Total a pagar aos funcionários: " + contasPagamento.controleEmpregado());
        System.out.println("Total a pagar de contas: " + contasPagamento.controleContas(20, 10));
        System.out.println("Total a pagar no geral: " + contasPagamento.controlePagTotal(20, 10));
    }
    }

