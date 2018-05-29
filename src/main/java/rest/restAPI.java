/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.infinispan.Cache;
import org.infinispan.manager.CacheContainer;

/**
 *
 * @author vasil
 */
@Path("/")
//@Stateless
public class restAPI {

    //@Resource(lookup = "java:jboss/infinispan/LocalCacheMyProject")
    @Resource(name = "LocalCacheMyProject")
    private Cache cache;
    
    //@Inject Cache cache;
    
//    @Resource(lookup = "java:jboss/infinispan/server")
//    CacheContainer container;

    @Path("/test")
    @GET
    public String Test() {
        System.out.println("cache = " + cache);
//        Cache cache = container.getCache("myProject");
        cache.put("test", "1");
        System.out.println("cache = " + cache);
        return "test";
    }
}
