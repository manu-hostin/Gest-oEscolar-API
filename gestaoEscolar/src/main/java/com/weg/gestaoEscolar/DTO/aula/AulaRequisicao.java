package com.weg.gestaoEscolar.DTO.aula;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record AulaRequisicao (

        @NotNull (message = "Campo não pode ser nulo") @PositiveOrZero (message = "Id da turma deve ser 0 ou positivo")
        int turmaID,

        @Past (message = "A aula já deve ter ocorrido") @NotNull (message = "Data não pode ser nula")
        LocalDateTime dataHora,
        @NotBlank (message = "Campo não pode ser nulo")
        String assunto
){ }
