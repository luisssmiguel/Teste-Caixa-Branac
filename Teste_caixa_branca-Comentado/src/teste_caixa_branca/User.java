/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste_caixa_branca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe responsável por gerenciar a autenticação de usuários
 * e a conexão ao banco de dados.
 * 
 * @author alesi
 */
public class User {

    // Variáveis de classe
    /**
     * Nome do usuário autenticado.
     */
    public String nome = "";

    /**
     * Resultado da verificação de autenticação (true ou false).
     */
    public boolean result = false;

    /**
     * Método responsável por estabelecer a conexão com o banco de dados.
     * 
     * @return Objeto Connection se a conexão for bem-sucedida, caso contrário, retorna null.
     */
    public Connection conectarBD() {
        Connection conexao = null;

        // Parâmetros de conexão
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "Anjo100%";

        try {
            // Carregando o driver do banco
            Class.forName(driver);

            // Estabelecendo a conexão
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }

    /**
     * Método responsável por verificar as credenciais de login e senha de um usuário.
     * 
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @return true se o usuário for autenticado, caso contrário false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "SELECT nome FROM usuarios WHERE login = '" + login + "' AND senha = '" + senha + "'";
        
        // Tentativa de conexão e execução da consulta
        try (Connection conn = conectarBD();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            // Verifica se o usuário foi encontrado
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar a consulta: " + e.getMessage());
        }
        return result;
    }
}

