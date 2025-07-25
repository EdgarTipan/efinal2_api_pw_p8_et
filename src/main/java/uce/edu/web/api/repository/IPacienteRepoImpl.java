package uce.edu.web.api.repository;

import jakarta.persistence.EntityManager;
import uce.edu.web.api.repository.modelo.Paciente;

public class IPacienteRepoImpl implements IPacienteRepo {

    private EntityManager entityManager;

    @Override
    public void guardar(Paciente paciente) {
        this.entityManager.merge(paciente);
    }

    @Override
    public Paciente buscar(Long cedula) {
        Paciente p = this.entityManager.find(Paciente.class, cedula);
        return p;
    }

}
