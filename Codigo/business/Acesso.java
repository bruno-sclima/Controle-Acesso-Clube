package business;

import java.time.LocalDate;

public abstract class Acesso {

    private String nome;
    private long cpf;
    private LocalDate dataNascimento;
    private LocalDate dataAcesso;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Excecao{
        if(nome != null) {
        this.nome = nome;
        }
        else throw new Excecao("nome","null");
        
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) throws Excecao{
        if(cpf >0) {
        this.cpf = cpf;
        }else throw new Excecao("cpf","valor nulo ou negativo");
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) throws Excecao{
        if(dataNascimento.isAfter(LocalDate.of(1900, 1, 1))) {
        this.dataNascimento = dataNascimento;
        }else throw new Excecao("dataNascimento","datas anteriores a"+LocalDate.of(1900, 1, 1));
    }
    
    public LocalDate getDataAcesso() {
        return dataAcesso;
    }
    public void setDataAcesso(LocalDate dataAcesso) throws Excecao{
        if(dataNascimento.isAfter(LocalDate.of(1900, 1, 1))) {
        this.dataAcesso = dataAcesso;
        }else throw new Excecao("dataAcesso","datas anteriores a"+LocalDate.of(1900, 1, 1));
    }
    public Acesso(String nome, long cpf, LocalDate dataNascimento,LocalDate dataAcesso) throws Excecao{
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setDataAcesso(dataAcesso);
    }
    
    @Override
    public String toString() {
        return "Nome:" + nome + ", CPF:" + cpf + ", Data de Nascimento:" + dataNascimento +", Data de acesso:" + dataAcesso + "";
    }
    
    
}
