package com.mx.gepp.micro1.bo;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroBO implements IBO{

	private static final long serialVersionUID = 1L;

	@Schema(description = "Nombre del catalogo")
	@NotNull (message = "Parametro name puede ser nulo")
	private Integer id;
	
	@Schema(description = "Descripcion del catalogo")
	@NotEmpty(message = "Parametro desc no puede ser vacio")
	@NotNull (message = "Parametro desc puede ser nulo")
	private String desc;
	
	@Schema(description = "Fecha de creación")
	@NotNull (message = "Parametro creado puede ser nulo")
	private Date creado;
	
	@Schema(description = "Fecha de última modificación")
	@NotNull (message = "Parametro modificado puede ser nulo")
	private Date modificado;
	
	@Schema(description = "Estatus de activo")
	@NotNull (message = "Parametro activo puede ser nulo")
	private Boolean activo;	
	
}
