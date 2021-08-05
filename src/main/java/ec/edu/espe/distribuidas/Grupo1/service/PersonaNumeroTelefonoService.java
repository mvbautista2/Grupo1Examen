/*
 * Copyright (c) 2021 Diana.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Diana - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.Grupo1.service;

import ec.edu.espe.distribuidas.Grupo1.dao.PersonaNumeroTelefonoRepository;
import ec.edu.espe.distribuidas.Grupo1.dao.PersonaRepository;
import ec.edu.espe.distribuidas.Grupo1.dao.TipoNumeroTelefonoRepository;
import ec.edu.espe.distribuidas.Grupo1.model.PersonaNumeroTelefono;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diana
 */
@Service
public class PersonaNumeroTelefonoService {

    private final PersonaNumeroTelefonoRepository personaNumeroTelefonoRepo;
    private final PersonaRepository personaRepo;
    private final TipoNumeroTelefonoRepository tipoNumeroTelefonoRepository;

    public PersonaNumeroTelefonoService(PersonaNumeroTelefonoRepository personaNumeroTelefonoRepo,
            PersonaRepository personaRepo, TipoNumeroTelefonoRepository tipoNumeroTelefonoRepository) {
        this.personaNumeroTelefonoRepo = personaNumeroTelefonoRepo;
        this.personaRepo = personaRepo;
        this.tipoNumeroTelefonoRepository = tipoNumeroTelefonoRepository;
    }

    
    public List<PersonaNumeroTelefono> listByNumerosTelefonicos(Integer codigoPersona) {
        return this.personaNumeroTelefonoRepo.findByPkCodigoPersonaOrderByCodigoTipoNumeroTelefonoAsc(codigoPersona);
    }
    
    
}
