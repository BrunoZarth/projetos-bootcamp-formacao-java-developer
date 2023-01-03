import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class ContaTerminal{
    public static void main(String[] ars){
        
        Cliente cliente = new Cliente();

        cliente.setNomeCliente();
        cliente.setAgencia();
        cliente.setNumConta();
        cliente.setSaldo();

        
        cliente.printClient();

    }
}

class Cliente{
    String nomeCliente, agencia;
    Double saldo;
    Integer numConta;
    Scanner sc = new Scanner(System.in);

    public Cliente(String nomeCliente, Double saldo, Integer numConta){
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public Cliente(){
    };

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeCliente() {
        System.out.println("Por favor, digite o nome do Cliente: ");
        while(this.getNomeCliente() == null) this.nomeCliente = this.sc.next();
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setAgencia() {
        System.out.println("Por favor, digite a agência: ");
        while(this.getAgencia() == null) this.agencia = this.sc.next();
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setSaldo() {
        System.out.println("Por favor, digite o saldo da conta: ");
        while(sc.hasNext()) {
            if(sc.hasNextDouble()){ this.saldo = sc.nextDouble(); break;} else sc.next();
        }
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public void setNumConta() {
        System.out.println("Por favor, digite o número da conta: ");
        while(sc.hasNext()){
            if(sc.hasNextInt()){ this.numConta = sc.nextInt(); break;} else sc.next();
        }
        
    }

    public void printClient(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque" 
                        , this.getNomeCliente(), this.getAgencia(), this.getNumConta(), this.getSaldo());
    }

    
}


