
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Estado;
import com.fieb.senai.entidades.Pessoa;
import com.fieb.senai.entidades.Telefone;
import java.util.ArrayList;
import java.util.List;


public class Application {

   
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("Zoofila", 454898, 16);
      Endereco end1 = new Endereco("Rua da misericordia","24", "cajacity");
      
     //Declarando a associação.
      p1.setEndereco(end1);
      
      Pessoa p2 = new Pessoa("Jhon", 48516, 35);
      Endereco end2 = new Endereco("Rua 16 de janeiro","21CAE","Coutos");
      Telefone tel2 =  new Telefone("789456");
      
      //Declarando a associação.
      p2.setEndereco(end2);
      p2.setTelefone(tel2);
      
      Pessoa p3 =  new Pessoa("joãozinho", 148516, 15);
      Telefone tel1 =  new Telefone("123456");
      Telefone tel3 =  new Telefone("12345615");
      
      //Declaração de associação. 
      p3.setTelefone(tel1);
      
      List<Telefone> listatelefone =  new ArrayList<>();
      
        for (Telefone telefone : listatelefone) {
            System.out.println("Telefone: " + telefone.getNumero()); 
            
        }
        Estado est1 = new Estado("Bahia");
        
       List<Estado> listaestado  = new ArrayList<>();
       
        for (Estado estado : listaestado) {
            System.out.println("Estado:" + estado.getNome());
            
        }
    }
    
}
