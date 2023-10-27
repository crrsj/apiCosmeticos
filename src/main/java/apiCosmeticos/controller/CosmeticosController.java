package apiCosmeticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiCosmeticos.model.Cosmeticos;
import apiCosmeticos.repository.CosmeticosRepository;
import apiCosmeticos.support.AtualizarProdutos;
import apiCosmeticos.support.CadastroProdutos;
import apiCosmeticos.support.ListarProdutos;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;


    @RestController
    @RequestMapping("/cosmeticos")
    public class CosmeticosController { 
	
	@Autowired
	private CosmeticosRepository cosmeticosRepository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid  CadastroProdutos produtos) {
		cosmeticosRepository.save(new Cosmeticos(produtos));
	}
	
	@GetMapping
	public List<ListarProdutos>listar(){
	return	cosmeticosRepository.findAll().stream().map(ListarProdutos::new).toList();
		
	}
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid AtualizarProdutos produtos) {
		var cosmetico = cosmeticosRepository.getReferenceById(produtos.id());
		cosmetico.update(produtos);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
    public void delete(@PathVariable Long id) {
		cosmeticosRepository.deleteById(id);
	}

}