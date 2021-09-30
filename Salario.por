programa
{
	
	funcao inicio()
	{
		inteiro c,n,s,salarioTotal,salarioExe
		escreva("Escreva o codigo do funcionario: ")
		leia(c)
		escreva("\nEscreva o numero de horas trabalhadas: ")
		leia(n)

		se(n >50){
			s=50*10
			n=n-50
			salarioExe= n*20
			salarioTotal=salarioExe+s
			escreva("\nO salario total:RS ",salarioTotal,"\nSalario Execedente:RS ",salarioExe)
		}
		senao{
			salarioTotal = n*10
			escreva("O seu salario total:RS ",salarioTotal)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 72; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */