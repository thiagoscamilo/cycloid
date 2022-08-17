package com.epgSoluction.DTO;

import io.swagger.annotations.ApiModel;
import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class ChannelsDTO {

    private String id;

    @NotNull(message="Name is requerid")
    private String name;

    @NotNull(message="Position is requerid")
    private Integer position;

    @NotNull(message="Category is requerid")
    private String category;

}
