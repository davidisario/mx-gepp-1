package com.mx.gepp.micro1.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> implements IBO {
	
	
	public static final String code_ok = "ok"; 
	
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String message;
	private T objResponse;
}
