/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author a965866
 */
public class AlunoController {
//   criar lista com Aluno chamada de alunos 
    private List <Aluno> alunos; 
    
//criar um construtor
    public AlunoController() {
        this.alunos = new ArrayList<>();
    }
//    salvar um Aluno aluno (C)
    public void create (Aluno aluno){
    alunos.add(aluno);
    }
//  localizar tudo (Read)
    public List<Aluno> FindAll(){
    return alunos;
    }
//    localizar por id (Read)
    public Aluno findById(int matricula){
     Aluno aluno = new Aluno ();
     aluno = null;
     for (Aluno a : alunos) {
         if (a.getMatricula() == matricula){
             aluno = a; 
             break;
         }
     
     }
     return aluno;
    }
    public void update (Aluno aluno){
// "varrendo" para Aluno "a" na lista alunos ou em "alunos" (nome da lista)
        for (Aluno a : alunos){
        if (a.getMatricula () == aluno.getMatricula()){
            a.setNome(aluno.getNome());
            a.setIdade(aluno.getIdade());
            break;
        }
        }
    }
    public void delete (Aluno aluno){
        alunos.remove(aluno);
     }

    public int next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
