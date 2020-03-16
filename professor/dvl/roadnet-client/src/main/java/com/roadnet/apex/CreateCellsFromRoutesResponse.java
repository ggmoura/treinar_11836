
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.CreateCellsFromRoutesResult;


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
 *         &lt;element name="CreateCellsFromRoutesResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}CreateCellsFromRoutesResult" minOccurs="0"/&gt;
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
    "createCellsFromRoutesResult"
})
@XmlRootElement(name = "CreateCellsFromRoutesResponse")
public class CreateCellsFromRoutesResponse {

    @XmlElementRef(name = "CreateCellsFromRoutesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateCellsFromRoutesResult> createCellsFromRoutesResult;

    /**
     * Obtém o valor da propriedade createCellsFromRoutesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesResult }{@code >}
     *     
     */
    public JAXBElement<CreateCellsFromRoutesResult> getCreateCellsFromRoutesResult() {
        return createCellsFromRoutesResult;
    }

    /**
     * Define o valor da propriedade createCellsFromRoutesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateCellsFromRoutesResult }{@code >}
     *     
     */
    public void setCreateCellsFromRoutesResult(JAXBElement<CreateCellsFromRoutesResult> value) {
        this.createCellsFromRoutesResult = value;
    }

}
