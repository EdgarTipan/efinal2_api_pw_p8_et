package uce.edu.web.api.service;

import jakarta.inject.Inject;
import uce.edu.web.api.repository.IPacienteRepo;
import uce.edu.web.api.repository.modelo.Paciente;

public class IPacienteServiceImpl implements IPacienteService{

    @Inject
    private IPacienteRepo pacienteRepo;

    @Override
    public void guardarPaciente(Paciente paciente) {
        this.pacienteRepo.guardar(paciente);
    }

    @Override
    public Paciente buscarPacientePorCedula(Long cedula) {
        Paciente p = this.pacienteRepo.buscar(cedula);
        return p;
    }

}
