package br.unitins.sd.webhook.resource.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagador {
    private String cpf;
    private String nome;
}
