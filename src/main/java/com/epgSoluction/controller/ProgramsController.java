package com.epgSoluction.controller;

import com.epgSoluction.DTO.ProgramsDTO;
import com.epgSoluction.service.ProgramsService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/programs")
public class ProgramsController {


    @Autowired
    ProgramsService programsService;


    @Operation( description = "Create a Programs.",  summary = "Create a Programs.")
    @PostMapping(value = "/create")
    public ResponseEntity<ProgramsDTO> create(@RequestBody @Valid ProgramsDTO program){


        return new ResponseEntity<>(programsService.createProgramsDTO(program),HttpStatus.CREATED );
    }



    @GetMapping("{/channelId}")
    @Operation( description = "Get Programs by Channel ID.",  summary = "Get Programs by Channel ID.")
    public ResponseEntity<List<ProgramsDTO>> getProgramsByChannels(@PathVariable(value = "channelId") UUID channelId){

        return new ResponseEntity<>(new ArrayList<ProgramsDTO>(),HttpStatus.OK );
    }

    @GetMapping("{/id}")
    @Operation( description = "Get Program by ID.",  summary = "Get Program by ID.")
    public ResponseEntity<Object> getProgramsById(@PathVariable(value = "id") UUID id){

        Optional<ProgramsDTO> programs = programsService.getPrograms(id);
        if(!programs.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Programs not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(programs.get());
    }

    @PutMapping
    @Operation( description = "Update a Program.",  summary = "Update a Program.")
    public ResponseEntity<Object> updatePrograms(@RequestBody @Valid ProgramsDTO dto,  @PathVariable(value = "id") UUID id){
        Optional<ProgramsDTO> programs = programsService.getPrograms(id);
        if(!programs.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Programs not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Program upated with success");
    }

    @DeleteMapping
    @Operation( description = "Delete Program.",  summary = "Delete Program.")
    public ResponseEntity<Object> removePrograms(@PathVariable(value = "id") UUID id){
        Optional<ProgramsDTO> programs = programsService.getPrograms(id);
        if(!programs.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Programs not found");
        }
        programsService.removePrograms(programs.get());

        return ResponseEntity.status(HttpStatus.OK).body("Program deleted with success");
    }

}
