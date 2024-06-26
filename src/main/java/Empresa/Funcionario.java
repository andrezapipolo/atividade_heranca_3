package Empresa;

public class Funcionario extends Pessoa {
    public String setor;
    public String cargo;
    public String funcao;

    // Construtor
    public Funcionario(String nome, int idade, String telefone, String setor, String cargo, String funcao) {
        super(nome, idade, telefone);
        this.setor = setor;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    // Getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
