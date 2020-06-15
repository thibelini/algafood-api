package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class ExclusaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = app.getBean(CadastroCozinha.class);
		
		
		Cozinha cozinha = new Cozinha();
		
		cozinha.setNome("Brazileira");
		cozinha.setId(1l);
		cozinha.setNome("Brazuca");
		
		cadastroCozinha.salvar(cozinha);
		
		List<Cozinha> cozinhas = cadastroCozinha.listar(); 
		
		for (Cozinha coz : cozinhas) {
			System.out.println(coz.getNome());
		}
		
		
	}

}
