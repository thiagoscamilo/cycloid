package com.epgSoluction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_CHANNELS")
public class Channels {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer position;

    @Column(nullable = false)
    private String category;

}
