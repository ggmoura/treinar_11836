
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfJ1587MessageIdentifier complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJ1587MessageIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="J1587MessageIdentifier" type="{http://roadnet.com/apex/DataContracts/}J1587MessageIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJ1587MessageIdentifier", propOrder = {
    "j1587MessageIdentifier"
})
public class ArrayOfJ1587MessageIdentifier {

    @XmlElement(name = "J1587MessageIdentifier", nillable = true)
    protected List<J1587MessageIdentifier> j1587MessageIdentifier;

    /**
     * Gets the value of the j1587MessageIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the j1587MessageIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJ1587MessageIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J1587MessageIdentifier }
     * 
     * 
     */
    public List<J1587MessageIdentifier> getJ1587MessageIdentifier() {
        if (j1587MessageIdentifier == null) {
            j1587MessageIdentifier = new ArrayList<J1587MessageIdentifier>();
        }
        return this.j1587MessageIdentifier;
    }

}
