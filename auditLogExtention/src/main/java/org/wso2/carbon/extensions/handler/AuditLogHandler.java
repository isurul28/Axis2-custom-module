

package org.wso2.carbon.extensions.handler;



import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.handlers.AbstractHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sun.rmi.log.LogHandler;


public class AuditLogHandler extends AbstractHandler implements Handler {

    private static final Log log = LogFactory.getLog(LogHandler.class);
    private String name;

    public String getName() {
        return name;
    }

    public InvocationResponse invoke(MessageContext msgContext) throws AxisFault {
        log.info(msgContext.getEnvelope().toString());
        return InvocationResponse.CONTINUE;
    }

    public void revoke(MessageContext msgContext) {
        log.info(msgContext.getEnvelope().toString());
    }

    public void setName(String name) {
        this.name = name;
    }
}
