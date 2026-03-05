package com.weg.gestaoEscolar.DTO.nota;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record NotaRequisicao (

         @NotNull(message = "Campo não pode ser nulo") @PositiveOrZero (message = "Campo deve ser igual a zero ou positivo")
         Long alunoId,
        @NotNull(message = "Campo não pode ser nulo") @PositiveOrZero (message = "Campo deve ser igual a zero ou positivo")
        Long aulaId,

        @Positive (message = "valor deve ser maior que 0") @NotNull (message = "Campo não pode ser nulo")
        Double valor

){}