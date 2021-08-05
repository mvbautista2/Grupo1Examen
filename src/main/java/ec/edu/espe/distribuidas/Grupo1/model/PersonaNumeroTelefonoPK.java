/*
 * Copyright (c) 2021 MIQUELY.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    MIQUELY - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.Grupo1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

@Embeddable
@Data
public class PersonaNumeroTelefonoPK implements Serializable{
    
    @Column(name = "COD_PERSONA", nullable = false)
    private Integer codigoPersona;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEC_PERSONA_NUMERO_TELEFONICO", nullable = false)
    private Integer secuenciaPersonaNumeroTelefonico;
    
}
