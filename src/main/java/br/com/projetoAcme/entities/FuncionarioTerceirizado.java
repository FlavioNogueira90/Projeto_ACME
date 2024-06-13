package br.com.projetoAcme.entities;

public class FuncionarioTerceirizado extends Funcionario{
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public int getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    public void setTempoPrevistoPermanencia(int tempPrevistoPermanecia) {
        this.tempoPrevistoPermanencia = tempPrevistoPermanecia;
    }
}
