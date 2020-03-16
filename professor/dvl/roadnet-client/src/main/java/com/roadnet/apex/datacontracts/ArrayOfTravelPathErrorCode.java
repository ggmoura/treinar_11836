
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTravelPathErrorCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTravelPathErrorCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelPathErrorCode" type="{http://roadnet.com/apex/DataContracts/}TravelPathErrorCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelPathErrorCode", propOrder = {
    "travelPathErrorCode"
})
public class ArrayOfTravelPathErrorCode {

    @XmlElement(name = "TravelPathErrorCode")
    @XmlSchemaType(name = "string")
    protected List<TravelPathErrorCode> travelPathErrorCode;

    /**
     * Gets the value of the travelPathErrorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelPathErrorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelPathErrorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelPathErrorCode }
     * 
     * 
     */
    public List<TravelPathErrorCode> getTravelPathErrorCode() {
        if (travelPathErrorCode == null) {
            travelPathErrorCode = new ArrayList<TravelPathErrorCode>();
        }
        return this.travelPathErrorCode;
    }

}
