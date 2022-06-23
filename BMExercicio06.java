class BMExercio06 {
  
    String nomeDoCorrentista;
    float saldo;
    boolean contaÉEspecial;
  
    void abreConta (nome, depósito, éEspecial){};
    void abreContaSimples (nome, valor){
        if(valor < 100.0){
            System.out.println("Menor valor permitido: R$ 100.00");break;
        }
    };
    void deposita (valor){};
    void retira (valor){};
    void mostraDados (){
      if(éEspecial){
        if(saldo < 0){
          System.out.println("Seu saldo está negativo");
        }
      }
    };
  }