/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author asgar
 */
public class Carro extends Automovel {
    
     public Carro(){
        //super();
        this.setMotor(false);
        this.setVelocidadeAtual(0);
        this.setPortas(4);
        this.setRodas(5);
        this.setOleo(1);
        this.setProdutos(0);
    }
    
    @Override
    public void acelera(){
        System.out.println("VELOCIDADE  DO CARRO");
        if(this.getMotor()){
            System.out.println("Acelerando o Carro...Cuidado com o Limite de 110KM/h!");
            this.setVelocidadeAtual(this.getVelocidadeAtual() + 10);
            if(this.getVelocidadeAtual()> 110){
                System.out.println("Você está acima do limite de 110KM/h Permitido!");
            }
        }
    }
    
    @Override
    public void frear(){
        System.out.println("FRENAGEM  DO CARRO");
        if(this.getMotor()){
            System.out.println("Freando o Carro...");
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 10);
        }
    }
    
    @Override
    public void trocarPneu(){
        System.out.println("TROCA DE PNEUS DO CARRO");
        System.out.println("Vich. Furou o Pneu. Parando para Trocar!");
        System.out.println("Troca de Pneu Individual custa R$ 350: " + "Preciso Trocar 2 Pneus. Valor total: " + "R$ " + 2 * 350);
        }
    
    @Override
    public void embarque(){
        System.out.println("EMBARQUE NO CARRO");
        if(this.getProdutos() == 0){
            System.out.println("Posso levar o Produtos!");
            this.setProdutos(1);
        } else if (this.getProdutos() == 1){
            System.out.println("Posso levar  um Produtos!");
            this.setProdutos(2);
        } else if (this.getProdutos() == 2){
            System.out.println("Posso levar o maximo cinco Produtos!");
            this.setProdutos(3);
        } else if (this.getProdutos() == 3){
            System.out.println("Carga Completa: Vamos para a Entrega do Destinatario!");
        }
    }
    
    @Override
    public void exibeEstado(){
        System.out.println("RELATORIO DO CARRO");
    System.out.println("O motor está: " + this.getMotor() +
            " | A velocidade é: " + this.getVelocidadeAtual() +
            " | Número de Portas: " + this.getPortas() +
            " | Número de Rodas: " + this.getRodas() +
            " | Nível do Oleo: " + this.getOleo() +
            " | Número de Produtos: " + this.getProdutos());
    }
        
}


        



