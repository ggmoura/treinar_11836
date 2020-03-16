
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de StagedStopQuantityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StagedStopQuantityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RunningQuantityAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StagedStopQuantityPropertyOptions", propOrder = {
    "capacity",
    "quantity",
    "runningQuantityAfter",
    "type",
    "unitType"
})
public class StagedStopQuantityPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Capacity")
    protected Boolean capacity;
    @XmlElement(name = "Quantity")
    protected Boolean quantity;
    @XmlElement(name = "RunningQuantityAfter")
    protected Boolean runningQuantityAfter;
    @XmlElement(name = "Type")
    protected Boolean type;
    @XmlElement(name = "UnitType")
    protected Boolean unitType;

    /**
     * Obtém o valor da propriedade capacity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapacity() {
        return capacity;
    }

    /**
     * Define o valor da propriedade capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapacity(Boolean value) {
        this.capacity = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantity(Boolean value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade runningQuantityAfter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunningQuantityAfter() {
        return runningQuantityAfter;
    }

    /**
     * Define o valor da propriedade runningQuantityAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunningQuantityAfter(Boolean value) {
        this.runningQuantityAfter = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setType(Boolean value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade unitType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitType() {
        return unitType;
    }

    /**
     * Define o valor da propriedade unitType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnitType(Boolean value) {
        this.unitType = value;
    }

}
