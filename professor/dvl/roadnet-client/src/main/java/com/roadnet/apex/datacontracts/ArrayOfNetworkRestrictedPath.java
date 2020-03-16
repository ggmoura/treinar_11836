
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNetworkRestrictedPath complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetworkRestrictedPath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkRestrictedPath" type="{http://roadnet.com/apex/DataContracts/}NetworkRestrictedPath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetworkRestrictedPath", propOrder = {
    "networkRestrictedPath"
})
public class ArrayOfNetworkRestrictedPath {

    @XmlElement(name = "NetworkRestrictedPath", nillable = true)
    protected List<NetworkRestrictedPath> networkRestrictedPath;

    /**
     * Gets the value of the networkRestrictedPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkRestrictedPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkRestrictedPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkRestrictedPath }
     * 
     * 
     */
    public List<NetworkRestrictedPath> getNetworkRestrictedPath() {
        if (networkRestrictedPath == null) {
            networkRestrictedPath = new ArrayList<NetworkRestrictedPath>();
        }
        return this.networkRestrictedPath;
    }

}
