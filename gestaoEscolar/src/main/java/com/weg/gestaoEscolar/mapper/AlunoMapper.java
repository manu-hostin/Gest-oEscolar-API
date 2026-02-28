package com.weg.gestaoEscolar.mapper;

import com.weg.gestaoEscolar.DTO.aluno.AlunoRequisicao;
import com.weg.gestaoEscolar.DTO.aluno.AlunoResposta;
import com.weg.gestaoEscolar.model.Aluno;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlunoMapper {

    public Aluno paraEntidade (AlunoRequisicao requisicao){
        return new Aluno(
                requisicao.matricula(),
                requisicao.nome(),
                requisicao.email(),
                requisicao.nascimento()
        );
    }

    public AlunoResposta paraResposta (Aluno aluno){
        return new AlunoResposta(
                aluno.getId(),
                aluno.getMatricula(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getNascimento()
        );
    }

    public List<AlunoResposta> listar (List<Aluno> alunos) {
        List<AlunoResposta> lista = new ArrayList<>();

        for (Aluno aluno : alunos){
            lista.add(paraResposta(aluno));
        }
        return lista;
    }

}
