# Propriedades CSS para JavaFX (Completa)

| Categoria            | Propriedade                  | Descrição                                                                                   | Exemplo                                  |
|----------------------|------------------------------|---------------------------------------------------------------------------------------------|------------------------------------------|
| **Texto**           | `-fx-text-fill`              | Define a cor do texto.                                                                      | `-fx-text-fill: red;`                   |
|                     | `-fx-font-size`              | Define o tamanho da fonte.                                                                 | `-fx-font-size: 16px;`                  |
|                     | `-fx-font-weight`            | Define o peso da fonte (`normal`, `bold`).                                                 | `-fx-font-weight: bold;`                |
|                     | `-fx-font-style`             | Define o estilo da fonte (`normal`, `italic`).                                             | `-fx-font-style: italic;`               |
|                     | `-fx-font-family`            | Define a família da fonte.                                                                 | `-fx-font-family: Arial;`               |
|                     | `-fx-underline`              | Define se o texto terá sublinhado.                                                         | `-fx-underline: true;`                  |
|                     | `-fx-strikethrough`          | Define se o texto terá um risco no meio.                                                   | `-fx-strikethrough: true;`              |
|                     | `-fx-alignment`              | Alinha o texto dentro do controle.                                                        | `-fx-alignment: center;`                |
|                     | `-fx-wrap-text`              | Define se o texto será quebrado em várias linhas.                                          | `-fx-wrap-text: true;`                  |
|                     | `-fx-content-display`        | Controla a exibição de texto e gráficos (`top`, `right`, `bottom`, `left`, `center`).      | `-fx-content-display: left;`            |
| **Bordas**          | `-fx-border-color`           | Define a cor da borda.                                                                     | `-fx-border-color: black;`              |
|                     | `-fx-border-width`           | Define a largura da borda.                                                                 | `-fx-border-width: 2px;`                |
|                     | `-fx-border-style`           | Define o estilo da borda (`solid`, `dashed`, `dotted`, `none`, `hidden`).                  | `-fx-border-style: solid;`              |
|                     | `-fx-border-radius`          | Define o raio das bordas arredondadas.                                                     | `-fx-border-radius: 5px;`               |
|                     | `-fx-border-insets`          | Define o espaçamento entre o conteúdo e a borda.                                           | `-fx-border-insets: 10;`                |
|                     | `-fx-border-image-source`    | Define uma imagem para a borda.                                                           | `-fx-border-image-source: url('img.png');`|
|                     | `-fx-border-image-repeat`    | Define o comportamento da repetição da imagem de borda.                                    | `-fx-border-image-repeat: stretch;`     |
|                     | `-fx-border-image-slice`     | Define como a imagem da borda será cortada.                                                | `-fx-border-image-slice: 10;`           |
| **Fundo**           | `-fx-background-color`       | Define a cor de fundo do controle.                                                        | `-fx-background-color: blue;`           |
|                     | `-fx-background-radius`      | Define o raio do fundo arredondado.                                                       | `-fx-background-radius: 10;`            |
|                     | `-fx-background-image`       | Define uma imagem de fundo.                                                               | `-fx-background-image: url('image.png');`|
|                     | `-fx-background-size`        | Define o tamanho da imagem de fundo.                                                      | `-fx-background-size: cover;`           |
|                     | `-fx-background-position`    | Define o posicionamento da imagem de fundo.                                               | `-fx-background-position: center;`      |
|                     | `-fx-background-repeat`      | Define se a imagem de fundo será repetida (`repeat`, `no-repeat`, `space`, `round`).       | `-fx-background-repeat: no-repeat;`     |
|                     | `-fx-background-insets`      | Define o espaçamento entre o fundo e a borda.                                             | `-fx-background-insets: 5;`             |
| **Espaçamento**     | `-fx-padding`                | Define o espaçamento interno.                                                             | `-fx-padding: 10;`                      |
|                     | `-fx-spacing`                | Define o espaçamento entre filhos de layouts como `VBox` ou `HBox`.                       | `-fx-spacing: 15;`                      |
| **Dimensões**       | `-fx-min-width`              | Define a largura mínima do controle.                                                      | `-fx-min-width: 100px;`                 |
|                     | `-fx-min-height`             | Define a altura mínima do controle.                                                       | `-fx-min-height: 50px;`                 |
|                     | `-fx-pref-width`             | Define a largura preferida do controle.                                                   | `-fx-pref-width: 150px;`                |
|                     | `-fx-pref-height`            | Define a altura preferida do controle.                                                    | `-fx-pref-height: 75px;`                |
|                     | `-fx-max-width`              | Define a largura máxima do controle.                                                      | `-fx-max-width: 300px;`                 |
|                     | `-fx-max-height`             | Define a altura máxima do controle.                                                       | `-fx-max-height: 150px;`                |
| **Sombras**         | `-fx-effect`                 | Adiciona um efeito, como sombra ou brilho.                                                | `-fx-effect: dropshadow(gaussian, black, 10, 0.5, 0, 0);` |
|                     | `-fx-shadow-highlight-color` | Define a cor de destaque para sombras internas.                                           | `-fx-shadow-highlight-color: yellow;`   |
|                     | `-fx-highlight-fill`         | Define a cor de preenchimento ao destacar um item.                                        | `-fx-highlight-fill: green;`            |
| **Cursores**        | `-fx-cursor`                 | Define o cursor quando o mouse está sobre o controle.                                     | `-fx-cursor: hand;`                     |
| **Transições**      | `-fx-transition`             | Define transições animadas para alterações no controle.                                   | `-fx-transition: all 0.3s;`             |
| **Rolagem**         | `-fx-hbar-policy`            | Define a política da barra horizontal (`never`, `always`, `as-needed`).                   | `-fx-hbar-policy: as-needed;`           |
|                     | `-fx-vbar-policy`            | Define a política da barra vertical (`never`, `always`, `as-needed`).                     | `-fx-vbar-policy: as-needed;`           |
| **Outros**          | `-fx-opacity`                | Define a opacidade do controle.                                                           | `-fx-opacity: 0.8;`                     |
|                     | `-fx-scale-x`                | Define o fator de escala no eixo X.                                                       | `-fx-scale-x: 1.5;`                     |
|                     | `-fx-scale-y`                | Define o fator de escala no eixo Y.                                                       | `-fx-scale-y: 1.5;`                     |
|                     | `-fx-rotate`                 | Define a rotação do controle em graus.                                                    | `-fx-rotate: 45;`                       |
|                     | `-fx-translate-x`            | Define o deslocamento no eixo X.                                                          | `-fx-translate-x: 20;`                  |
|                     | `-fx-translate-y`            | Define o deslocamento no eixo Y.                                                          | `-fx-translate-y: 20;`                  |
|                     | `-fx-blend-mode`             | Define o modo de mistura para camadas (`multiply`, `screen`, `overlay`).                  | `-fx-blend-mode: multiply;`             |
