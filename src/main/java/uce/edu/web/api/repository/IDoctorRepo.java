package uce.edu.web.api.repository;

import jakarta.transaction.Transactional;
import uce.edu.web.api.repository.modelo.Doctor;

@Transactional
public interface IDoctorRepo {

    public void guardar(Doctor doctor);
    public Doctor buscar(Long cedula);

}
