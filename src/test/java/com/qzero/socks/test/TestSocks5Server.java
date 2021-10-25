package com.qzero.socks.test;

import com.qzero.socks.Socks5Server;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSocks5Server {

    private Logger log= LoggerFactory.getLogger(getClass());

    @Test
    public void testServer() throws Exception{
        Socks5Server socks5Server=new Socks5Server(9990,(id,connection)->{
            log.info(String.format("Client connected with id %s and info %s", id,connection+""));
        });

        socks5Server.startServer();

        Thread.sleep(10000000);
    }

}
