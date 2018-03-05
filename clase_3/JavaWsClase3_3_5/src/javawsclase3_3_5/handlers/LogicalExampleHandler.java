/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_5.handlers;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author Federico Coraglio
 */
public class LogicalExampleHandler implements LogicalHandler<LogicalMessageContext> {

    @Override
    public boolean handleMessage(LogicalMessageContext context) {
        Boolean outbound = (Boolean)
                context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if(outbound) {
            System.out.println("LOGICAL HANDLER - Mensaje de SALIDA");
        } else {
            System.out.println("LOGICAL HANDLER - Mensaje de ENTRADA");
        }
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
        //do nothings
    }
    
}
