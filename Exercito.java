/* Modele uma simplificação da hierarquia do Exército Brasileiro. 
 Existem diferentes patentes militares, como Soldado, Cabo, Sargento, Tenente e Capitão.
Cada patente tem atributos como nome, número de identificação e tempo de serviço.
Os soldados reportam aos cabos, os cabos aos sargentos e assim por diante. 
Implemente métodos para listar os subordinados de um militar em uma patente superior e seu superior imediato.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;


public class Exercito {

    private static final char[] subordinados = null;

    public static void main(String[] args) {
   
        Conscrito conscrito = new conscrito();
        conscrito.nome("jorge", 1,0);
        Soldado soldado1 = new soldado();
        soldado1.nome = ("jorge1", 2, 1);
        Cabo cabo1 = new cabo();
        cabo1.nome = ("jorge2", 3, 2);
        Sargento sargento1 = new sargento();
        sargento1.nome = ("jorge3", 4 ,3);
        Tenente tenente1 = new tenente();
        tenente1.nome =("jorge4", 5, 4);
        Capitao capitao1 = new capitao();
        capitao1.nome = ("jorge5", 6,5);

        soldado1.addsubordinados(conscrito);
        cabo1.addsubordinados(soldado1);
        sargento1.addsubordinados(cabo1);
        tenente1.addSubordinados(sargento1);
        capitao1.addsubordinados(tenente1);

        conscrito.addImediato(soldado1);
        soldado1.addImediato(cabo1);
        cabo1.addImediato(sargento1);
        sargento1.addImediato(tenente1);
        tenente1.addImediato(capitao1);

        System.out.println("O imediato do conscrito é o "+ conscrito.getnome+ " é o o Soldado " +soldado1.getimediato.getnome());
        System.out.println("O imediato do soldado é o "+ soldado1.getnome+ " é o o cabo " +cabo1.getimediato.getnome());
        System.out.println("O imediato do cabo é o "+ cabo1.getnome+ " é o o sargento" +sargento1.getimediato.getnome());
        System.out.println("O imediato do sargento é o "+ sargento1.getnome+ " é o o tenente " + tenente1.getimediato.getnome());
        System.out.println("O imediato do tenente é o "+ tenente1.getnome+ " é o o capitao " +capitao1.getimediato.getnome());
        


       System.out.println(subordinados);
       

       
    }

    //private void addsubordinados(Conscrito conscrito) {
        // TODO
    }
