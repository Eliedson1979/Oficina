/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author asgar
 */
public class RELATORIO extends Thread {
    private final JLabel nome;
    private final frmPista velocidade;
    
    
    public RELATORIO(JLabel nome, frmPista velocidade){
        this.nome=nome;
        this.velocidade=velocidade;
    }
    
    @Override
    @SuppressWarnings("UseSpecificCatch")
    public void run(){
        int velocidade1=0, velocidade2=0, velocidade3=0;
        while (true) {
            try {
                sleep((int)(Math.random()*1000));
                velocidade1=velocidade.getc1().getLocation().x;
                velocidade2=velocidade.getca1().getLocation().x;
                velocidade3=velocidade.getm1().getLocation().x;
                if(velocidade1<velocidade.getjfinal().getLocation().x-10&&velocidade2<velocidade.getjfinal().getLocation().x-10&&velocidade3<velocidade.getjfinal().getLocation().x-10){
                    nome.setLocation(nome.getLocation().x+10,nome.getLocation().y);
                    velocidade.repaint();
                }else{
                    break;
                }
                    
            } catch (InterruptedException e) {           
            }
            if(nome.getLocation().x>=velocidade.getjfinal().getLocation().x-10){
                if(velocidade1>velocidade2){
                  JOptionPane.showMessageDialog(null,"PARADA PARA OFICINA 1º \nESTADO DO CARRO: \n1º VELOCIDADE 110KM/H: OK \n2º CARRO POSSUI 4 RODAS E 2 PORTAS \n3º TROCA DE OLEO:OK \n4º FREAGEM: OK \n5º  PNEUS TROCADO VALOR 150,00R$: OK");
                }else if(velocidade2>velocidade1){
                     JOptionPane.showMessageDialog(null,"PARADA PARA OFICINA 2º \nESTADO DO CAMINHAO: \n1º VELOCIDADE 80KM/H: OK \n2º CAMINHAO POSSUI 10 RODAS E 2 PORTAS \n3º TROCA DE OLEO:OK \n4º FREAGEM: OK \n5º  PNEUS TROCADO VALOR 150,00R$: OK");
                }else if(velocidade3>velocidade2){
                     JOptionPane.showMessageDialog(null,"PARADA PARA OFICINA 3º \nESTADO DA MOTO: \n1º VELOCIDADE 80KM/H: OK \n2º MOTO POSSUI 2 RODAS \n3º TROCA DE OLEO:OK \n4º FREAGEM: OK \n5º  PNEUS TROCADO VALOR 150,00R$: OK");
                }else{
                     JOptionPane.showMessageDialog(null," VEICULOS EMPATADOS");
                    
              }  
            }
        }
    }
}
