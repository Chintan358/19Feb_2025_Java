package com.example.demo.exception;

import com.example.demo.controller.RoleController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobleHandler {

    private final RoleController roleController;

    GlobleHandler(RoleController roleController) {
        this.roleController = roleController;
    }
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<APIResponse> ResourceNotfundHandler(ResourceNotFound e)
	{
		APIResponse response = new APIResponse(e.getMessage(),"false");
		
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}	

}
