@Path("/clients") // Esta es la URL base
public class ClientsResource {
    @Inject
    StoreDal storeDal;

    @GET
    @Path("/all") // La URL final será /clients/all
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClients() {
        var responseDto = storeDal.getClients();
        return Response.ok(responseDto).build();
    }
}
