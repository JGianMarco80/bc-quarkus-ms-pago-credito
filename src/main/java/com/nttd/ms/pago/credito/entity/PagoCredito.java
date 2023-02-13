package com.nttd.ms.pago.credito.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "p_credito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoCredito {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    //1:Pago de crédito
    //2:Pago de tarjeta de crédito
    @Column(name = "tipo_pago")
    private String tipoPago;

    @Column(name = "numero_credito")
    private String numeroCredito;

    @Column(name = "cantidad_cuotas")
    private Integer cantidadCuotas;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "fecha")
    private LocalDate fecha;
}
