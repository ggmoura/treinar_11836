
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DeleteTerritoriesResultError complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteTerritoriesResultError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://roadnet.com/apex/DataContracts/}TransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTerritoriesResultError", propOrder = {
    "errorCode",
    "territoryKey"
})
public class DeleteTerritoriesResultError
    extends DataTransferObject
{

    @XmlElementRef(name = "ErrorCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferErrorCode> errorCode;
    @XmlElement(name = "TerritoryKey")
    protected Long territoryKey;

    /**
     * Obtém o valor da propriedade errorCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<TransferErrorCode> getErrorCode() {
        return errorCode;
    }

    /**
     * Define o valor da propriedade errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<TransferErrorCode> value) {
        this.errorCode = value;
    }

    /**
     * Obtém o valor da propriedade territoryKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerritoryKey() {
        return territoryKey;
    }

    /**
     * Define o valor da propriedade territoryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerritoryKey(Long value) {
        this.territoryKey = value;
    }

}
