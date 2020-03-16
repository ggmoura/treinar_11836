
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ArrayOfAdminReport;


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
 *         &lt;element name="RetrieveAdminReportsResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}ArrayOfAdminReport" minOccurs="0"/&gt;
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
    "retrieveAdminReportsResult"
})
@XmlRootElement(name = "RetrieveAdminReportsResponse")
public class RetrieveAdminReportsResponse {

    @XmlElementRef(name = "RetrieveAdminReportsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAdminReport> retrieveAdminReportsResult;

    /**
     * Obtém o valor da propriedade retrieveAdminReportsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdminReport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdminReport> getRetrieveAdminReportsResult() {
        return retrieveAdminReportsResult;
    }

    /**
     * Define o valor da propriedade retrieveAdminReportsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdminReport }{@code >}
     *     
     */
    public void setRetrieveAdminReportsResult(JAXBElement<ArrayOfAdminReport> value) {
        this.retrieveAdminReportsResult = value;
    }

}
