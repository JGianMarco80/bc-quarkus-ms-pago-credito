package com.nttd.ms.pago.credito.resource;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import com.nttd.ms.pago.credito.service.PagoCreditoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;

@Path("/pago-credito")
public class PagoCreditoResource {

    @Inject
    PagoCreditoService pagoCreditoService;

    @GET
    public List<PagoCredito> findAll() {
        return pagoCreditoService.findAll();
    }

    @GET
    @Path("/{id}")
    public PagoCredito findAll(@PathParam("id") Long id) {
        return pagoCreditoService.findById(id);
    }

    @POST
    @Transactional
    public void save(PagoCredito pagoCredito){
        pagoCreditoService.save(pagoCredito);
    }
}
