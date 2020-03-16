
package com.roadnet.apex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="RetrieveDataWarehouseMaxDownloadDaysResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "retrieveDataWarehouseMaxDownloadDaysResult"
})
@XmlRootElement(name = "RetrieveDataWarehouseMaxDownloadDaysResponse")
public class RetrieveDataWarehouseMaxDownloadDaysResponse {

    @XmlElement(name = "RetrieveDataWarehouseMaxDownloadDaysResult")
    protected Integer retrieveDataWarehouseMaxDownloadDaysResult;

    /**
     * Obtém o valor da propriedade retrieveDataWarehouseMaxDownloadDaysResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetrieveDataWarehouseMaxDownloadDaysResult() {
        return retrieveDataWarehouseMaxDownloadDaysResult;
    }

    /**
     * Define o valor da propriedade retrieveDataWarehouseMaxDownloadDaysResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetrieveDataWarehouseMaxDownloadDaysResult(Integer value) {
        this.retrieveDataWarehouseMaxDownloadDaysResult = value;
    }

}
