# Propriedades CSS para JavaFX (Completa)

---

| **Categoria**               | **Propriedade**                 | **Descrição**                                                                 | **Exemplo**                                         |
|-----------------------------|---------------------------------|-------------------------------------------------------------------------------|---------------------------------------------------|
| **Cores e Fundos**          |                                 |                                                                               |                                                   |
|                             | `-fx-background-color`         | Define a cor de fundo do componente.                                         | `-fx-background-color: linear-gradient(to bottom, #fff, #000);` |
|                             | `-fx-background-radius`        | Define o raio das bordas do fundo.                                           | `-fx-background-radius: 10;`                      |
|                             | `-fx-background-insets`        | Define os recuos do fundo em relação ao contorno do componente.              | `-fx-background-insets: 5;`                       |
|                             | `-fx-opacity`                  | Define a opacidade geral do componente.                                      | `-fx-opacity: 0.5;`                               |
| **Espaçamento e Margens**   |                                 |                                                                               |                                                   |
|                             | `-fx-padding`                  | Define o preenchimento interno do componente.                                | `-fx-padding: 10;`                                |
|                             | `-fx-margin`                   | Define o espaço externo ao redor do componente (em layouts).                 | `-fx-margin: 5;`                                  |
| **Fontes e Textos**         |                                 |                                                                               |                                                   |
|                             | `-fx-font`                     | Define o estilo completo da fonte (tamanho, família, peso).                  | `-fx-font: bold 14px Arial;`                      |
|                             | `-fx-font-smoothing-type`      | Define o tipo de suavização de fonte (grayscale ou lcd).                     | `-fx-font-smoothing-type: lcd;`                   |
|                             | `-fx-text-fill`                | Define a cor do texto.                                                       | `-fx-text-fill: red;`                             |
|                             | `-fx-underline`                | Define se o texto será sublinhado.                                           | `-fx-underline: true;`                            |
| **Bordas e Contornos**      |                                 |                                                                               |                                                   |
|                             | `-fx-border-color`             | Define a cor da borda.                                                       | `-fx-border-color: black;`                        |
|                             | `-fx-border-width`             | Define a largura da borda.                                                   | `-fx-border-width: 2;`                            |
|                             | `-fx-border-radius`            | Define o raio das bordas arredondadas.                                       | `-fx-border-radius: 5;`                           |
|                             | `-fx-border-style`             | Define o estilo da borda (solid, dashed, dotted, etc.).                      | `-fx-border-style: dashed;`                       |
| **Dimensões e Layout**      |                                 |                                                                               |                                                   |
|                             | `-fx-min-width`                | Define a largura mínima do componente.                                       | `-fx-min-width: 100;`                             |
|                             | `-fx-max-height`               | Define a altura máxima do componente.                                        | `-fx-max-height: 300;`                            |
|                             | `-fx-alignment`                | Define o alinhamento do conteúdo do componente.                              | `-fx-alignment: center;`                          |
| **Imagens e Gradientes**    |                                 |                                                                               |                                                   |
|                             | `-fx-background-image`         | Define uma ou mais imagens de fundo.                                         | `-fx-background-image: url('image.png');`         |
|                             | `-fx-background-size`          | Define o tamanho das imagens de fundo.                                       | `-fx-background-size: cover;`                    |
|                             | `-fx-background-position`      | Define a posição das imagens de fundo.                                       | `-fx-background-position: center;`               |
| **Efeitos Visuais**         |                                 |                                                                               |                                                   |
|                             | `-fx-effect`                   | Define um efeito visual (sombra, desfoque, etc.).                            | `-fx-effect: dropshadow(gaussian, black, 10, 0, 5, 5);` |
|                             | `-fx-blend-mode`               | Define o modo de mistura do componente com o fundo.                          | `-fx-blend-mode: multiply;`                       |
| **Transições e Animações**  |                                 |                                                                               |                                                   |
|                             | `-fx-transition-duration`      | Define a duração da transição (usada em pseudo-classes).                     | `-fx-transition-duration: 300ms;`                |
|                             | `-fx-transition-delay`         | Define o atraso antes da transição.                                          | `-fx-transition-delay: 100ms;`                   |
|                             | `-fx-transition-timing-function`| Define a curva de animação (ease, linear, etc.).                             | `-fx-transition-timing-function: ease-in-out;`    |
| **Controle Específico**     |                                 |                                                                               |                                                   |
|                             | `-fx-indeterminate-bar`        | Estiliza a barra indeterminada de progresso.                                 | `-fx-indeterminate-bar: yellow;`                 |
|                             | `-fx-tick-label-fill`          | Define a cor dos rótulos de marcação em Sliders.                             | `-fx-tick-label-fill: green;`                     |
|                             | `-fx-cell-size`                | Define a altura das células em ListView ou TableView.                        | `-fx-cell-size: 30;`                              |
| **Controle de Botões**      |                                   |                                                                               |                                                    |
|                             | `-fx-button-type`                | Define o tipo do botão (normal, flat, etc.).                                  | `-fx-button-type: flat;`                           |
|                             | `-fx-default-button`             | Define se o botão é o padrão na cena.                                         | `-fx-default-button: true;`                        |
| **Scroll e Barras**         |                                   |                                                                               |                                                    |
|                             | `-fx-unit-increment`             | Define o incremento por unidade ao rolar.                                     | `-fx-unit-increment: 10;`                          |
|                             | `-fx-block-increment`            | Define o incremento por bloco ao rolar.                                       | `-fx-block-increment: 50;`                         |
|                             | `-fx-hbar-policy`                | Define a visibilidade da barra de rolagem horizontal (always, never, etc.).   | `-fx-hbar-policy: never;`                          |
|                             | `-fx-vbar-policy`                | Define a visibilidade da barra de rolagem vertical.                           | `-fx-vbar-policy: always;`                         |
| **Barras de Progresso**     |                                   |                                                                               |                                                    |
|                             | `-fx-progress-color`             | Define a cor da barra de progresso.                                           | `-fx-progress-color: blue;`                        |
|                             | `-fx-indeterminate-segment`      | Define o número de segmentos na barra indeterminada.                          | `-fx-indeterminate-segment: 10;`                   |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Pseudoclasses Específicas**|                                   |                                                                               |                                                    |
|                             | `:focused`                       | Define o estilo quando o componente está focado.                              | `.button:focused { -fx-background-color: yellow; }`|
|                             | `:hover`                         | Define o estilo ao passar o mouse sobre o componente.                         | `.button:hover { -fx-text-fill: blue; }`           |
|                             | `:pressed`                       | Define o estilo ao clicar no componente.                                      | `.button:pressed { -fx-background-color: red; }`   |
| **Sliders e Controle de Volume** |                             |                                                                               |                                                    |
|                             | `-fx-thumb-color`                | Define a cor do "thumb" (botão deslizante).                                   | `-fx-thumb-color: green;`                          |
|                             | `-fx-track-color`                | Define a cor da trilha do slider.                                             | `-fx-track-color: gray;`                           |
| **Tooltips**                |                                   |                                                                               |                                                    |
|                             | `-fx-tooltip-background-color`   | Define a cor de fundo do tooltip.                                             | `-fx-tooltip-background-color: #333;`              |
|                             | `-fx-tooltip-text-fill`          | Define a cor do texto do tooltip.                                             | `-fx-tooltip-text-fill: white;`                    |
| **Menus e Contextos**       |                                   |                                                                               |                                                    |
|                             | `-fx-menu-bar-background`        | Define a cor de fundo da barra de menu.                                       | `-fx-menu-bar-background: lightblue;`             |
|                             | `-fx-menu-item-hover`            | Define o estilo do item de menu ao passar o mouse.                            | `-fx-menu-item-hover: lightgray;`                 |
|                             | `-fx-menu-bar-border`            | Define a borda da barra de menu.                                              | `-fx-menu-bar-border: solid black 2px;`           |
| **Gráficos e Grids**        |                                   |                                                                               |                                                    |
|                             | `-fx-grid-lines-visible`         | Define a visibilidade das linhas de grade.                                    | `-fx-grid-lines-visible: true;`                   |
|                             | `-fx-chart-plot-background-color`| Define a cor de fundo do gráfico de plotagem.                                 | `-fx-chart-plot-background-color: beige;`         |
| **Miscellaneous**           |                                   |                                                                               |                                                    |
|                             | `-fx-focus-color`                | Define a cor do foco em controles.                                            | `-fx-focus-color: blue;`                           |
|                             | `-fx-highlight-fill`             | Define a cor de preenchimento ao selecionar texto.                            | `-fx-highlight-fill: yellow;`                     |
|                             | `-fx-cursor`                     | Define o cursor do mouse sobre o componente.                                  | `-fx-cursor: hand;`                                |

---

Essas propriedades são complementares às da tabela anterior, cobrindo funcionalidades adicionais para customizar ainda mais os componentes do JavaFX. Se houver algo específico que você queira detalhar ou explorar, posso ajudar!

---
