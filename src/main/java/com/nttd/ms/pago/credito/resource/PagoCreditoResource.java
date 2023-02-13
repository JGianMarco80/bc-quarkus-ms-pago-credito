package com.nttd.ms.pago.credito.resource;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import com.nttd.ms.pago.credito.service.PagoCreditoService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/pago-credito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
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
