package apiCosmeticos.support;

import java.util.Date;
import jakarta.validation.constraints.NotBlank;

public record CadastroProdutos(
		@NotBlank
		String nome,
		@NotBlank
		String marca,
		String tipo,
		Date dataCompra,
		int quantidade,
		double valor) {

	
}
