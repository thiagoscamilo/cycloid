package com.epgSoluction.service;

import com.epgSoluction.DTO.ChannelsDTO;

import java.util.List;

public interface ChannelService {

    List<ChannelsDTO> getChannel();

    ChannelsDTO createChannels(ChannelsDTO channels);

}
