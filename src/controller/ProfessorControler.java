/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

/**
 *
 * @author a965866
 */
public class ProfessorControler {
    
    List<Professor> professores;

    public ProfessorControler() {
        this.professores = new ArrayList();
    }
    public void create (Professor professor){
        professores.add(professor);
    }
    
    public List<Professor> FindAll(){
       return professores;
    }
    
    public Professor findById(int id){
       for (Professor professor : professores){
            if (professor. getMatricula()== id){
                return professor;
            }
       }
       return null;
    }
    
    public void update (Professor professor){
       for (Professor prof : professores){
          if (professor.getMatricula() == prof.getMatricula()){
              prof = professor; 
              break;
          }
       }
        
    }
    
    public void delete (Professor professor){
        professores.remove(professor);
    
    }
}


