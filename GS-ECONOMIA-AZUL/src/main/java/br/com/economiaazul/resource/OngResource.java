package br.com.economiaazul.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.bo.OngBO;
import br.com.economiaazul.exceptions.EnderecoDatabase;
import br.com.economiaazul.service.OngService;

@Path("/ongs")
public class OngResource {

    private OngService ongService;
    private OngBO ongBO;

    public OngResource() throws ClassNotFoundException, SQLException {
        this.ongService = new OngService();
        this.ongBO = new OngBO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarOngs() {
        List<Ong> listaOngs = ongService.listarOngs();
        return Response.ok(listaOngs).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response inserirOng(Ong ong, @Context UriInfo uriInfo) {
        try {
            ongBO.inserirBO(ong);
            UriBuilder builder = uriInfo.getAbsolutePathBuilder();
            builder.path(ong.getIdOng());
            return Response.created(builder.build()).entity(ong).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro no cadastro da ONG: " + e.getMessage()).build();
        }
    }
}

