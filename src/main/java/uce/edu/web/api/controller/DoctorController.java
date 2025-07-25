package uce.edu.web.api.controller;

import jakarta.inject.Inject;
import uce.edu.web.api.repository.modelo.Doctor;
import uce.edu.web.api.service.IDoctorService;

@
public class DoctorController {

    @Inject
    private IDoctorService doctorService;

    @GET
    @Path("")
    public void guardarDoctor(Doctor doctor) {
        this.doctorService.guardarDoctor(doctor);
    }

    @POST
    @Path("/{id}")
    public Doctor consultarDoctor(Long cedula) {
        return this.doctorService.buscarDoctorPorCedula(cedula);
    }

}
