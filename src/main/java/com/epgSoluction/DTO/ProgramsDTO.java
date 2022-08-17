package com.epgSoluction.DTO;

import com.epgSoluction.model.Channels;
import io.swagger.annotations.ApiModel;
import lombok.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class ProgramsDTO {

    private String id;

    @NotNull(message="imageUrl is requerid")
    private String imageUrl;

    @NotNull(message="Channel is requerid")
    private Channels channel;

    @NotNull(message="Title is requerid")
    private String title;

    @NotNull(message="Description is requerid")
    private String description;


    @NotNull(message="StartTIme is requerid")
    private LocalDate startTime ;

    @NotNull(message="EndTIme is requerid")
    private LocalDate endTime;
}
