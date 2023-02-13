package com.nttd.ms.pago.credito.client;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@Path("/gasto-tarjeta-credito")
public interface GastoCreditoClient {

    @PUT
    @Path("/pago-cuota")
    @Transactional
    void savePagoCuota(@QueryParam("numeroCredito") String numeroCredito,
                              @QueryParam("cuota") Integer cuota,
                              @QueryParam("monto") Double monto);

}
