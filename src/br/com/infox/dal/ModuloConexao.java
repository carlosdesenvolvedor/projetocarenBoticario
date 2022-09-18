/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;
import java.sql.*;


public class ModuloConexao {
    //método para conexão com o banco de dados..
    
    public static Connection conector(){
        //variavel para armazenar no momento nulo
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver que importei para biblioteca
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações referente ao banco:
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "123456789";
        
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //a linha de baixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            
            return null;
        }
        
    }
    
}
