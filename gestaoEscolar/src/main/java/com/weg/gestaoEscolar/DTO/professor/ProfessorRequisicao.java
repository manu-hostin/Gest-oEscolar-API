package com.weg.gestaoEscolar.DTO.professor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ProfessorRequisicao (

        @NotBlank (message = "Campo não pode ser nulo")
        String nome,
        @Email (message = "Digite no formato válido") @NotBlank (message = "Campo não pode ser nulo")
        String email,
        @NotBlank (message = "Campo não pode ser nulo")
        String disciplina
){
}
