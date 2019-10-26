package dao;
import modelo.*;
import modelo.Usuario;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno07
 */
public class Dao {
    Usuario u1 = new Usuario();
//    esta classe terá método cadastrar e método login
//    e checará se a senha cadastrada é muito curta ou muito longa
    public String cadastrar(String email,String senha,String senhaRepetida){
    if (senha.length() != senhaRepetida.length())
        return ("Senhas diferentes");
    else if(senha.length()< 6 )
        return("A senha deve ter pelo menos 6 dígitos!");
    else {
        u1.setEmail(email);
        u1.setSenha(senha);
        return("Cadastro realizado com sucesso");
    }
}
    public String login(String email, String senha){
        if(email.contentEquals(u1.getEmail()) && senha.contentEquals(u1.getSenha()))
            return ("Login realizado com sucesso");
        else
            return("Login não cadastrado!");
    }
}
