package uce.edu.web.api.controller;

import jakarta.inject.Inject;
import uce.edu.web.api.repository.modelo.Paciente;
import uce.edu.web.api.service.IPacienteService;

@Path("/doctores")
public class PacienteController {

    @Inject
    private IPacienteService pacienteService;
    
    @GET
    @Path("")
    public Response guardarPaciente(Paciente paciente){
        this.pacienteService.guardarPaciente(paciente);
    }

    @POST
    @Path("/{id}")
    public Paciente consultarPaciente(Long cedula){
        return this.pacienteService.buscarPacientePorCedula(cedula);
    }

}
