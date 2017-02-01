# buscape-exame
Projeto criado para avaliação técnica profissional.

PROBLEMA:

Uma equipe de cientista está explorando a fossa das Marianas e para isso utiliza submarinos não tripulados. Os cientistas já mapearam a área a ser explorada e a dividiram em três eixos: X, Y e Z. Esses eixos controlam o posicionamento e profundidade do submarino.

A posição do submarino é representado pela notação (0, 0, 0, NORTE) que indica os pontos X, Y, Z e a direção que o submarino aponta (Norte, Sul, Leste e Oeste).

Os cientistas utilizam uma serie comandos simples para fazer a movimentação do submarino: L, R, para girar o submarino para esquerda ou direita, M para mover o submarino e U e D para subir ou descer o submarino.

Você deve desenvolver um sistema que processe uma série de comandos e faça a navegação desse submarino.

Para simplificar, leve em consideração que o submarino sempre começará no ponto (0, 0, 0, NORTE) e que todo movimento quando o submarino estiver apontada para o NORTE, somará 1 ao eixo Y, todo movimento quando o submarino estiver apontada para o LESTE somará 1 ao eixo X e todo movimento para baixo diminuirá 1 do eixo Z. Ah, vale lembrar que 0 no eixo Z é a superfície do oceano

COMO INSTALAR E EXECUTAR O PROJETO:

- Faça git clone do projeto.
- Dentro da IDE selecione o menu File > Import > Existing Maven Projects.
- Selecione a pasta do projeto e o arquivo pom.xml.
- Clique no projeto dentro da IDE e selecione a opção Maven > Update Project.
- Execute o método main da classe br.com.buscape.exame.test.SubmarinoTeste.
