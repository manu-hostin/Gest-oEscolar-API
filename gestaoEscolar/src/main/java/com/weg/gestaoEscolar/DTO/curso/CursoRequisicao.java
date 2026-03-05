package com.weg.gestaoEscolar.DTO.curso;

import com.weg.gestaoEscolar.model.Professor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CursoRequisicao (

        @NotBlank (message = "Campo não pode ser nulo")
        String nome,

        @NotNull (message = "Campo não pode ser nulo")
        String codigo,

        @NotNull (message = "Campo não pode ser nulo")
        List<Integer> professoresIDS
){
}
