
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfJ1939SourceAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ1939SourceAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1939SourceAddress" type="{http://roadnet.com/apex/DataContracts/}J1939SourceAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ1939SourceAddress", propOrder = {
    "j1939SourceAddress"
})
public class ArrayOfJ1939SourceAddress {

    @XmlElement(name = "J1939SourceAddress", nillable = true)
    protected List<J1939SourceAddress> j1939SourceAddress;

    /**
     * Gets the value of the j1939SourceAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j1939SourceAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ1939SourceAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J1939SourceAddress }
     * 
     * 
     */
    public List<J1939SourceAddress> getJ1939SourceAddress() {
        if (j1939SourceAddress == null) {
            j1939SourceAddress = new ArrayList<J1939SourceAddress>();
        }
        return this.j1939SourceAddress;
    }

}
