package org.philip.angularSoup.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;


@Path("/test")
public class TestRESTService 
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> listAllMembers() {
        return new ArrayList<Object>();
    }

    @GET
    @Path("/foo")
    @Produces(MediaType.APPLICATION_JSON)
    public String getFoo()
    {
    	JSONObject o = new JSONObject();
    	o.put("foo", 123);
    	return o.toString();
    }

    @GET
    @Path("/bar")
    @Produces(MediaType.APPLICATION_JSON)
    public String getBar()
    {
    	JSONArray array = new JSONArray();

    	JSONObject o = new JSONObject();
    	o.put("foo", 123);
    	o.put("bar", 456);
    	array.put(o);

    	o = new JSONObject();
    	o.put("foo", 789);
    	o.put("bar", "asdfasdfasdfasdfasdf");
    	array.put(o);

    	return array.toString();
    }

    @GET
    @Path("/time")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTime()
    {
    	JSONObject o = new JSONObject();
    	o.put("time", new Date().toString());
    	return o.toString();
    }

}
