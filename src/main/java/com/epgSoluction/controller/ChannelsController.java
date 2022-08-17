package com.epgSoluction.controller;

import com.epgSoluction.DTO.ChannelsDTO;
import com.epgSoluction.service.ChannelService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelsController {

    @Autowired
    ChannelService channelService;

    @GetMapping
    @Operation( description = "Get all Channels.",  summary = "Get all Channels.")
    public ResponseEntity<List<ChannelsDTO>> getChannels(){
        return  new ResponseEntity<>(channelService.getChannel(), HttpStatus.OK);
    }

    @Operation( description = "Create a Channel.",  summary = "Create a Channel.")
    @PostMapping(value = "/create")
    public ResponseEntity<ChannelsDTO> create(@RequestBody @Valid ChannelsDTO channel){


        return new ResponseEntity<>(channelService.createChannels(channel), HttpStatus.CREATED);
    }


}
