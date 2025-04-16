package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for (String candidato : candidatos) {
			entrarEmContato(candidato);
		}
	

	}
	static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuaTentando= !atendeu;
			if (continuaTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");

			}
			
		}while(continuaTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO "+candidato+" NA "+tentativasRealizadas);
		}else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O "+ candidato+ " NÚMERO MÁXIMO DE TENTATIVAS "+tentativasRealizadas+" REALIZADAS.");
		}
		
		
	}
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	static void imprimirSelecionados(List<String> candidatosEscolhidos) {
		for (String nome : candidatosEscolhidos) {
			System.out.println("Candidato escolhido: "+nome);
			
		}
	}
	static void selecionarCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		List<String> selecao = new ArrayList<String>();
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+candidato+" solicitou esse valor de salario "+salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
				selecao.add(candidato);
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		System.out.println("RELAÇÃO DE CANDIDATOS ESCOLHIDOS:");
		imprimirSelecionados(selecao);
	
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO.");
			
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
			
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
			
		}
	}

}
