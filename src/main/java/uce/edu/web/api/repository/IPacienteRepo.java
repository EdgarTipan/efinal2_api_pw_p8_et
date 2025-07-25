package uce.edu.web.api.repository;

import jakarta.transaction.Transactional;
import uce.edu.web.api.repository.modelo.Paciente;

@Transactional
public interface IPacienteRepo {

    public void guardar(Paciente paciente);
    public Paciente buscar(Long cedula);

}
