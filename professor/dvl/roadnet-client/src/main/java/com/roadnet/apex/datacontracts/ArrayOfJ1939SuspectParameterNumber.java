
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfJ1939SuspectParameterNumber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ1939SuspectParameterNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1939SuspectParameterNumber" type="{http://roadnet.com/apex/DataContracts/}J1939SuspectParameterNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ1939SuspectParameterNumber", propOrder = {
    "j1939SuspectParameterNumber"
})
public class ArrayOfJ1939SuspectParameterNumber {

    @XmlElement(name = "J1939SuspectParameterNumber", nillable = true)
    protected List<J1939SuspectParameterNumber> j1939SuspectParameterNumber;

    /**
     * Gets the value of the j1939SuspectParameterNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j1939SuspectParameterNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ1939SuspectParameterNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J1939SuspectParameterNumber }
     * 
     * 
     */
    public List<J1939SuspectParameterNumber> getJ1939SuspectParameterNumber() {
        if (j1939SuspectParameterNumber == null) {
            j1939SuspectParameterNumber = new ArrayList<J1939SuspectParameterNumber>();
        }
        return this.j1939SuspectParameterNumber;
    }

}
