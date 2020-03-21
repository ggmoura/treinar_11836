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
 * 2020-03-15T13:07:07.830-03:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "MappingService",
                  wsdlLocation = "file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl",
                  targetNamespace = "http://roadnet.com/apex/")
public class MappingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://roadnet.com/apex/", "MappingService");
    public final static QName BasicHttpBindingIMappingService = new QName("http://roadnet.com/apex/", "BasicHttpBinding_IMappingService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MappingService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Gleidson/eclipse-workspace/roadnet-client/src/main/resources/wsdl/apex.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MappingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MappingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MappingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MappingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MappingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MappingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IMappingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IMappingService")
    public IMappingService getBasicHttpBindingIMappingService() {
        return super.getPort(BasicHttpBindingIMappingService, IMappingService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMappingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IMappingService")
    public IMappingService getBasicHttpBindingIMappingService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIMappingService, IMappingService.class, features);
    }

}