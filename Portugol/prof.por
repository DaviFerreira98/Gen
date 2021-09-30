programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade =29,a,b
		real altura,nota1,nota2,nota3,media

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("\nDigite sua altura: ")
		leia(altura)
		escreva("\nDigite a nota 1: ")
		leia(nota1)
		escreva("\nDigite a nota 2: ")
		leia(nota2)
		escreva("\nDigite a nota 3: ")
		leia(nota3)
		escreva("\nDigite a: ")
		leia(a)
		escreva("\nDigite b: ")
		leia(b)
		media=(nota1+nota2+nota3) / 3
		escreva("Nome: ",nome," Idade: ", idade, " e a Altura: ", altura)
		escreva("\nSua Media: ",mat.arredondar(media,2))
		nota1 = mat.raiz(nota2, 2.0)
		nota2 = mat.raiz(nota3, 3.0)
		nota3= a % b
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */