package br.edu.cesmac.bancomgr.sistema.operacoesRendimento;

import br.edu.cesmac.bancomgr.business.BusinessController;
import br.edu.cesmac.bancomgr.business.INegocio;

public class RendimentoController implements IRendimentoOps{
	private IRendBReq required;
	
	public RendimentoController(IRendBReq required) {
		this.required = required;
	}

	@Override
	public boolean aplicarRendimento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cobrarJuros() {
		// TODO Auto-generated method stub
		return false;
	}

}
