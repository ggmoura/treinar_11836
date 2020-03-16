
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfCustomEntityMetaData complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomEntityMetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomEntityMetaData" type="{http://roadnet.com/apex/DataContracts/}CustomEntityMetaData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomEntityMetaData", propOrder = {
    "customEntityMetaData"
})
public class ArrayOfCustomEntityMetaData {

    @XmlElement(name = "CustomEntityMetaData", nillable = true)
    protected List<CustomEntityMetaData> customEntityMetaData;

    /**
     * Gets the value of the customEntityMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customEntityMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomEntityMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomEntityMetaData }
     * 
     * 
     */
    public List<CustomEntityMetaData> getCustomEntityMetaData() {
        if (customEntityMetaData == null) {
            customEntityMetaData = new ArrayList<CustomEntityMetaData>();
        }
        return this.customEntityMetaData;
    }

}
