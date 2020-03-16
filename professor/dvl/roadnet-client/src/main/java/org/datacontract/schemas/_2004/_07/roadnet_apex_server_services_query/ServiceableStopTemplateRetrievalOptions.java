
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.StopTemplatePropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ServiceableStopTemplateRetrievalOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceableStopTemplateRetrievalOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrievalPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}StopTemplatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="SearchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceableStopTemplateRetrievalOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "retrievalPropertyOptions",
    "searchString"
})
public class ServiceableStopTemplateRetrievalOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "RetrievalPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopTemplatePropertyOptions> retrievalPropertyOptions;
    @XmlElementRef(name = "SearchString", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchString;

    /**
     * Obtém o valor da propriedade retrievalPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopTemplatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<StopTemplatePropertyOptions> getRetrievalPropertyOptions() {
        return retrievalPropertyOptions;
    }

    /**
     * Define o valor da propriedade retrievalPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopTemplatePropertyOptions }{@code >}
     *     
     */
    public void setRetrievalPropertyOptions(JAXBElement<StopTemplatePropertyOptions> value) {
        this.retrievalPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade searchString.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchString() {
        return searchString;
    }

    /**
     * Define o valor da propriedade searchString.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchString(JAXBElement<String> value) {
        this.searchString = value;
    }

}
