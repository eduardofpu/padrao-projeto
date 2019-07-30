package padrao.com.org.Comportamental.Iterator;

public class AlunoVO {

    private String nome;
    private String endereco;
    private Integer matricula;

    public AlunoVO(String nome, String endereco, Integer matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
