package com.nttd.ms.pago.credito.repository;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoCreditoRepository implements PanacheRepository<PagoCredito> {
}
