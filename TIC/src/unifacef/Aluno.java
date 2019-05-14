package unifacef;

/**
 *
 * @author vsued
 */
public class Aluno {
    private int codigo;
    private String nomeAluno;
    private String sexoAluno;
    private String estadoAluno;

    public Aluno(int codigo, String nomeAluno, String sexoAluno, String estadoAluno) {
        this.codigo = codigo;
        this.nomeAluno = nomeAluno;
        this.sexoAluno = sexoAluno;
        this.estadoAluno = estadoAluno;
    }

    public Aluno() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getEstadoAluno() {
        return estadoAluno;
    }

    public void setEstadoAluno(String estadoAluno) {
        this.estadoAluno = estadoAluno;
    }
    
    
    
}
