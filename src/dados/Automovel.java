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
public class Automovel {
    private boolean motor;
    private int velocidadeAtual;
    private int portas;
    private int rodas;
    private int oleo;
    private int produtos;
    
    
  
//metodo partida
public void liga(){
    System.out.println("PARTIDA INICAL DO VEICULO**********************");
    this.motor = true;
    System.out.println("Ligando...Motor Ligado!");
    System.out.println("***");

}

//metodo FINAL
public void desliga(){
    System.out.println(" PARTIDA FINAL DO VEICULO");
    this.motor = false;
    System.out.println("Desligando...Motor Desligado!");
    System.out.println("***");
}



//metodo velocidade
    public void acelera(){
    System.out.println("VELOCIDADE DO VEICULO");
    if(motor){
    System.out.println("Motor Ligado: Acelerando...");
    System.out.println("***");
    }
}

    //metodo frenagem
    public void frear(){
    System.out.println("ESTADO DO VEICULO");
    if(motor){
    System.out.println("Motor Ligado: Freando...");
    System.out.println("***");
    }
}
    
    
    //metodo substituiçao  pneu
    public void trocarPneu(){
    System.out.println("TROCA DE PNEU DO VEICULO");    
        if(motor == false){
            System.out.println("Pare antes de (tentar) Trocar o Pneu!");
        }
        
    }
    
    //metodo conferir oleo
    public void trocaOleo(){
        System.out.println("TROCA DE OLEO DO VEICULO");
        if(this.getOleo() >= 2.5){
            System.out.println("Oleo OK! Pode rodar!");
        } else {
            System.out.println("Atenção: Oleo Baixo. Troque antes de Rodar!");
            this.setOleo(3);
            System.out.println("Oleo Trocado! Pode rodar!");
        }
    }
    
    //metodo passageiros
    public void embarque(){
        System.out.println("CARGA DO VEICULO");
        if(this.getProdutos() == 0){
            System.out.println("Inicio abastecendo o Veiculo!");
            this.setProdutos(1);
        } else if (this.getProdutos() == 1){
            System.out.println("amarrando a lona do Veiculo!");
            this.setProdutos(2);
        } else if (this.getProdutos() == 2){
            System.out.println("verificando Veiculo");
            this.setProdutos(3);
        } else if (this.getProdutos() == 3){
            System.out.println("Carga Completa: ");
        }
    }
    
//metodo Exibe relatorio
public void exibeEstado(){
    System.out.println("RELATORIO DO VEICULO");
    System.out.println("O motor está: " + this.getMotor() +
            " | A velocidade é: " + this.getVelocidadeAtual() +
            " | Número de Portas: " + this.getPortas() +
            " | Número de Rodas: " + this.getRodas() +
            " | Nível do Oleo: " + this.getOleo() +
            " | Número de Produtos: " + this.getProdutos());
    
}

    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getOleo() {
        return oleo;
    }

    public void setOleo(int oleo) {
        this.oleo = oleo;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    private int getPassageiros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPassageiros(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
    
    
   


