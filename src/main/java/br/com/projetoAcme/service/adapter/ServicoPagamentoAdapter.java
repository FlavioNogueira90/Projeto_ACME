package br.com.projetoAcme.service.adapter;

import br.com.projetoAcme.service.ServicoPagamentoAntigo;
import br.com.projetoAcme.service.ServicoPagamentoNovo;

public class ServicoPagamentoAdapter implements ServicoPagamentoNovo {
    private ServicoPagamentoAntigo servicoPagamentoAntigo;

    public ServicoPagamentoAdapter(ServicoPagamentoAntigo servicoPagamentoAntigo){
        this.servicoPagamentoAntigo = servicoPagamentoAntigo;
    }
    @Override
    public void realizarPagamento(double valor) {
        servicoPagamentoAntigo.processarPagamento(valor);
    }
}
