# Erros Encontrados no Projeto TesteCaixaBranca

## Descrição do Projeto
Este projeto tem como objetivo testar a conexão com um banco de dados MySQL utilizando Java. Durante o desenvolvimento, alguns erros foram encontrados e corrigidos. Segue abaixo uma descrição detalhada:

---

## Erros Encontrados

### 1. *Erro ao Conectar ao Banco de Dados*
*Mensagem:* Erro ao conectar ao banco: com.mysql.cj.jdbc.Driver

*Causa:* O driver MySQL não estava incluído no classpath.

*Solução:* 
- Adicionar o arquivo mysql-connector-j-9.1.0.jar na pasta lib.
- Configurar o classpath corretamente ao compilar e executar o projeto.

---

### 2. *Erro de Credenciais no Banco*
*Mensagem:* Conexão com o banco falhou. Falha na autenticação.

*Causa:* O usuário ou a senha estavam configurados de forma incorreta no arquivo Java.

*Solução:* Verificar e corrigir as credenciais usadas no método DriverManager.getConnection.

---

### 3. *Erro no Comando de Compilação*
*Mensagem:* javac: no source files

*Causa:* O comando para compilar os arquivos Java estava errado.

*Solução:* Usar o comando correto:
```bash
javac -cp .;lib/mysql-connector-j-9.1.0.jar login/src/*.java

---

Aba de caixa branca preenchida na planilha: [PLANO DE TESTE-1.xlsx](https://github.com/user-attachments/files/17969261/PLANO.DE.TESTE-1.xlsx)

