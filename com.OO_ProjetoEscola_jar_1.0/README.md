# Projeto Escola — Padrão MVC (Aluno, Professor, Disciplina)

Projeto convertido para o padrão arquitetural **MVC**, seguindo o mesmo
modelo usado no `ProjCadProduto-mvc` (aula prática), aplicado agora às
três entidades do domínio escolar: **Aluno**, **Professor** e
**Disciplina**.

## Como executar

```
mvn clean compile exec:java
```

ou importe como projeto Maven no NetBeans/IntelliJ/Eclipse e rode a
classe `com.oo.projetoescola.ProjetoEscola`.

Ao abrir, a tela principal (`FrMenuPrincipal`) apresenta três botões
que abrem, cada um, uma janela de cadastro (`JDialog` modal) para
Aluno, Professor e Disciplina. Cada cadastro é independente e completo
(Novo / Editar / Salvar / Cancelar / Excluir + tabela).

## Arquitetura (camadas)

```
com.oo.projetoescola
 ├── ProjetoEscola.java            -> ponto de entrada (main)
 ├── connection/
 │    └── SQLiteConnector.java     -> abre a conexão única e cria as 3 tabelas
 ├── controller/                   -> Controller (MVC)
 │    ├── AlunoController.java
 │    ├── ProfessorController.java
 │    └── DisciplinaController.java
 ├── gui/                          -> View (MVC)
 │    ├── FrMenuPrincipal.java     -> JFrame principal (hub)
 │    ├── DlgAluno.java            -> JDialog de cadastro de Aluno
 │    ├── DlgProfessor.java        -> JDialog de cadastro de Professor
 │    ├── DlgDisciplina.java       -> JDialog de cadastro de Disciplina
 │    └── tableModel/              -> Abstract Table Model de cada grade
 │         ├── TMCadAluno.java
 │         ├── TMCadProfessor.java
 │         └── TMCadDisciplina.java
 └── model/                        -> Model (MVC)
      ├── entities/                -> Aluno, Professor, Disciplina
      ├── exceptions/              -> Exceptions de validação por entidade
      ├── valid/                   -> Regras de validação por entidade
      ├── dao/                     -> Inversão de Dependência (D.I.)
      │    ├── IDao.java           -> contrato genérico (save/update/delete/find/findAll)
      │    ├── AlunoDAOBanco.java  / AlunoDAOFile.java
      │    ├── ProfessorDAOBanco.java / ProfessorDAOFile.java
      │    └── DisciplinaDAOBanco.java / DisciplinaDAOFile.java
      └── file/                    -> Serialização em arquivo
           ├── ISerializador.java  -> contrato genérico
           ├── FilePersistence.java-> leitura/escrita bruta de arquivo
           ├── SerializadorCSV*.java
           ├── SerializadorJSON*.java
           └── SerializadorXML*.java
```

## Decisões de projeto

- **Inversão de Dependência (D.I.):** o `Controller` de cada entidade
  depende apenas da interface `IDao<T>`, nunca de uma implementação
  concreta. A implementação (`*DAOBanco` ou `*DAOFile`) é *injetada*
  pelo construtor — hoje a `View` injeta sempre a implementação de
  banco (`*DAOBanco`), mas basta trocar a linha de instância para
  usar persistência em arquivo (CSV, JSON ou XML), sem alterar
  Controller, Model ou View.
- **`IDao<T>` e `ISerializador<T>` genéricos:** como agora existem três
  entidades (e não apenas uma, como no exemplo de Produto), as
  interfaces de D.I. foram generalizadas com *generics* para evitar
  repetir o mesmo contrato três vezes — o princípio (D.I. via
  interface) é exatamente o mesmo do modelo original.
- **Banco de dados:** SQLite, com uma única conexão (`SQLiteConnector`)
  compartilhada pelos três cadastros, criando as tabelas `aluno`,
  `professor` e `disciplina` automaticamente na primeira execução.
- **JFrame + JDialog:** `FrMenuPrincipal` é o `JFrame` principal; cada
  tela de cadastro é um `JDialog` modal, aberto a partir do menu.
- **AbstractTableModel:** cada grade (`JTable`) usa um Table Model
  próprio (`TMCadAluno`, `TMCadProfessor`, `TMCadDisciplina`), que
  adapta a `List<T>` retornada pelo Controller para exibição, sem
  expor a estrutura da entidade à View.
- **Exceptions e Validação:** cada entidade possui sua própria
  exceção de negócio (`AlunoException`, `ProfessorException`,
  `DisciplinaException`) lançada pela respectiva classe de validação
  (`ValidacaoAluno`, `ValidacaoProfessor`, `ValidacaoDisciplina`)
  quando os dados vindos da tela são inválidos. A `View` captura essas
  exceções e exibe a mensagem via `JOptionPane`.

## Entidades

| Entidade   | Campos                                                        | Chave        |
|------------|----------------------------------------------------------------|--------------|
| Aluno      | matrícula, nome, curso, idade                                  | matrícula    |
| Professor  | código, nome, especialização, carga horária                    | código       |
| Disciplina | código, nome, carga horária, professor responsável             | código       |
