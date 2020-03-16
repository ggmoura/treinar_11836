
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNetworkArcEndpointID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetworkArcEndpointID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkArcEndpointID" type="{http://roadnet.com/apex/DataContracts/}NetworkArcEndpointID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetworkArcEndpointID", propOrder = {
    "networkArcEndpointID"
})
public class ArrayOfNetworkArcEndpointID {

    @XmlElement(name = "NetworkArcEndpointID", nillable = true)
    protected List<NetworkArcEndpointID> networkArcEndpointID;

    /**
     * Gets the value of the networkArcEndpointID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkArcEndpointID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkArcEndpointID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkArcEndpointID }
     * 
     * 
     */
    public List<NetworkArcEndpointID> getNetworkArcEndpointID() {
        if (networkArcEndpointID == null) {
            networkArcEndpointID = new ArrayList<NetworkArcEndpointID>();
        }
        return this.networkArcEndpointID;
    }

}
