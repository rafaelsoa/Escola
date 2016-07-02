/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProfessorControler;
import java.util.Scanner;
import model.Professor;

/**
 *
 * @author a965866
 */
public class ProfessorView {
    
    Scanner sc = new Scanner(System.in);
    
    ProfessorControler pc = new ProfessorControler();
    
    public ProfessorView() {}
    
    void run(){
        int opcao = -1;
        do{
            System.out.println(
            "====== Alunos ======"
            + "\n 1 - Cadastrar professor"
            + "\n 2 - Listar Todos professores"
            + "\n 3 - Buscar por Matricula"
            + "\n 4 - Editar professor"
            + "\n 5 - Excluir professor"        
            + "\n 0 - Voltar"
            + "\n=============="
            + "Opção:  "         
            );
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    cadastrar();
                    break;
                case 2: 
                    listarTudo();
                    break;
            }
        } while (opcao != 0);
        
    }
    
    private void cadastrar (){
      Professor professor = new Professor ();
      System.out.print ("Matricula:  ");
      professor.setMatricula(sc.nextInt());
      System.out.print ("Nome:  ");
      professor.setNome (sc.next());
      System.out.print ("Idade: ");
      professor.setIdade(sc.nextInt());
      System.out.print ("Disciplina:  ");
      professor.setDisciplina(sc.next());
      pc.create(professor);
      
    }
    
    private void listarTudo(){
      for (Professor professor : pc.FindAll()){
          System.out.println(professor.toString());
                  
      }
    }
     private void remover (){
         Professor professor = new Professor ();
         System.out.print ("Matricula: ");
         professor = pc.findById(sc.nextInt());
         if (professor == null){
             System.out.println("Professor não cadastrado");
         } else {
           pc.delete(professor);
         }
        
      }
//      public static void main(String[] args){
//        new ProfessorView().run();
      }
    
