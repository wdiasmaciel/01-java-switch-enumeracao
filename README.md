# 01-java-switch-enumeracao

## Switch e Enumeração

### Tipos Permitidos no switch em Java:

•	Texto e Caracteres: String e char (ou sua classe wrapper Character).

•	Inteiros e Numéricos Primitivos: int, byte, short e long (e suas respectivas classes wrapper Integer, Byte, Short, Long).

•	Enumerações: Tipos enum.

•	Qualquer Tipo de Objeto (nas versões mais recentes): a partir do Java 21, com a introdução definitiva do Pattern Matching for switch, você pode usar qualquer tipo de referência (objeto) para fazer comparações de tipos e padrões.

### O que o switch-case NÃO aceita:

•	boolean (e sua classe wrapper Boolean).

•	float e double (devido a problemas de precisão).
 
### Exemplo com enum e Switch Expression (Seta ->)
O formato moderno usa:

o	A seta (->) em vez de dois pontos (:). 

o	Retorna um valor diretamente (pode ser atribuído a variáveis). 

o	Elimina a necessidade de usar a palavra-chave break. 

o	Garante, em tempo de compilação, que todos os casos do enum foram cobertos.

## Exercícios

1)	Crie o enum NivelAcesso com os valores ADMINISTRADOR, USUARIO e VISITANTE. Escolha um nível e use switch para obter uma mensagem que descreva o que esse nível pode fazer.

Sugestões de mensagens:

- ADMINISTRADOR: "Acesso total"

- USUARIO: "Pode visualizar e editar seus dados"

- VISITANTE: "Pode apenas visualizar"

Ao final, imprima o nivel escolhido e a mensagem. Por exemplo:

VISITANTE: Pode apenas visualizar

2)	Crie o enum TipoFrete com os valores ECONOMICO, EXPRESSO e RETIRADA. Use switch para definir o preço do frete:

- ECONOMICO: R$ 12,50

- EXPRESSO: R$ 25,00

- RETIRADA: R$ 0,00

Escolha um tipo de frete e um valor para o produto. Calcule o total somando o preço do produto ao frete e imprima o tipo escolhido, o valor do frete e o total.

Exemplo para um produto de R$ 100,00 com frete `EXPRESSO`:

Frete: EXPRESSO

Valor do frete: R$ 25,00

Total: R$ 125,00

Formate os valores monetários com duas casas decimais. Leia o tipo de frete do usuário e trate uma opção invalida.


