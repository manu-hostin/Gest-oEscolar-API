package com.weg.gestaoEscolar.DTO.turma;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.List;

public record TurmaRequisicao (
        @NotBlank (message = "Nome não pode ser nulo")
        String nome,
        @PositiveOrZero (message = "Número deve ser 0 ou positivo") @NotNull (message = "Campo não pode ser nulo")
        int cursoId,

        @PositiveOrZero (message = "Número deve ser 0 ou positivo") @NotNull(message = "Campo não pode ser nulo")
        int professorId,

        @NotNull(message = "Campo não pode ser nulo")
        List<Integer> listaAlunoIds
) {
}
