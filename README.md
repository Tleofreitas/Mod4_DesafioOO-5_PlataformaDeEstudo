# Projeto Plataforma de Ensino - Capítulo: Herança e Polimorfismo
## Desafio proposto

Você foi contratada(o) para criar um sistema de plataforma de ensino. Para isto você deve criar um programa para ler os dados das aulas de um curso,
e em seguida mostrar a duração total do curso, que é a soma das durações de cada aula.

Cada aula pode ser um conteúdo em vídeo, ou então uma tarefa. Os dados de cada aula são:
* Vídeo: título, url e duração em segundos
* Tarefa: título, descrição e quantidade de questões

A duração (em segundos) de uma aula vídeo é a própria duração do vídeo, e a duração de uma aula tarefa é de cinco minutos por questão (exemplo: se a
tarefa possui 3 questões, então a duração da tarefa é 15 minutos).

Você deve representar os dados conforme modelo abaixo. O método duration() na classe Lesson é um método abstrato que retorna a duração da aula.

![image](https://user-images.githubusercontent.com/88738577/210094185-e6109c83-1374-4382-9668-d108482fbf44.png)

Você deve criar uma única lista do tipo List < Lesson > para armazenar todas aulas. A chamada do método duration() deve ser polimórfica.

---
EXEMPLO: <br>
Quantas aulas tem o curso? 3 <br>

Dados da 1a aula: <br>
Conteúdo ou tarefa (c/t)? c <br>
Título: Orientação a objetos <br>
URL do vídeo: https://youtu.be/aBh <br>
Duração em segundos: 310 <br>

Dados da 2a aula: <br>
Conteúdo ou tarefa (c/t)? c <br>
Título: Listas em Java <br>
URL do vídeo: https://youtu.be/e5a <br>
Duração em segundos: 250 <br>

Dados da 3a aula: <br>
Conteúdo ou tarefa (c/t)? t <br>
Título: Exercício de fixação <br>
Descrição: Faça um programa que imprima uma lista <br>
Quantidade de questões: 2 <br>

*Resultado esperado:* <br>
DURAÇÃO TOTAL DO CURSO = 1160 segundos <br>

---
## *Realizando teste do código localmente* 
O Windows 10 já possui um programa padrão para visualizar arquivos compactados.

Caso seu sistema operacional seja anterior ao Windos 10, realize o passo abaixo:

Para visualizar o projeto você precisará extrair os arquivos através de um programa para arquivos compactados.

Recomendo Winrar, baixe a versão 32x ou 64x, de acordo com seu sistema.

Link para download:
https://www.win-rar.com/download.html

---
## 📦️ *Como Testar o Código*
Para executar este passo, você tera que ter uma IDE instalada em sua máquina. Utilizei o Eclipse.


Siga o passo a passo abaixo:
```bash
  # Clone o repositório
  ❯ Clique no botão Code, depois em Download ZIP e salve o arquivo.

  # Extrair arquivos sem Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione
  Extrair Tudo.
  As informações foram extraídas para a pasta Mod4_DesafioOO-4_Composicoes-main.

  # Extrair arquivos com Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione Extrair Aqui (Extract Here).
  As informações foram extraídas para a pasta Mod4_DesafioOO-4_Composicoes-main.
  
  # Abrir o projeto
  > No Eclipse, clique em *File* e após em *Open Projects from File System...*
  >> Selecione a pasta do projeto e depois clique em *Finish*
  Aguarde a IDE carregar os arquivos e então visualize o código fonte.
  
```

---
## ⚠️ *Erros comuns* ⚠️

No passo *Como Testar o Código*, se não houver a opção *Extrair Tudo*, significa que não há programa instalado para manipulação de arquivos compactados.
Neste cado, seguir com o passo *Realizando teste do código localmente*.

No passo *Abrir o projeto*, após os arquivos serem carregados, pode acontecer de aparecer um X ou um ! vermelho. Caso isso ocorra, tente as soluções deste
tutorial: https://www.youtube.com/watch?v=Je4JWWJcyo0

---
## *Contribuidores* 🔥👊
Este projeto foi desenvolvido durante o curso Formação Desenvolvedor Moderno da escola [@DevSuperior](https://devsuperior.com.br), sobe orientação do tutor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).
