# CalculadoraJava


Este programa em Java solicita ao usuário que digite 4 notas, armazena essas notas em um array e calcula a média, o menor valor e o maior valor dessas notas.
O programa começa importando a classe Scanner do pacote java.util. Isso permite que o programa solicite entrada do usuário por meio do teclado. Em seguida, a classe exercicio é definida e o método main é declarado.
As variáveis nota1, nota2, nota3 e nota4 são declaradas como floats, e resp é inicializado como 0. A variável med é declarada como um float.
O array nota é declarado e inicializado como um array de floats de tamanho 4.
O loop for é usado para solicitar ao usuário que digite as 4 notas. Cada nota é armazenada em uma posição diferente do array nota usando o índice b.
Em seguida, a média é calculada somando as quatro notas armazenadas no array nota e dividindo por 4. O resultado é armazenado na variável med.
As variáveis menor e maior são inicializadas com o valor da primeira nota no array nota. O programa então verifica se cada uma das outras notas é menor que a nota armazenada em menor ou maior que a nota armazenada em maior. Se uma das notas for menor que a nota armazenada em menor, ela se torna a nova nota menor. Se uma das notas for maior que a nota armazenada em maior, ela se torna a nova nota maior.
Por fim, o programa exibe a média, o menor valor e o maior valor das notas usando o método println da classe System.out.