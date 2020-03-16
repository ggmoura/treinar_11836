
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceWindowDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceWindowDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TimeWindowDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequiresMultipleWorkers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceWindowDetail", propOrder = {
    "requiresMultipleWorkers"
})
@XmlSeeAlso({
    TaskServiceWindowOverrideDetail.class,
    ServiceableStopServiceWindowDetail.class,
    OrderClassifiedServiceWindowDetail.class,
    OrderServiceWindowDetail.class,
    UnassignedOrderGroupServiceWindowDetail.class
})
public class ServiceWindowDetail
    extends TimeWindowDetail
{

    @XmlElement(name = "RequiresMultipleWorkers")
    protected Boolean requiresMultipleWorkers;

    /**
     * Obtém o valor da propriedade requiresMultipleWorkers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresMultipleWorkers() {
        return requiresMultipleWorkers;
    }

    /**
     * Define o valor da propriedade requiresMultipleWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresMultipleWorkers(Boolean value) {
        this.requiresMultipleWorkers = value;
    }

}
