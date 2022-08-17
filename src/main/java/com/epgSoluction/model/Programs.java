package com.epgSoluction.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PROGRAMS")
public class Programs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String imageUrl;

    @OneToOne
    @JoinColumn(name="channelId", referencedColumnName = "id")
    private Channels channel;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;


    @Column(nullable = false)
    private LocalDate startTime ;

    @Column(nullable = false)
    private LocalDate endTime;
}
