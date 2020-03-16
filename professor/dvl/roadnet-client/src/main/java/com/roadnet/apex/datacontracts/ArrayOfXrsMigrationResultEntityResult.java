
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfXrsMigrationResult.EntityResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfXrsMigrationResult.EntityResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XrsMigrationResult.EntityResult" type="{http://roadnet.com/apex/DataContracts/}XrsMigrationResult.EntityResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfXrsMigrationResult.EntityResult", propOrder = {
    "xrsMigrationResultEntityResult"
})
public class ArrayOfXrsMigrationResultEntityResult {

    @XmlElement(name = "XrsMigrationResult.EntityResult", nillable = true)
    protected List<XrsMigrationResultEntityResult> xrsMigrationResultEntityResult;

    /**
     * Gets the value of the xrsMigrationResultEntityResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xrsMigrationResultEntityResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXrsMigrationResultEntityResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XrsMigrationResultEntityResult }
     * 
     * 
     */
    public List<XrsMigrationResultEntityResult> getXrsMigrationResultEntityResult() {
        if (xrsMigrationResultEntityResult == null) {
            xrsMigrationResultEntityResult = new ArrayList<XrsMigrationResultEntityResult>();
        }
        return this.xrsMigrationResultEntityResult;
    }

}
