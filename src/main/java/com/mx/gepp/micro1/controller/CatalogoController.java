package com.mx.gepp.micro1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.gepp.micro1.bo.CatalogoBO;
import com.mx.gepp.micro1.bo.RegistroBO;
import com.mx.gepp.micro1.bo.ResponseDTO;

import io.swagger.annotations.Api;

@RestController
@Api(value = "1.0 Micro1  ")
@RequestMapping(value = "/micro1")
public class CatalogoController {

	
	
	@GetMapping(value = "")
	public ResponseDTO<CatalogoBO> getAll(  ) {
		
		CatalogoBO catalogo = new CatalogoBO();
		RegistroBO reg1 = new RegistroBO(1,"Abarrotes lupita" , new Date(), new Date(), true );
		RegistroBO reg2 = new RegistroBO(2,"Miscelanea Metepec" , new Date(), new Date(), true );
		List<RegistroBO> regs = new ArrayList<>();
		regs.add(reg1);
		regs.add(reg2);
		catalogo.setName("tiendas");
		catalogo.setRegs(regs);
		return new ResponseDTO<>("OK", "Registros encontrados 2", catalogo );
		
	}
	
	@PostMapping(value = "/row/{idRow}")
	public ResponseDTO<Boolean> updateRow(   @PathVariable("idRow")  @NotBlank Integer idRow
											,  @RequestBody RegistroBO reg ) {
		
		return new ResponseDTO<>("OK", "Registro modificado", true );
		
	}
	
	@PutMapping(value = "/row")
	public ResponseDTO<Boolean> addRow(   @RequestBody RegistroBO reg ) {
	
		return new ResponseDTO<>("OK", "Registro agregado", true );
		
	}
	
	@DeleteMapping(value = "/row/{idRow}")
	public ResponseDTO<Boolean> deleteRow(   @PathVariable("idRow")  @NotBlank Integer idRow ) {
		
		return new ResponseDTO<>("OK", "Registro borrado", true );
		
	}
}
