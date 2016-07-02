/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoController;
import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author a965866
 */
public class AlunoView {
    
    Scanner sc = new Scanner (System.in);
    
    AlunoController ac = new AlunoController();
    
    void run (){
        int opcao = -1;
      do{
        System.out.println(
            "====== Alunos ======"
            + "\n 1 - Cadastrar"
            + "\n 2 - Listar Tudo"
            + "\n 3 - Buscar por Matricula"
            + "\n 4 - Editar"
            + "\n 5 - Excluir"        
            + "\n 0 - Voltar"
            + "\n=============="
            + "Opção:  "    
        );
        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                Aluno aluno = new Aluno ();
                System.out.print ("Matricula: ");
                aluno.setMatricula(sc.nextInt());
                System.out.print("Nome: ");
                aluno.setNome(sc.next());
                System.out.print ("Idade: ");
                aluno.setIdade (sc.nextInt());
                ac.create (aluno);
                break;
            case 2:
                for (Aluno a : ac.FindAll()){
                    System.out.println(a.toString());
                }
                break;
            case 3:
                System.out.print ("Informe uma matricula:  ");
                ac = ac.findById(ac.next());
                if (ac == null){
                System.out.println ("Contato não encontrado");
                 }else {
                System.out.println(ac.toString());
                    
                }
        }
      } while (opcao !=0);
    }
    
    public AlunoView(){}
    
//    public static void main(String[] args) {
//        
//        new AlunoView().run();
//               
//             
//    }
    
}

