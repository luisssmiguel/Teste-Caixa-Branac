## Etapa 3: Critérios de Caixa Branca

### Grafo de Fluxo
- **Nodos**:
  1. Início do método `main`.
  2. Chamada ao método `verificarUsuario`.
  3. Conexão ao banco (`conectarBD`).
  4. Execução da consulta SQL.
  5. Condição: Verificação de `rs.next()`.
  6. Caminho verdadeiro: Usuário autenticado.
  7. Caminho falso: Falha na autenticação.
  8. Final do método `main`.

- **Arestas**:
  - 1 → 2
  - 2 → 3
  - 3 → 4
  - 4 → 5
  - 5 → 6
  - 5 → 7
  - 6 → 8
  - 7 → 8

## Grafo de Fluxo do Código
![Grafo](https://github.com/user-attachments/assets/cdd43269-b631-48d1-9a84-7f74effbf14b)


### Complexidade Ciclomática
A complexidade ciclomática foi calculada como:
\[
M = E - N + 2P
\]
- **E** (arestas): 8.
- **N** (nodos): 8.
- **P** (componentes conectados): 1.

**Resultado**: M = 2.

### Base de Caminhos
1. **Caminho 1** (Usuário autenticado):
   - Nodos: 1 → 2 → 3 → 4 → 5 → 6 → 8.
2. **Caminho 2** (Falha na autenticação):
   - Nodos: 1 → 2 → 3 → 4 → 5 → 7 → 8.
