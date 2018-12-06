
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;


public class Application {

   
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("Zoofila", 454898, 16);
      Endereco end1 = new Endereco("Rua da misericordia","24", "cajacity");
      
     //Declarando a associação.
      p1.setEndereco(end1);
      
      Pessoa p2 = new Pessoa("Jhon", 48516, 35);
      Endereco end2 = new Endereco("Rua 16 de janeiro","21CAE","Coutos");
      
      //Declarando a associação.
      p2.setEndereco(end2);
      
    }
    
}
