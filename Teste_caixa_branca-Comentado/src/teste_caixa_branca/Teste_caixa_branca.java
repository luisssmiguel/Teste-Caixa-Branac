/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_caixa_branca;

/**
 * Classe principal responsável por executar o fluxo de autenticação.
 * 
 * @author alesi
 */
public class Teste_caixa_branca {

    /**
     * Método principal (main) do programa.
     * 
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância da classe User
        User user = new User();

        // Verifica as credenciais do usuário
        boolean autenticado = user.verificarUsuario("joao", "1234");

        // Exibe o resultado da autenticação
        if (autenticado) {
            System.out.println("Usuário autenticado com sucesso! Nome: " + user.nome);
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}