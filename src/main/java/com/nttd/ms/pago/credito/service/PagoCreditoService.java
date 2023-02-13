package com.nttd.ms.pago.credito.service;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import java.util.List;

public interface PagoCreditoService {

    List<PagoCredito> findAll();

    PagoCredito findById(Long id);

    void save(PagoCredito pagoCredito);

}
