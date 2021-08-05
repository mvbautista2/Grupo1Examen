/*
 * Copyright (c) 2021 Windows Boo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Windows Boo - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.Grupo1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Data
@Entity
@Table(name = "PER_TIPO_NUMERO_TELEFONO")
public class TipoNumeroTelefono implements Serializable {

    @Id
    @Column(name = "COD_TIPO_NUMERO_TELEFONO", nullable = false, length = 8)
    private String codigo;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "OBSERVACION", nullable = false, length = 4000)
    private String observacion;

    @Column(name = "TIPO", nullable = false, length = 3)
    private String tipo;
}
