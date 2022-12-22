package com.mx.gepp.micro1.bo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogoBO implements IBO{

	private static final long serialVersionUID = 1L;

	private String name;
	
	private List<RegistroBO> regs;

}
