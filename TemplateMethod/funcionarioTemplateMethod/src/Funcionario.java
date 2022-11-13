public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numeroConta;
    private String localDeposito;

    public Funcionario(String nome, String sobrenome, String numeroConta, String localDeposito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
        this.localDeposito = localDeposito;
    }

    public void pagamentoDeSalario(){
        double salario;
        salario = calcularSalario();
        imprimirRecibo(salario);
        depositar(salario);
    }

    public abstract double calcularSalario();
    public void imprimirRecibo(double salario){
        System.out.println("O salario calculado para o funcionario " +this.nome + " e de R$ " + salario);
    }

    public void depositar(double salario){
        System.out.println("O valor de R$" + salario + " foi depositado na conta " + this.numeroConta +  " em nome de " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getLocalDeposito() {
        return localDeposito;
    }

    public void setLocalDeposito(String localDeposito) {
        this.localDeposito = localDeposito;
    }
}
