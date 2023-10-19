/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho.linguagem.orientada.a.objetos;

//Banco de dados
import java.util.Scanner; 

/**
 * Sistema Bancario
 * @author Ricardo
 */

class Cliente{
    private String name;
    private String sobrenome;
    private String cpf;
    private double saldo;
    
    public Cliente(String name, String sobrenome, String cpf){
        this.name= name;
        this.sobrenome= sobrenome;
        this.cpf= cpf;
        this.saldo= 0;
    }
    
    //Consultar Saldo
    public void consultarSaldo(){
        System.out.println("Seu saldo é R$" + saldo);
    }//Termino da consulta
    
    //Sacar o valor
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("saque R$"+ valor + "realizado com sucesso.");
        }else {
            System.out.println("Saldo insuficiente ou invalido.");
        }
    }//termino do saque
    
    //Depositar o valor
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado com sucesso.");
        }else {
            System.out.println("Valor de depósito esta invalido");
        }
    }//Fim do deposito
}//Final da classe de cliente

public class TrabalhoLinguagemOrientadaAObjetos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe o seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe o seu CPF:");
        String cpf = scanner.nextLine();
        
        //Instanciando o objeto a classe cliente
        Cliente cliente = new Cliente(nome,sobrenome,cpf);
        
        boolean continuar = true;
        while(continuar) {
            System.out.println("o que deseja:");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Fazer Saque");
            System.out.println("3- Fazer Deposito");
            System.out.println("4- Encerrar");
            
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informar o valor do seu saque:");
                    double valorSaque=scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Informe o valor do seu deposito:");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrar a aplicação...");
                    break;
                default:
                    System.out.println("Opção não encontrada ou invalida,tente outra vez.");
                    break;
            }
        }
        scanner.close();
    }
}
