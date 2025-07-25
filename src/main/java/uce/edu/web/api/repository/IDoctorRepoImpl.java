package uce.edu.web.api.repository;

import jakarta.persistence.EntityManager;
import uce.edu.web.api.repository.modelo.Doctor;

public class IDoctorRepoImpl implements IDoctorRepo{

    private EntityManager entityManager;

    @Override
    public void guardar(Doctor doctor) {
        this.entityManager.merge(doctor);
    }

    @Override
    public Doctor buscar(Long cedula) {
        Doctor d = this.entityManager.find(Doctor.class, cedula);
        return d;
    }

}
