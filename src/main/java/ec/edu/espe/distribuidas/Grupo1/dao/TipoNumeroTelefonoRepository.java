/*
 * Copyright (c) 2021 valen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    valen - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.Grupo1.dao;

import ec.edu.espe.distribuidas.Grupo1.model.PersonaNumeroTelefono;
import ec.edu.espe.distribuidas.Grupo1.model.TipoNumeroTelefono;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author valen
 */
public interface TipoNumeroTelefonoRepository extends JpaRepository<TipoNumeroTelefono, Integer> {
    
}
