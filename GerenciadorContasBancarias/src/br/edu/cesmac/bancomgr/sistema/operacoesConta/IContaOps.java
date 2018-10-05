package br.edu.cesmac.bancomgr.sistema.operacoesConta;

import br.edu.cesmac.bancomgr.sharedmodel.Corrente;
import br.edu.cesmac.bancomgr.sharedmodel.Poupanca;

public interface IContaOps {
	
	public Poupanca criarContaPoupanca(int numero, int senha, int diaAniversario, float taxaRendimento);
	public Corrente criarContaCorrente(int numero, int senha, float limite, float taxaJuros);
	public boolean desativarConta(int numero);
	public boolean ativarConta(int numero);
}
