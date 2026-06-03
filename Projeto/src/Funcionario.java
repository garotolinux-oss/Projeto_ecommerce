public class Funcionario extends Usuario {
    //atributos
    private float salario;
    private String cargo;
    //private int id;
    private int data_de_admissao;
    
    //Construtor
    public Funcionario(String nome, String senha, float salario, String cargo, int data_de_admissao) {
        super(nome, senha);
        this.salario = salario;
        this.cargo = cargo;
        //this.id = id;
        this.data_de_admissao = data_de_admissao;
    }
    //getters and setters 
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getData_de_admissao() {
        return data_de_admissao;
    }

    public void setData_de_admissao(int data_de_admissao) {
        this.data_de_admissao = data_de_admissao;
    }
    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + ", cargo=" + cargo + ", data_de_admissao=" + data_de_admissao + "]";
    }

    
    
   
    


    
}
