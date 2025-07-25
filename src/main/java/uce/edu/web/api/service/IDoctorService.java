package uce.edu.web.api.service;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.web.api.repository.modelo.Doctor;

@ApplicationScoped
public interface IDoctorService {
    
    public void guardarDoctor(Doctor doctor);
    public Doctor buscarDoctorPorCedula(Long cedula);

}
