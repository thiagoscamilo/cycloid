package com.epgSoluction.mapper;

import com.epgSoluction.DTO.ProgramsDTO;
import com.epgSoluction.model.Programs;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProgramsMapper {


    public static ProgramsDTO getProgramsDTO (Optional<Programs> programs){

        if(programs.isPresent())
            return getProgramsDTO(programs.get());

        return new ProgramsDTO();

    }
    public static ProgramsDTO getProgramsDTO (Programs programs){
        ProgramsDTO programsDTO = null;
        if(programs != null){
            programsDTO = new ProgramsDTO();
            programsDTO.setId(String.valueOf(programs.getId()));
            programsDTO.setDescription(programs.getDescription());
            programsDTO.setTitle(programs.getTitle());
            programsDTO.setImageUrl(programs.getImageUrl());
            programsDTO.setChannel(programs.getChannel());
            programsDTO.setStartTime(programs.getStartTime());
            programsDTO.setEndTime(programs.getEndTime());
        }

        return programsDTO;
    }


    public static List<ProgramsDTO> getListChannelDTO (List<Programs> programs){
        return programs.stream().map( p -> getProgramsDTO(p)).collect(Collectors.toList());

    }

    public static Programs getPrograms(ProgramsDTO programsDto){
        Programs programs = new Programs();
        if(programs != null){
            programs.setId(UUID.fromString(programsDto.getId()));
            programs.setDescription(programsDto.getDescription());
            programs.setTitle(programsDto.getTitle());
            programs.setImageUrl(programsDto.getImageUrl());
            programs.setChannel(programsDto.getChannel());
            programs.setStartTime(programsDto.getStartTime());
            programs.setEndTime(programsDto.getEndTime());
        }

        return programs;
    }

}
