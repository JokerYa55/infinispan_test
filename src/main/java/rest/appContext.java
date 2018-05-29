/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.infinispan.Cache;

/**
 *
 * @author vasil
 */
@ApplicationScoped
public class appContext {

    @Produces
    @Resource(name = "myCache")
    private Cache cache;
}
