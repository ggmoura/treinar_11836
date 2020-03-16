
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query_datawarehouse_roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_query_datawarehouse_roadnet_apex_server_services_query package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AndMeasureRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse.Roadnet.Apex.Server.Services.Query.DataWarehouse", "AndMeasureRule");
    private final static QName _OrMeasureRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse.Roadnet.Apex.Server.Services.Query.DataWarehouse", "OrMeasureRule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_query_datawarehouse_roadnet_apex_server_services_query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AndMeasureRule }
     * 
     */
    public AndMeasureRule createAndMeasureRule() {
        return new AndMeasureRule();
    }

    /**
     * Create an instance of {@link OrMeasureRule }
     * 
     */
    public OrMeasureRule createOrMeasureRule() {
        return new OrMeasureRule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AndMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse.Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "AndMeasureRule")
    public JAXBElement<AndMeasureRule> createAndMeasureRule(AndMeasureRule value) {
        return new JAXBElement<AndMeasureRule>(_AndMeasureRule_QNAME, AndMeasureRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrMeasureRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse.Roadnet.Apex.Server.Services.Query.DataWarehouse", name = "OrMeasureRule")
    public JAXBElement<OrMeasureRule> createOrMeasureRule(OrMeasureRule value) {
        return new JAXBElement<OrMeasureRule>(_OrMeasureRule_QNAME, OrMeasureRule.class, null, value);
    }

}
