
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de DataWarehouseStagedOrder complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseStagedOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostNonTransportation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IsOffDayCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NetRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseStagedOrder", propOrder = {
    "costNonTransportation",
    "isOffDayCount",
    "netRevenue"
})
public class DataWarehouseStagedOrder
    extends DomainEntity
{

    @XmlElement(name = "CostNonTransportation")
    protected Double costNonTransportation;
    @XmlElement(name = "IsOffDayCount")
    protected Long isOffDayCount;
    @XmlElement(name = "NetRevenue")
    protected Double netRevenue;

    /**
     * Obtém o valor da propriedade costNonTransportation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostNonTransportation() {
        return costNonTransportation;
    }

    /**
     * Define o valor da propriedade costNonTransportation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostNonTransportation(Double value) {
        this.costNonTransportation = value;
    }

    /**
     * Obtém o valor da propriedade isOffDayCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIsOffDayCount() {
        return isOffDayCount;
    }

    /**
     * Define o valor da propriedade isOffDayCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIsOffDayCount(Long value) {
        this.isOffDayCount = value;
    }

    /**
     * Obtém o valor da propriedade netRevenue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetRevenue() {
        return netRevenue;
    }

    /**
     * Define o valor da propriedade netRevenue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetRevenue(Double value) {
        this.netRevenue = value;
    }

}
