/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //cosntrutor cheio
       
      ESTUDANTE aluno01 = new ESTUDANTE("Wagner", "123456789", "14997889944");
      ESTUDANTE aluno02 = new ESTUDANTE("Fabiano", "23456789", "14234567891");
      ESTUDANTE aluno03 = new ESTUDANTE("ze", "2345678912", "3456789123");
      ESTUDANTE aluno04 = new ESTUDANTE("DU", "456789123", "456789129");
      
      aluno01.addDisciplinaNotas("POO" , 6);
      aluno01.addDisciplinaNotas("EngSW" , 6);
      aluno01.addDisciplinaNotas("SitOP", 6);
      aluno01.addDisciplinaNotas("EstDad", 6);
      aluno01.addDisciplinaNotas("Estatist", 6);
      
      aluno02.addDisciplinaNotas("POO" , 6);
      aluno02.addDisciplinaNotas("EngSW" , 6);
      aluno02.addDisciplinaNotas("SitOP", 6);
      aluno02.addDisciplinaNotas("EstDad", 6);
      aluno02.addDisciplinaNotas("Estatist", 6);
      
     aluno01.Listarnotasdisciplinas();
     aluno02.Listarnotasdisciplinas();
     
    aluno01.addEstudante(aluno02);
    aluno01.addEstudante(aluno03);
    aluno01.addEstudante(aluno04);
    
    aluno01.listarmonitorados();
      
    }
    
}
