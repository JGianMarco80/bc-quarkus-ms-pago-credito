package com.nttd.ms.pago.credito.service.impl;

import com.nttd.ms.pago.credito.client.GastoCreditoClient;
import com.nttd.ms.pago.credito.entity.PagoCredito;
import com.nttd.ms.pago.credito.repository.PagoCreditoRepository;
import com.nttd.ms.pago.credito.service.PagoCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class PagoCreditoServiceImpl implements PagoCreditoService {

    @Inject
    PagoCreditoRepository pagoCreditoRepository;

    @RestClient
    GastoCreditoClient gastoCredito;

    @Override
    public List<PagoCredito> findAll() {
        return pagoCreditoRepository.listAll();
    }

    @Override
    public PagoCredito findById(Long id) {
        return pagoCreditoRepository.findById(id);
    }

    @Override
    public void save(PagoCredito pagoCredito) {
        pagoCreditoRepository.persist(pagoCredito);
        if (pagoCredito.getTipoPago().equals("2")) {
            gastoCredito.savePagoCuota(pagoCredito.getNumeroCredito(),
                    pagoCredito.getCantidadCuotas(),
                    pagoCredito.getMonto());
        }
    }
}
