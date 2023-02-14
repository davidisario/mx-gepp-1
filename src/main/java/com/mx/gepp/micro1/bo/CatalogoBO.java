package com.mx.gepp.micro1.bo;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogoBO implements IBO{

	private static final long serialVersionUID = 1L;
	@Schema(description = "Nombre del catalogo")
	@NotEmpty(message = "Parametro name no puede ser vacio")
	@NotNull (message = "Parametro name puede ser nulo")
	private String name;
	
	private List<RegistroBO> regs;

}
