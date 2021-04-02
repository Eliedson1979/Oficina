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
public class Caminhao extends Automovel {
public Caminhao(){
        //super();
        this.setMotor(false);
        this.setVelocidadeAtual(0);
        this.setPortas(2);
        this.setRodas(6);
        this.setOleo(1);
        this.setProdutos(0);
    }
    
    @Override
    public void acelera(){
        System.out.println("VELOCIDADE  DO CAMINHAO");
        if(this.getMotor()){
            System.out.println("Acelerando o Caminhao...Cuidado com o Limite de 80KM/h!");
            this.setVelocidadeAtual(this.getVelocidadeAtual() + 5);
            if(this.getVelocidadeAtual()> 80){
                System.out.println("Você está acima do limite de 80KM/h Permitido!");
            }
        }
    }
    
    @Override
    public void frear(){
        System.out.println("FRENAGEM DO CAMINHAO");
        if(this.getMotor()){
            System.out.println("Freando o Caminhao...");
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 5);
        }
    }
    
    @Override
    public void trocarPneu(){
        System.out.println("TROCA DE PNEU DO CAMINHAO");
        System.out.println("Vich. Furou o Pneu. Parando para Trocar!");
        System.out.println("Troca de Pneu Individual custa R$ 1000: " + "Preciso Trocar 2 Pneus. Valor total: " + "R$ " + 2 * 1000);
        }
    
    @Override
    public void embarque(){
        System.out.println(" CAMINHAO PESADO");
        if(this.getProdutos() == 0){
            System.out.println("Levando Produtos!");
            this.setProdutos(1);
        } else if (this.getProdutos() == 1){
            System.out.println("Expecionando Produto!");
            this.setProdutos(2);
        } else if (this.getProdutos() == 2){
            System.out.println("Entrega no Destinatario!");
        }
    }
    
    @Override
    public void exibeEstado(){
    System.out.println("RELATORIO DO CAMINHAO");
    System.out.println("O motor está: " + this.getMotor() +
            " | A velocidade é: " + this.getVelocidadeAtual() +
            " | Número de Portas: " + this.getPortas() +
            " | Número de Rodas: " + this.getRodas() +
            " | Nível do Oleo: " + this.getOleo() +
            " | Número de Produtos: " + this.getProdutos());
    }
}
