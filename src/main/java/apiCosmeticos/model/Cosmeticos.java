package apiCosmeticos.model;


import java.util.Date;
import java.util.Objects;

import apiCosmeticos.support.AtualizarProdutos;
import apiCosmeticos.support.CadastroProdutos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

    @Entity(name = "cosmeticos")
    @Table(name = "Cosmeticos")
    public class Cosmeticos {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
    private String nome;
    private String marca;
    private String tipo;
    private Date dataCompra;
    private int quantidade;
    private double valor;
	public Cosmeticos(Long id, String nome, String marca, String tipo, Date dataCompra, int quantidade, double valor) {
		
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	
	public Cosmeticos() {
		
	}


	public Cosmeticos(CadastroProdutos produtos) {
		
	this.nome =	produtos.nome();
	this.marca = produtos.marca();
	this.tipo = produtos.tipo();
	this.dataCompra = produtos.dataCompra();
	this.quantidade =produtos.quantidade();
	this.valor = produtos.valor();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


	public void update(@Valid AtualizarProdutos produtos) {
	  if (produtos.nome() != null) {
		  this.nome = produtos.nome();
		  
	  }
		if(produtos.marca() != null) {
		this.marca = produtos.marca();
		}
		if(produtos.tipo() != null) {
		this.tipo = produtos.tipo();
	
		}
		if(produtos.dataCompra() != null) {
		this.dataCompra = produtos.dataCompra();
			
		}
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(dataCompra, id, marca, nome, quantidade, tipo, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cosmeticos other = (Cosmeticos) obj;
		return Objects.equals(dataCompra, other.dataCompra) && Objects.equals(id, other.id)
				&& Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome)
				&& quantidade == other.quantidade && Objects.equals(tipo, other.tipo) && valor == other.valor;
	}

   


}
