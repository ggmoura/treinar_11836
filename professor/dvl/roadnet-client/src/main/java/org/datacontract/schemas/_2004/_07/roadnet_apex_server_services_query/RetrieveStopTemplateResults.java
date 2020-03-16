
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfServiceableStopTemplate;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrieveStopTemplateResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveStopTemplateResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceableStopTemplates" type="{http://roadnet.com/apex/DataContracts/}ArrayOfServiceableStopTemplate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveStopTemplateResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "serviceableStopTemplates"
})
public class RetrieveStopTemplateResults
    extends DataTransferObject
{

    @XmlElementRef(name = "ServiceableStopTemplates", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceableStopTemplate> serviceableStopTemplates;

    /**
     * Obtém o valor da propriedade serviceableStopTemplates.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceableStopTemplate> getServiceableStopTemplates() {
        return serviceableStopTemplates;
    }

    /**
     * Define o valor da propriedade serviceableStopTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceableStopTemplate }{@code >}
     *     
     */
    public void setServiceableStopTemplates(JAXBElement<ArrayOfServiceableStopTemplate> value) {
        this.serviceableStopTemplates = value;
    }

}
