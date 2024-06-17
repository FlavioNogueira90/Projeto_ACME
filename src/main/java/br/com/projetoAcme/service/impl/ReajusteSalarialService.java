package br.com.projetoAcme.service.impl;

import br.com.projetoAcme.entities.Funcionario;
import br.com.projetoAcme.entities.FuncionarioTerceirizado;
import br.com.projetoAcme.service.ReajusteSalarial;

public class ReajusteSalarialService implements ReajusteSalarial {
    private static final String EXCEPTION_MESSAGE = "Reajuste salárial não se aplica a funcionários terceirizados";
    private static ReajusteSalarialService instance;

    private ReajusteSalarialService(){};

    public static ReajusteSalarialService getInstance(){
        if (instance == null){
            instance = new ReajusteSalarialService();
        }
        return instance;
    }

    @Override
    public void aplicarReajuste(Funcionario funcionario, double percentual) {
        if (funcionario instanceof FuncionarioTerceirizado){
            throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
        }
        double novoSalario = funcionario.getSalario() * (1 + percentual/100);
        funcionario.setSalario(novoSalario);
    }
}
