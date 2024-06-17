package br.com.projetoAcme.factoryMethod.impl;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.factoryMethod.FuncionarioFactory;

public class FuncionarioPadraoFactory implements FuncionarioFactory {

    @Override
    public Funcionario criarFuncionario() {
        return new Funcionario();
    }
}
