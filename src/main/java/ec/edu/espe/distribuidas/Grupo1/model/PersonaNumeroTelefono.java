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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PER_PERSONA_NUMERO_TELEFONO")
public class PersonaNumeroTelefono implements Serializable{
    
    @EmbeddedId
    private PersonaNumeroTelefonoPK id;
    
    @Column(name = "COD_TIPO_NUMERO_TELEFONICO", nullable = false, length = 8)
    private String codigoTipoNumeroTelefonico;
    
    @Column(name = "PAIS", nullable = false, length = 30)
    private String pais;
    
    @Column(name = "CODIGO_AREA", nullable = false, length = 8)
    private String codigoArea;
    
    @Column(name = "NUMERO_TELEFONICO", nullable = false, length = 20)
    private String numeroTelefonico;
    
    @JoinColumn(name = "COD_PERSONA", referencedColumnName = "COD_PERSONA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;
    
    @JoinColumn(name = "SEC_PERSONA_NUMERO_TELEFONICO", referencedColumnName = "SEC_PERSONA_NUMERO_TELEFONICO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoNumeroTelefono tipoNumeroTelefono;
}
