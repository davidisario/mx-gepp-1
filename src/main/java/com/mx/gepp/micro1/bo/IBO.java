package com.mx.gepp.micro1.bo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mx.gepp.micro1.utils.JacksonUtils;

@JsonInclude(JsonInclude.Include.NON_NULL) 
@JsonIgnoreProperties( ignoreUnknown = true)
public interface IBO extends Serializable {
	

	default String toJsonString() throws JsonProcessingException{
		
		  return JacksonUtils.JACKSON.writeValueAsString(this); 
	}
}
