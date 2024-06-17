package br.com.projetoAcme.service.impl;

import br.com.projetoAcme.service.ServicoPagamentoAntigo;

public class PagamentoAntigoService implements ServicoPagamentoAntigo {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento no sistema antigo: " + valor);
    }
}
