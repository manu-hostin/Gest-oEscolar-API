package com.weg.gestaoEscolar.DTO.aluno;

import jakarta.validation.constraints.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;

public record AlunoRequisicao (

        @PositiveOrZero (message = "Deve ser 0 ou nula") @NotNull (message = "Matrícula não pode ser nula")
        int matricula,

        @NotBlank (message = "Nome não pode ser nulo")
        String nome,
        @NotBlank (message = "Email não pode ser nulo") @Email (message = "Deve ser feito no formato de email")
        String email,
        @NotNull (message = "Data não pode ser nula") @Past (message = "Nascimento não pode ser futura")
        LocalDate nascimento

) {}

