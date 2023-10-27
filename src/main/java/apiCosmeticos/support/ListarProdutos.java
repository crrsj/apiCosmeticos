package apiCosmeticos.support;

import java.util.Date;

import apiCosmeticos.model.Cosmeticos;



public record ListarProdutos (
		Long id,
		String nome,	
		String marca,
		String tipo,
		Date dataCompra,
		int quantidade,
		double valor) {

	  public ListarProdutos(Cosmeticos cosmeticos) {
		  this(cosmeticos.getId(),cosmeticos.getNome(),cosmeticos.getMarca(),cosmeticos.getTipo(),cosmeticos.getDataCompra(),cosmeticos.getQuantidade(),cosmeticos.getValor());
	  }
}
