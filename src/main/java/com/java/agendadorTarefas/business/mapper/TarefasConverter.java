package com.java.agendadorTarefas.business.mapper;


import com.java.agendadorTarefas.business.dto.TarefasDTO;
import com.java.agendadorTarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

}
