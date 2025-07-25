package uce.edu.web.api.service;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.web.api.repository.modelo.Paciente;

@ApplicationScoped
public interface IPacienteService {

    public void guardarPaciente(Paciente paciente);
    public Paciente buscarPacientePorCedula(Long cedula);

}
