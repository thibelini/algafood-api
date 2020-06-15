package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class AlteracaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = app.getBean(CadastroCozinha.class);
		
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1l);
		
		cadastroCozinha.remover(cozinha);
		
		List<Cozinha> cozinhas = cadastroCozinha.listar(); 
		
		for (Cozinha coz : cozinhas) {
			System.out.println(coz.getNome());
		}
		
		
	}

}
