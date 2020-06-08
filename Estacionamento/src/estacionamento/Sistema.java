
package estacionamento;

import javax.swing.JOptionPane;

class Sistema {
   public String cor, modelo, placaLetra, nome;
   public int placaNum;
   public int horaEnt, horaSai, minEnt, minSai;
   private double preco;
  
   
   public void setNome(String nome){
       this.nome = nome;
    }
   
   public String getNome(){
       return nome;
    }
   
   public void setCor(String cor){
       this.cor = cor;
    }
   
   public String getCor(){
       return cor;
    }
   
   public void setModelo(String modelo){
       this.modelo = modelo;
    }
   
   public String getModelo(){
       return modelo;
    }
   
   public void setPlacaLetra(String placaLetra){
       this.placaLetra = placaLetra;
    }
   
   public String getPlacaLetra(){
       return placaLetra;
    }
   
   public void setPlacaNum(int placaNum){
       this.placaNum = placaNum;
    }
   
   public int getPlacaNum(){
       return placaNum;
    }
   
   public void setHoraEnt(int horaEnt){
       this.horaEnt = horaEnt;
    }
   
   public int getHoraEnt(){
       return horaEnt;
    }
   
   public void setHoraSai(int horaSai){
       this.horaSai = horaSai;
    }
   
   public int getHoraSai(){
       return horaSai;
    }
   
   public void setMinEnt(int minEnt){
       this.minEnt = minEnt;
    }
   
   public int getMinEnt(){
       return minEnt;
    }
   
   public void setMinSai(int minSai){
       this.minSai = minSai;
    }
   
   public int getMinSai(){
       return minSai;
    }
   
   private void setPreco(double preco){
       this.preco = preco;
    }
   
   private double getPreco(){
       return preco;
    }
   
   public void cadastrar(int placaNum, String placaLetra, String cor, String modelo){
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placaLetra+ placaNum);
        JOptionPane.showMessageDialog(null,"Dados cadastrados com sucesso!");
        
        this.calculoTempo(horaEnt, horaSai, minEnt, minSai);
    }
   
   private void calculoTempo(int horaEnt, int horaSai, int minEnt, int minSai){
    //horaEnt= Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de Entrada, SEM OS MINUTOS : "));
    //minEnt= Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos de Entrada, SEM A HORA : "));
    //horaSai= Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de Saída, SEM OS MINUTOS : "));
    //minSai= Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos de Saída, SEM A HORA : "));
    
    double hora, min, tempo = 0 ;
    int a, b, c,d;
    
    a=horaEnt;
    b=horaSai;
    c=minEnt;
    d=minSai;
    hora= b-a;
    min= d-c;
    
    if(min<=60){
        tempo= hora+1;
    } 
    this.pagamento(tempo, preco);
   }
   
   private void pagamento (double tempo, double preco){
      preco= tempo*4 ;
    this.notinha(horaEnt, minEnt, horaEnt, horaSai, minEnt, minSai, tempo, preco, nome);
   }
   
   public void notinha (double hora, double min, int horaEnt, int horaSai, int minEnt, int minSai, double tempo, double preco, String nome){
    System.out.println("");
    JOptionPane.showMessageDialog(null,"Nota Fiscal Estacionamento \n"
            + nome+" \n"
            + "Modelo do carro: "+modelo+"\n"
            + "Cor do carro: "+cor+"\n"
            + "Placa do carro: "+placaLetra+" "+placaNum+"\n"
            + "----------------------------------- \n"
            + "Horário de Entrada: "+horaEnt+":"+minEnt+"\n"
            + "Horário de Saída: "+horaSai+":"+minSai+"\n"
            + "----------------------------------- \n"
            + "Tempo no Estacionamento: "+tempo+"h \n"
            + "VALOR A PAGAR: "+preco);
    
}

}
