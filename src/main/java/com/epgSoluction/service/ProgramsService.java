package com.epgSoluction.service;

import com.epgSoluction.DTO.ChannelsDTO;
import com.epgSoluction.DTO.ProgramsDTO;
import com.epgSoluction.model.Programs;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProgramsService {

    List<ProgramsDTO> getListProgramsDTO(UUID channelId);

    ProgramsDTO createProgramsDTO(ProgramsDTO programs);

    Optional<ProgramsDTO> getPrograms(UUID id);

    void removePrograms(ProgramsDTO program);

    void updatePrograms(ProgramsDTO program);



}
