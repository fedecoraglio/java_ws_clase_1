/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase4_4_1;

import java.util.ArrayList;
import java.util.List;
import javawsclase4_4_1.ws.LogicalClientHandler;
import javawsclase4_4_1.ws.SOAPClientHandler;
import javawsclase4_4_1.ws.server.MyService;
import javawsclase4_4_1.ws.server.MyServiceService;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWsClase4_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyServiceService serviceProxy = new MyServiceService();
        serviceProxy.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlers = new ArrayList<Handler>(1);
                handlers.add(new SOAPClientHandler());
                handlers.add(new LogicalClientHandler());
                return handlers;
            }
        });
        MyService myService = serviceProxy.getMyServicePort();
        System.out.println("Saludos " + myService.greetings());
    }
    
}
