/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoController;
import controller.ProfessorControler;
import java.util.Scanner;
import model.Aluno;
import model.Professor;

/**
 *
 * @author a965866
 */
public class Principal {
    
    public static void main(String[] args) {
        
  
        Scanner sc = new Scanner(System.in);
         int opcao = -1;
         ProfessorControler pc = new ProfessorControler();  
         AlunoController ac = new AlunoController();
         
        do{ 
            System.out.println(
            "====== Escola Feliz ======"
            + "\n 1 - Professores"
            + "\n 2 - Alunos"       
            + "\n 0 - Sair"
            + "\n=============="
            + "Opção:  "         
            );
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    new ProfessorView().run();
            {
                Professor professor = null;
                pc.create(professor);
            }
                    break;
                case 2: 
                    new AlunoView().run();
            {
                Aluno aluno = null;
                ac.create(aluno);
            }
                    break;
            }
        } while (opcao != 0);
    
    }
    
    
    }

