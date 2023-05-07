package com.api.clientecontrol.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClienteDto {
    @NotBlank
    private String nome;

    private Integer idade;
    @NotBlank
    private String cpf;

}
