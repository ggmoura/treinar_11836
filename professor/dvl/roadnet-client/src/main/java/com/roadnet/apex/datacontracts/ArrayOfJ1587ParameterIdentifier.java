
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfJ1587ParameterIdentifier complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ1587ParameterIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1587ParameterIdentifier" type="{http://roadnet.com/apex/DataContracts/}J1587ParameterIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ1587ParameterIdentifier", propOrder = {
    "j1587ParameterIdentifier"
})
public class ArrayOfJ1587ParameterIdentifier {

    @XmlElement(name = "J1587ParameterIdentifier", nillable = true)
    protected List<J1587ParameterIdentifier> j1587ParameterIdentifier;

    /**
     * Gets the value of the j1587ParameterIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j1587ParameterIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ1587ParameterIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J1587ParameterIdentifier }
     * 
     * 
     */
    public List<J1587ParameterIdentifier> getJ1587ParameterIdentifier() {
        if (j1587ParameterIdentifier == null) {
            j1587ParameterIdentifier = new ArrayList<J1587ParameterIdentifier>();
        }
        return this.j1587ParameterIdentifier;
    }

}
