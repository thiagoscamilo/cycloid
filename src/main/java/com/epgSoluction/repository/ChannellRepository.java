package com.epgSoluction.repository;

import com.epgSoluction.model.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannellRepository extends JpaRepository<Channels, String> {
}
