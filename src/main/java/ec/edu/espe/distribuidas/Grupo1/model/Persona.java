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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author bran-
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_persona", nullable = false)
    private Integer codigo;

    @Column(name = "cod_empresa", nullable = false, length = 8)
    private Integer empresa;

    @Column(name = "fecha_ingreso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "nombres", nullable = false, length = 250)
    private Integer nombres;

    @Column(name = "nombre1", nullable = false, length = 50)
    private Integer nombre1;

    @Column(name = "nombre2", nullable = false, length = 50)
    private Integer nombre2;

    @Column(name = "apellido1", nullable = false, length = 50)
    private Integer apellido1;

    @Column(name = "apellido2", nullable = false, length = 50)
    private Integer apellido2;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    private List<PersonaNumeroTelefono> numeros;

}
