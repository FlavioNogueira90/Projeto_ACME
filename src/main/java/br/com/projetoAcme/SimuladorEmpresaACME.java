package br.com.projetoAcme;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.entities.FuncionarioTerceirizado;
import br.com.projetoAcme.entities.enums.Cargo;
import br.com.projetoAcme.entities.enums.Setor;
import br.com.projetoAcme.factoryMethod.FuncionarioFactory;
import br.com.projetoAcme.factoryMethod.impl.FuncionarioPadraoFactory;
import br.com.projetoAcme.factoryMethod.impl.FuncionarioTerceirizadoFactory;
import br.com.projetoAcme.observer.FuncionarioObserver;
import br.com.projetoAcme.observer.financeiroObserver.FinanceiroObserver;
import br.com.projetoAcme.observer.funcionarioObserver.FuncionarioSujeito;
import br.com.projetoAcme.observer.rhObserver.RhObserver;
import br.com.projetoAcme.service.ServicoPagamentoAntigo;
import br.com.projetoAcme.service.ServicoPagamentoNovo;
import br.com.projetoAcme.service.adapter.ServicoPagamentoAdapter;
import br.com.projetoAcme.service.impl.PagamentoAntigoService;
import br.com.projetoAcme.service.impl.ReajusteSalarialService;

public class SimuladorEmpresaACME {
    public static void main(String[] args) {
        // Criando funcionários usando a fábrica
        FuncionarioFactory funcionarioFactory = new FuncionarioPadraoFactory();
        Funcionario funcionario = funcionarioFactory.criarFuncionario();
        funcionario.setNome("João");
        funcionario.setSalario(2000);
        funcionario.setCargo(Cargo.JUNIOR);
        funcionario.setSetor(Setor.DESENVOLVIMENTO);

        FuncionarioFactory terceirizadoFactory = new FuncionarioTerceirizadoFactory();
        FuncionarioTerceirizado terceirizado = (FuncionarioTerceirizado) terceirizadoFactory.criarFuncionario();
        terceirizado.setNome("Maria");
        terceirizado.setSalario(3000);
        terceirizado.setCargo(Cargo.PLENO);
        terceirizado.setSetor(Setor.DEVOPS);
        terceirizado.setEmpresaContratada("Empresa XYZ");
        terceirizado.setTempoPrevistoPermanencia(12);

        // Usando o Singleton
        ReajusteSalarialService reajusteService = ReajusteSalarialService.getInstance();
        reajusteService.aplicarReajuste(funcionario, 10);
        System.out.println("Novo salário de " + funcionario.getNome() + ": " + funcionario.getSalario());

        try {
            reajusteService.aplicarReajuste(terceirizado, 10);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Usando o Adapter
        ServicoPagamentoAntigo servicoAntigo = new PagamentoAntigoService();
        ServicoPagamentoNovo servicoAdapter = new ServicoPagamentoAdapter(servicoAntigo);
        servicoAdapter.realizarPagamento(100.0);

        // Usando o Observer
        FuncionarioSujeito funcionarioSujeito = new FuncionarioSujeito();
        FuncionarioObserver rhObserver = new RhObserver();
        FuncionarioObserver financeiroObserver = new FinanceiroObserver();
        funcionarioSujeito.adicionarObserver(rhObserver);
        funcionarioSujeito.adicionarObserver(financeiroObserver);
        funcionarioSujeito.notificarObservers(funcionario);
    }
}