/*
 * Copyright (c) 2021 bran-.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bran- - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.Grupo1.controller;

import ec.edu.espe.distribuidas.Grupo1.dto.PersonaTelefonoRQ;
import ec.edu.espe.distribuidas.Grupo1.service.PersonaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bran-
 */
@RestController
@RequestMapping("/v1/persona/")
public class PersonaController {
    
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    
    @ApiOperation(value = "Lista numero de telefonos por persona",
            notes = "Se obtiene una lista de numeros telefonicos por persona ordenado por el Codigo del Tipo de Numero Telefonico")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Ok - Se encontraron los registros"),
        @ApiResponse(code = 404, message = "Not Found - No se encontro a la Persona")})
    @GetMapping(value = "{codPersona}")
    public ResponseEntity listarNumerosTelefonicosPersona(@PathVariable("codPersona") String codPersona){
        try {
            
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Ok - Se encontraron los registros"),
        @ApiResponse(code = 404, message = "Not Found - No se encontro a la Persona")})
    @PostMapping
    public ResponseEntity agregarNumeroTelefonicoPersona(@RequestBody PersonaTelefonoRQ personaTelefonoRQ){
        try {
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    
}
