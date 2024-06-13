package br.com.projetoAcme.service.impl;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.entities.FuncionarioTerceirizado;
import br.com.projetoAcme.service.ReajusteSalarial;

public class ReajusteSalarialImpl implements ReajusteSalarial {

    @Override
    public void reajustarSalario(Funcionario funcionario, double percentual) {
        if (funcionario instanceof FuncionarioTerceirizado){
            throw new UnsupportedOperationException("Reajuste salárial não se aplica a funcionários terceirizados");
        }
        double novoSalario = funcionario.getSalario() * (1 + percentual/100);
        funcionario.setSalario(novoSalario);
    }
}
