package br.com.projetoAcme.factoryMethod.impl;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.entities.FuncionarioTerceirizado;
import br.com.projetoAcme.factoryMethod.FuncionarioFactory;

public class FuncionarioTerceirizadoFactory implements FuncionarioFactory {
    @Override
    public FuncionarioTerceirizado criarFuncionario() {
        return new FuncionarioTerceirizado();
    }
}
