package uce.edu.web.api.service;

import jakarta.inject.Inject;
import uce.edu.web.api.repository.IDoctorRepo;
import uce.edu.web.api.repository.modelo.Doctor;

public class IDoctorServiceImpl implements IDoctorService{

    @Inject
    private IDoctorRepo doctorRepo;

    @Override
    public void guardarDoctor(Doctor doctor) {
        this.doctorRepo.guardar(doctor);
    }

    @Override
    public Doctor buscarDoctorPorCedula(Long cedula) {
        Doctor d = this.doctorRepo.buscar(cedula);
        return d;
    }

}
