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
package ec.edu.espe.distribuidas.Grupo1.dto;

import lombok.Data;

/**
 *
 * @author bran-
 */
@Data
public class PersonaTelefonoRQ {
    
    private Integer codPersona;
    private Integer codTipo;
    private String pais;
    private String codigoArea;
    private String numeroTelefonico;
}
