package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesDoFilme {
    @JsonProperty("Title") 
	private String titulo;
	
	@JsonProperty("Year")  
	private String ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director") 
	private String diretores;
	
	@JsonProperty("writer")  
	private String escritores;
	
	@JsonProperty("Actors")  
	private String atores;
	
	@JsonProperty("Plot") 
	private String descricao;
	
	@JsonProperty("imdbRating") 
	private Double avaliacao ;
}
