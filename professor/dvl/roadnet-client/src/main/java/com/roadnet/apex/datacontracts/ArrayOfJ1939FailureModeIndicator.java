
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfJ1939FailureModeIndicator complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ1939FailureModeIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1939FailureModeIndicator" type="{http://roadnet.com/apex/DataContracts/}J1939FailureModeIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ1939FailureModeIndicator", propOrder = {
    "j1939FailureModeIndicator"
})
public class ArrayOfJ1939FailureModeIndicator {

    @XmlElement(name = "J1939FailureModeIndicator", nillable = true)
    protected List<J1939FailureModeIndicator> j1939FailureModeIndicator;

    /**
     * Gets the value of the j1939FailureModeIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j1939FailureModeIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ1939FailureModeIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J1939FailureModeIndicator }
     * 
     * 
     */
    public List<J1939FailureModeIndicator> getJ1939FailureModeIndicator() {
        if (j1939FailureModeIndicator == null) {
            j1939FailureModeIndicator = new ArrayList<J1939FailureModeIndicator>();
        }
        return this.j1939FailureModeIndicator;
    }

}
