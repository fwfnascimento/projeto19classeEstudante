/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ESTUDANTE {
    protected String nome;
    protected String RA;
    protected String celular;
    protected ArrayList<ESTUDANTE> monitor = new ArrayList<>();
    //ArrayList
    ArrayList<String> listaDisciplinas = new ArrayList<>();
    ArrayList<Integer> listaNotas = new ArrayList<>();

    //Construtores
    
    //vazio

    public ESTUDANTE() {
    }
    
    //cheio

    public ESTUDANTE(String nome, String RA, String celular) {
        this.nome = nome;
        this.RA = RA;
        this.celular = celular;
    }
    
    //getter e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
   // metodos
    
    public void addDisciplinaNotas(String disciplina, int notas){
          listaDisciplinas.add(disciplina);
          listaNotas.add(notas);
    }
    
    public void Listarnotasdisciplinas(){
        for (int i = 0; i < listaDisciplinas.size(); i ++){
            System.out.println("Disciplinas " + listaDisciplinas.get(i));
            System.out.println("Notas " + listaNotas.get(i));
        }
    }

    public int calcularmediaNotas(){
        int media = 0;
        for (int i = 0; i < listaNotas.size(); i ++){
            media = media + listaNotas.get(i);
            media = media / listaNotas.get(i);           
        }
        return media;
    }
    
   public void addEstudante(ESTUDANTE objestudante){
      
       monitor.add(objestudante);
          
       }
   public void listarmonitorados(){
   for(int  i= 0; i < monitor.size(); i++){
        System.out.println("\nMonitorado " + monitor.get(i).nome + 
                           "\nRA " + monitor.get(i).RA + 
                           "\ncelular " + monitor.get(i).celular);
    } 
   }
        
    
}
