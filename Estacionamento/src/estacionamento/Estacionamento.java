package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        Sistema dados = new Sistema();
        
        dados.setNome((JOptionPane.showInputDialog("Digite o seu nome: ")));
        dados.setModelo((JOptionPane.showInputDialog("Digite o modelo do seu carro: ")));
        dados.setCor((JOptionPane.showInputDialog("Digite a cor do seu carro: ")));
        dados.setPlacaLetra((JOptionPane.showInputDialog("Digite as letras da placa do seu carro: ")));
        dados.setPlacaNum(Integer.parseInt(JOptionPane.showInputDialog("Digite os números da placa do seu carro: ")));
        
        dados.horaEnt= Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de Entrada, SEM OS MINUTOS : "));
        dados.minEnt= Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de Entrada, SEM A HORA : "));
        dados.horaSai= Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de Saída, SEM OS MINUTOS : "));
        dados.minSai= Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de Saída, SEM A HORA : "));
        
        dados.cadastrar(dados.getPlacaNum(),dados.getPlacaLetra(), dados.getModelo(), dados.getCor());
    }
    
}
