/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import persistencia.Conexão;

/**
 Parte para testar a conexao
 obs:Perdoe a gente por colocar acento em classe, fizemos em sala e nao percebemos
 * e so depois que notamos que tinha e depois quando tentamos tirar so bugou tudo
 
 */
public class TestarNet {
    public static void main(String[] args) {
        Conexão c = new Conexão();
        c.conecta();
        c.desconecta();
    }
}
