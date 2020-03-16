
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRoutingResult.PassResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoutingResult.PassResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutingResult.PassResult" type="{http://roadnet.com/apex/DataContracts/}RoutingResult.PassResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoutingResult.PassResult", propOrder = {
    "routingResultPassResult"
})
public class ArrayOfRoutingResultPassResult {

    @XmlElement(name = "RoutingResult.PassResult", nillable = true)
    protected List<RoutingResultPassResult> routingResultPassResult;

    /**
     * Gets the value of the routingResultPassResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingResultPassResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingResultPassResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingResultPassResult }
     * 
     * 
     */
    public List<RoutingResultPassResult> getRoutingResultPassResult() {
        if (routingResultPassResult == null) {
            routingResultPassResult = new ArrayList<RoutingResultPassResult>();
        }
        return this.routingResultPassResult;
    }

}
