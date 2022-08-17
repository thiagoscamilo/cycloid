package com.epgSoluction.mapper;

import com.epgSoluction.DTO.ChannelsDTO;
import com.epgSoluction.model.Channels;

import java.util.ArrayList;
import java.util.List;

public class ChannelsMapper {


    public static List<ChannelsDTO> getListChannelDTO(List<Channels> channels){
        List<ChannelsDTO> result = new ArrayList<>();
       for(Channels channel : channels){
           ChannelsDTO dto = new ChannelsDTO();
           dto.setId(channel.getId().toString());
           dto.setName(channel.getName());
           dto.setPosition(channel.getPosition());
           dto.setCategory(channel.getCategory());

           result.add(dto);
       }

       return result;
    }


    public static ChannelsDTO getChannelDTO(Channels channel){
        ChannelsDTO dto = new ChannelsDTO();
        if(channel != null){
            dto.setId(channel.getId().toString());
            dto.setName(channel.getName());
            dto.setPosition(channel.getPosition());
            dto.setCategory(channel.getCategory());

        }

        return dto;
    }


    public static Channels getChannel(ChannelsDTO channelDto){
        Channels entity = new Channels();
        if(channelDto != null){
            entity.setName(channelDto.getName());
            entity.setPosition(channelDto.getPosition());
            entity.setCategory(channelDto.getCategory());

        }

        return entity;
    }
}
