package br.com.projetoAcme.entities;

import lombok.Data;

@Data
public class FuncionarioTerceirizado extends Funcionario{
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

}
