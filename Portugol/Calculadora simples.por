programa
{
	
	funcao inicio()
	{
		real a,b,res
		inteiro op
		caracter simbolo
		escreva("Digite o numero a: ")
		leia(a)
		escreva("\t\tescolha a operação \n+ para soma,\n- para subtração,\n* para multiplicação,\n/ para divisão : \n")
		leia(simbolo)
		escreva("digite o numero b: ")
		leia(b)

		escolha(simbolo){
			caso '+':
			res = a +b
			escreva("Resultado",res)
			pare
			
			caso '-':
			res = a - b
			escreva("Resultado",res)
			pare

			caso '*':
			res = a*b
			escreva("Resultado",res)
			pare

			caso '/':
			se(b==0)
			{
				escreva("\nNão podemos fazer divisão por 0")
			}
			senao{
			res = a/b
			escreva("Resultado",res)
			}
			pare

			caso contrario:
			escreva("Opção invalida")
		}

	
		
/*
		se(op == 1){
			soma=a+b
			escreva("Resultado: ",soma)
		}
		senao se(op == 2){
			sub=a-b
			escreva("Resultado: ",sub)
			
		}
		senao se(op ==3){
		mult= a*b
		escreva("Resultado: ",mult)
	}
		senao se(op == 4){
			div = a/b
			escreva("Resultado: ", div)
		}
		senao{
			escreva("Esta Operação não existe")
		}*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */