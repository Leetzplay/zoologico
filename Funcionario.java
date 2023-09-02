public class Funcionario {

    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private String turnoTrabalho;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
    public Funcionario(String nome, int idade, String cargo, double salario, String turnoTrabalho, String CPF) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.turnoTrabalho = turnoTrabalho;
        this.CPF = CPF
    }
