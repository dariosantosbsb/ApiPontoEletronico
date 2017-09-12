package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * retorna empresa por cnpj
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	

	/**
	 * cadastra uma nova empresa na base de dados
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

}
