
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_query.DataWarehouseKpiResult;


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
 *         &lt;element name="RetrieveKpiDataResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}DataWarehouseKpiResult" minOccurs="0"/&gt;
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
    "retrieveKpiDataResult"
})
@XmlRootElement(name = "RetrieveKpiDataResponse")
public class RetrieveKpiDataResponse {

    @XmlElementRef(name = "RetrieveKpiDataResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiResult> retrieveKpiDataResult;

    /**
     * Obtém o valor da propriedade retrieveKpiDataResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiResult> getRetrieveKpiDataResult() {
        return retrieveKpiDataResult;
    }

    /**
     * Define o valor da propriedade retrieveKpiDataResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiResult }{@code >}
     *     
     */
    public void setRetrieveKpiDataResult(JAXBElement<DataWarehouseKpiResult> value) {
        this.retrieveKpiDataResult = value;
    }

}
