
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RetrievalResults;


/**
 * <p>Classe Java de DeviceLookupResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceLookupResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RetrievalResults"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LookupResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}ArrayOfDeviceLookupResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLookupResults", propOrder = {
    "lookupResults"
})
public class DeviceLookupResults
    extends RetrievalResults
{

    @XmlElementRef(name = "LookupResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDeviceLookupResult> lookupResults;

    /**
     * Obtém o valor da propriedade lookupResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeviceLookupResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDeviceLookupResult> getLookupResults() {
        return lookupResults;
    }

    /**
     * Define o valor da propriedade lookupResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDeviceLookupResult }{@code >}
     *     
     */
    public void setLookupResults(JAXBElement<ArrayOfDeviceLookupResult> value) {
        this.lookupResults = value;
    }

}
