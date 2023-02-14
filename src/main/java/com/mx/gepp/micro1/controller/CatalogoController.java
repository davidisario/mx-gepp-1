package com.mx.gepp.micro1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
@Schema(description  = "API de catalogos")
@RequestMapping(value = "/micro1")
public class CatalogoController {

	
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description  = "Successfully execution proccess GEPP ms"),
		@ApiResponse(responseCode = "500", description = "Internal Server Error"),
		@ApiResponse(responseCode = "400", description = "Bad request, filtering vby gateway")
		
   })
	@Operation(description  = "Obtiene todos los elementos de un catalogo")
	@GetMapping(value = "/all-info")
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
	@Operation(description  = "Modifica los elementos de un catalogo")
	public ResponseDTO<Boolean> updateRow(   @PathVariable("idRow")  @NotBlank Integer idRow
											,  @RequestBody RegistroBO reg ) {
		
		return new ResponseDTO<>("OK", "Registro modificado", true );
		
	}
	
	@PutMapping(value = "/row")
	@Operation(description  = "Agrega un elemento a un catalogo")
	public ResponseDTO<Boolean> addRow(  @Valid @RequestBody RegistroBO reg ) {
	
		return new ResponseDTO<>("OK", "Registro agregado", true );
		
	}
	
	@DeleteMapping(value = "/row/{idRow}")
	@Operation(description  = "Borrado logico de un elemento de un catalogo")
	public ResponseDTO<Boolean> deleteRow(   @PathVariable("idRow")  @NotBlank Integer idRow ) {
		
		return new ResponseDTO<>("OK", "Registro borrado", true );
		
	}
}
