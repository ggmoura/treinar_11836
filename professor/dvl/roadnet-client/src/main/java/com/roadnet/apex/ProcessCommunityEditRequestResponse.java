
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ProcessCommunityEditRequestResult;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessCommunityEditRequestResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ProcessCommunityEditRequestResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processCommunityEditRequestResult"
})
@XmlRootElement(name = "ProcessCommunityEditRequestResponse")
public class ProcessCommunityEditRequestResponse {

    @XmlElementRef(name = "ProcessCommunityEditRequestResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessCommunityEditRequestResult> processCommunityEditRequestResult;

    /**
     * Obtém o valor da propriedade processCommunityEditRequestResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestResult }{@code >}
     *     
     */
    public JAXBElement<ProcessCommunityEditRequestResult> getProcessCommunityEditRequestResult() {
        return processCommunityEditRequestResult;
    }

    /**
     * Define o valor da propriedade processCommunityEditRequestResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessCommunityEditRequestResult }{@code >}
     *     
     */
    public void setProcessCommunityEditRequestResult(JAXBElement<ProcessCommunityEditRequestResult> value) {
        this.processCommunityEditRequestResult = value;
    }

}
