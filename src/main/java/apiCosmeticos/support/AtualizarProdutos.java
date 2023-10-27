package apiCosmeticos.support;

import java.util.Date;

import jakarta.validation.constraints.NotNull;



public record AtualizarProdutos(
	        @NotNull
			Long id,
			String nome,	
			String marca,
			String tipo,
			Date dataCompra,
			int quantidade,
			double valor) {
   
	
	}
 