
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNetworkRestrictedPathRule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetworkRestrictedPathRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkRestrictedPathRule" type="{http://roadnet.com/apex/DataContracts/}NetworkRestrictedPathRule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetworkRestrictedPathRule", propOrder = {
    "networkRestrictedPathRule"
})
public class ArrayOfNetworkRestrictedPathRule {

    @XmlElement(name = "NetworkRestrictedPathRule", nillable = true)
    protected List<NetworkRestrictedPathRule> networkRestrictedPathRule;

    /**
     * Gets the value of the networkRestrictedPathRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkRestrictedPathRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkRestrictedPathRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkRestrictedPathRule }
     * 
     * 
     */
    public List<NetworkRestrictedPathRule> getNetworkRestrictedPathRule() {
        if (networkRestrictedPathRule == null) {
            networkRestrictedPathRule = new ArrayList<NetworkRestrictedPathRule>();
        }
        return this.networkRestrictedPathRule;
    }

}
