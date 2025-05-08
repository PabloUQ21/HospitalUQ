package co.edu.uniquindio;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Medico medico1 = new Medico(1, "Dr. Pérez", "perez@hospital.com", "Cardiología");
        Paciente paciente1 = new Paciente(101, "Juan López", "juan@correo.com");

        hospital.agregarMedico(medico1);
        hospital.agregarPaciente(paciente1);

        CitaMedica cita = new CitaMedica(LocalDateTime.now(), paciente1, medico1);
        paciente1.solicitarCita(cita);

        medico1.registrarDiagnostico(paciente1, "Hipertensión controlada");

        System.out.println(cita.detallesCita());
        System.out.println("Historial Médico de " + paciente1.nombre + ": " + paciente1.getHistorial().getAntecedentes());
    }
}
