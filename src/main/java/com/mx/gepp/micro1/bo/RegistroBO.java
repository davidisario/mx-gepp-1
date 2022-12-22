package com.mx.gepp.micro1.bo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroBO implements IBO{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String desc;
	
	private Date creado;
	
	private Date modificado;
	
	private Boolean activo;	
	
}
