<h1 align="center"> Desafio plataforma DIO </h1>
<h2 align="center"> Criando Um Pequeno Sistema Para Validação de Processo Seletivo </h2>

## Introdução
- Desafio do curso Santander 2024 - Backend com Java da [DIO](www.dio.me) ministrado pelo instrutor [Gleyson Sampaio](https://github.com/glysns).
  
## Controle de Fluxo - Contador

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   


1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema. 

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham `??`

```java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```


---
## Processo Seletivo

O desafio demonstrado nos vídeos da plataforma da DIO mostravam a resolução deste desafio, que vem [deste link](https://glysns.gitbook.io/java-basico/controle-de-fluxo/cases). Assim, vou tentar resolvê-lo com o mínimo de intervenção dos vídeos ou de consulta à solução apresentada pelo instrutor. O desafio é:

1.  A partir de uma lista de nomes de candidatos, o programa deve enviar mensagem informando se o RH deve ou não ligar para cada um deles, baseado no valor de salário de uma vaga para a qual se aplicaram:
    * Se o valor salário base (`2000.0`), for maior que valor salário pretentido, imprima : "LIGAR PARA O CANDIDATO";
    * Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : "LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA";
    * Senão imprima: "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS".
```java
// Método nativo oferecido para gera valor aleatório.
import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
```

<br>

2.  Selecionar de uma lista apenas 5 candidados, baseado no retorno do item 1.
```java
// Array com a lista de candidatos
String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
```

<br>

3.  Imprimir a lista dos candidados selecionados para os quais o RH deverá ligar.

<br>

4.  Criar um método que simule as ligações (devendo ser feitas 3 tentativas):
* Caso o candidato atenda a ligação, o sistema deve imprimir: "CONSEGUIMOS CONTATO COM `[CANDIDATO]` APÓS `[TENTATIVA]` TENTATIVA(S)";
* Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O(A) CANDIDATO(A) `[CANDIDATO]`".

---
