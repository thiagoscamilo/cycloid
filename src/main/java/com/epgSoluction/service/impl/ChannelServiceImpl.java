package com.epgSoluction.service.impl;

import com.epgSoluction.DTO.ChannelsDTO;
import com.epgSoluction.mapper.ChannelsMapper;
import com.epgSoluction.repository.ChannellRepository;
import com.epgSoluction.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChannelServiceImpl implements ChannelService {


    @Autowired
    ChannellRepository channellRepository;

    public List<ChannelsDTO> getChannel(){
        return ChannelsMapper.getListChannelDTO(channellRepository.findAll());
    };

    public ChannelsDTO createChannels(ChannelsDTO channelsDto){
        return ChannelsMapper.getChannelDTO(channellRepository.save(ChannelsMapper.getChannel(channelsDto)));

    };


}
