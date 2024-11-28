/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_caixa_branca;

/**
 *
 * @author alesi
 */
public class Teste_caixa_branca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        boolean autenticado = user.verificarUsuario("joao", "1234");
        if (autenticado) {
            System.out.println("Usuário autenticado com sucesso! Nome: " + user.nome);
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}
