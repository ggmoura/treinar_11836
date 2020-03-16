
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.ArrayOfMeasureMetadata;


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
 *         &lt;element name="RetrieveAllMeasureMetadataResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfMeasureMetadata" minOccurs="0"/&gt;
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
    "retrieveAllMeasureMetadataResult"
})
@XmlRootElement(name = "RetrieveAllMeasureMetadataResponse")
public class RetrieveAllMeasureMetadataResponse {

    @XmlElementRef(name = "RetrieveAllMeasureMetadataResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeasureMetadata> retrieveAllMeasureMetadataResult;

    /**
     * Obtém o valor da propriedade retrieveAllMeasureMetadataResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeasureMetadata> getRetrieveAllMeasureMetadataResult() {
        return retrieveAllMeasureMetadataResult;
    }

    /**
     * Define o valor da propriedade retrieveAllMeasureMetadataResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}
     *     
     */
    public void setRetrieveAllMeasureMetadataResult(JAXBElement<ArrayOfMeasureMetadata> value) {
        this.retrieveAllMeasureMetadataResult = value;
    }

}
