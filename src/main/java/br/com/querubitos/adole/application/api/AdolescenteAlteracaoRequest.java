package br.com.querubitos.adole.application.api;

import java.time.LocalDate;

import br.com.querubitos.adole.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;
import lombok.Value;

@Value
public class AdolescenteAlteracaoRequest {

	@NotBlank
	private String nomeAdolescente;
	@NonNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NonNull
	private Sexo sexo;
}
