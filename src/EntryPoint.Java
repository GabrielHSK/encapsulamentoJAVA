package scr;

import scr.Pessoa;

class EntryPoint {
    public static void main(String[] args) {
        //Instancie sua classe aqui        
    Pessoa pessoa1 = new Pessoa();

    pessoa1.nome("Gabriel");
    pessoa1.idade(24);
    pessoa1.sexo("M");


    pessoa1.imprimirPessoa();
  }   
}