programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real nota1,nota2,nota3,media

		escreva("\nDigite a primeira nota: ")
		leia(nota1)
		escreva("\nDigite a segunda nota: ")
		leia(nota2)
		escreva("\nDigite terceira nota: ")
		leia(nota3)

		media=(nota1+nota2+nota3)/3

		escreva("\nSua media é: ", math.arredondar(media,2),"\n")

		se (media >=7.0 e media<= 10){
			escreva("\nO alune foi a provade\n")
		}
		senao se(media>=5.0 e media<7.0){
			escreva("\nO alune esta de exame\n")
			
		}
		senao se(media>=0 e media<5.0){
			escreva("\nO alune não foi aprovade\n")
		}
		senao{
			escreva("\nMedia fora dos parametros\n")
		}
		/*se (media <= 5){
			escreva("\nO aluno não foi não foi aprovado\n")
		}
		senao{
			escreva("\nO aluno foi a aprovado\n")
		}*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */