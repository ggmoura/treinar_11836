
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseCleansingResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseCleansingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemovedRoutesCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalRoutesCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseCleansingResult", propOrder = {
    "removedRoutesCount",
    "totalRoutesCount"
})
public class DataWarehouseCleansingResult
    extends DataTransferObject
{

    @XmlElement(name = "RemovedRoutesCount")
    protected Long removedRoutesCount;
    @XmlElement(name = "TotalRoutesCount")
    protected Long totalRoutesCount;

    /**
     * Obtém o valor da propriedade removedRoutesCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemovedRoutesCount() {
        return removedRoutesCount;
    }

    /**
     * Define o valor da propriedade removedRoutesCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemovedRoutesCount(Long value) {
        this.removedRoutesCount = value;
    }

    /**
     * Obtém o valor da propriedade totalRoutesCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRoutesCount() {
        return totalRoutesCount;
    }

    /**
     * Define o valor da propriedade totalRoutesCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRoutesCount(Long value) {
        this.totalRoutesCount = value;
    }

}
