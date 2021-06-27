package org.wso2.carbon.extensions;


import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisDescription;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.modules.Module;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.neethi.Assertion;
import org.apache.neethi.Policy;

public class AuditLogModule implements Module {

    private static Log log = LogFactory.getLog(org.wso2.carbon.extensions.AuditLogModule.class.getName());

    public void init(ConfigurationContext configurationContext, AxisModule axisModule) throws AxisFault {
        log.info("Initializing Audit Logger Module..");
    }

    public void engageNotify(AxisDescription axisDescription) throws AxisFault {
    }

    public boolean canSupportAssertion(Assertion assertion) {
        return false;
    }

    public void applyPolicy(Policy policy, AxisDescription axisDescription) throws AxisFault {

    }

    public void shutdown(ConfigurationContext configurationContext) throws AxisFault {

    }

}
