package com.epgSoluction.repository;

import com.epgSoluction.model.Channels;
import com.epgSoluction.model.Programs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProgramsRepository extends JpaRepository<Programs, String> {


    List<Programs> getProgramsByChannelId(UUID channelId);

}
