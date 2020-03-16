
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSaveStopArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaveStopArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveStopArgs" type="{http://roadnet.com/apex/DataContracts/}SaveStopArgs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaveStopArgs", propOrder = {
    "saveStopArgs"
})
public class ArrayOfSaveStopArgs {

    @XmlElement(name = "SaveStopArgs", nillable = true)
    protected List<SaveStopArgs> saveStopArgs;

    /**
     * Gets the value of the saveStopArgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveStopArgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveStopArgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaveStopArgs }
     * 
     * 
     */
    public List<SaveStopArgs> getSaveStopArgs() {
        if (saveStopArgs == null) {
            saveStopArgs = new ArrayList<SaveStopArgs>();
        }
        return this.saveStopArgs;
    }

}
