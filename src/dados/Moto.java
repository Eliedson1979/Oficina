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
public class Moto extends Automovel {
    public Moto(){
        //super();
        this.setMotor(false);
        this.setVelocidadeAtual(0);
        this.setPortas(0);
        this.setRodas(2);
        this.setOleo(1);
        this.setProdutos(0);
    }
    
    @Override
    public void acelera(){
        System.out.println("VELOCIDADE  DA MOTO");
        if(this.getMotor()){
            System.out.println("Acelerando a Moto...Cuidado com o Limite de 110KM/h!");
            this.setVelocidadeAtual(this.getVelocidadeAtual() + 20);
            if(this.getVelocidadeAtual()> 110){
                System.out.println("Você está acima do limite de 110KM/h Permitido!");
            }
        }
    }
    
    @Override
    public void frear(){
        System.out.println("FRENAGEM DA MOTO");
        if(this.getMotor()){
            System.out.println("Freando a Moto...");
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 20);
        }
    }
    
    @Override
    public void trocarPneu(){
        System.out.println("TROCA DE PNEU MOTO");
        System.out.println("Vich. Furou o Pneu. Parando para Trocar!");
        System.out.println("Troca de Pneu Individual custa R$ 200: " + "Preciso Trocar 2 Pneus. Valor total: " + "R$ " + 2 * 200);
        }
    
    @Override
    public void exibeEstado(){
        System.out.println("RELATORIO DA MOTO");
    System.out.println("O motor está: " + this.getMotor() +
            " | A velocidade é: " + this.getVelocidadeAtual() +
            " | Número de Portas: " + this.getPortas() +
            " | Número de Rodas: " + this.getRodas() +
            " | Nível do Oleo: " + this.getOleo() +
            " | Número de Produtos: " + this.getProdutos());
    }
    
}
