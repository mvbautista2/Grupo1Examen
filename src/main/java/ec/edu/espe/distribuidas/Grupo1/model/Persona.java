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
package ec.edu.espe.distribuidas.Grupo1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PER_PERSONA")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PERSONA", nullable = false)
    private Integer codigo;

    @Column(name = "COD_EMPRESA", nullable = false, length = 8)
    private String empresa;

    @Column(name = "FECHA_INGRESO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "NOMBRES", nullable = false, length = 250)
    private String nombres;

    @Column(name = "NOMBRE1", nullable = false, length = 50)
    private String nombre1;

    @Column(name = "NOMBRE2", nullable = false, length = 50)
    private String nombre2;

    @Column(name = "APELLIDO1", nullable = false, length = 50)
    private String apellido1;

    @Column(name = "APELLIDO2", nullable = false, length = 50)
    private String apellido2;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "PER_PERSONA")    
    private List<PersonaNumeroTelefono> numerosDeTelefono;

}
