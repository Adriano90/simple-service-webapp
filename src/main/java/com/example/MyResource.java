package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;
//import javax.annotation.security.PermitAll;
//import javax.annotation.security.RolesAllowed;
//import javax.annotation.security.DenyAll;

import java.util.*;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
//@PermitAll
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getMyBean")
	//@RolesAllowed({"WSRest"})
    @GET
    @Produces({ MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public MyBean getIt() {
		MyBean myBean = new MyBean();
		myBean.setEntero(Integer.valueOf(8));
        return myBean;
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getInteger")
    @GET
	//@DenyAll
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Integer getInteger() {
        return Integer.valueOf(8);
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getMap")
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Map<String, String> getMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "8");
        return map;
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getList")
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response getList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(8));
		GenericEntity<List<Integer>> entity = new GenericEntity<List<Integer>>(list) {};
		Response response = Response.ok(entity).build();
        return response;
    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getArray")
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public String[] getArray() {
		List<String> list = new ArrayList<String>();
		list.add("7");
        return list.toArray(new String[list.size()]);
    }
}
