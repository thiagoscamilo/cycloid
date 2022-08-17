package com.epgSoluction.service.impl;

import com.epgSoluction.DTO.ProgramsDTO;
import com.epgSoluction.mapper.ProgramsMapper;
import com.epgSoluction.model.Programs;
import com.epgSoluction.repository.ProgramsRepository;
import com.epgSoluction.service.ProgramsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProgramsServiceImpl implements ProgramsService {


    @Autowired
    ProgramsRepository programsRepository;

    public List<ProgramsDTO> getListProgramsDTO(UUID id){
        return ProgramsMapper.getListChannelDTO(programsRepository.getProgramsByChannelId(id));
    }

    public ProgramsDTO createProgramsDTO(ProgramsDTO programs){
        return ProgramsMapper.getProgramsDTO(programsRepository.save(ProgramsMapper.getPrograms(programs)));
    }

    public Optional<ProgramsDTO> getPrograms(UUID id){
        return Optional.ofNullable(ProgramsMapper.getProgramsDTO( programsRepository.findById(id.toString())));

    }

    public void removePrograms(ProgramsDTO program){
       programsRepository.delete(ProgramsMapper.getPrograms(program));

    }

    public void updatePrograms(ProgramsDTO program) {

            programsRepository.saveAndFlush(ProgramsMapper.getPrograms(program));
    }


}
