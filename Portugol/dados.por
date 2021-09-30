programa
{
	
	funcao inicio()
	{
		inteiro numero[10],x,maior=0,quant=0,y=0
		real media=0.0,soma=0.0
		
		para(x=0;x<10;x++){
		escreva("Escreva os numeros do dado: ")
		leia(numero[x])
		
		enquanto(numero[x]<1 ou numero[x]>6){
			escreva("Numero invalido digite novamente: ")
			leia(numero[x])
		}
		
		soma+=numero[x]
	
		
		se(y<numero[x]){
			y=numero[x]	
		}
		/*se(maior<numero[x]){
			maior=numero[x]
			quant++
		}*/
		}
		para(x=0;x<10;x++){
			se(numero[x]==y){
				quant++
			}
		}
		media = soma/10
		escreva("\nA media dos dados: ",media)
		escreva("\nO numero maior saiu: ",quant)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */