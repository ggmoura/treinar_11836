package com.roadnet.apex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:07.741-03:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "LoginService",
                  wsdlLocation = "file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl",
                  targetNamespace = "http://roadnet.com/apex/")
public class LoginService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://roadnet.com/apex/", "LoginService");
    public final static QName BasicHttpBindingILoginService = new QName("http://roadnet.com/apex/", "BasicHttpBinding_ILoginService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoginService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoginService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LoginService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoginService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoginService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ILoginService
     */
    @WebEndpoint(name = "BasicHttpBinding_ILoginService")
    public ILoginService getBasicHttpBindingILoginService() {
        return super.getPort(BasicHttpBindingILoginService, ILoginService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILoginService
     */
    @WebEndpoint(name = "BasicHttpBinding_ILoginService")
    public ILoginService getBasicHttpBindingILoginService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingILoginService, ILoginService.class, features);
    }

}
