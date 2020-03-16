
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTravelDirectionsStep complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTravelDirectionsStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelDirectionsStep" type="{http://roadnet.com/apex/DataContracts/}TravelDirectionsStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelDirectionsStep", propOrder = {
    "travelDirectionsStep"
})
public class ArrayOfTravelDirectionsStep {

    @XmlElement(name = "TravelDirectionsStep", nillable = true)
    protected List<TravelDirectionsStep> travelDirectionsStep;

    /**
     * Gets the value of the travelDirectionsStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDirectionsStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDirectionsStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDirectionsStep }
     * 
     * 
     */
    public List<TravelDirectionsStep> getTravelDirectionsStep() {
        if (travelDirectionsStep == null) {
            travelDirectionsStep = new ArrayList<TravelDirectionsStep>();
        }
        return this.travelDirectionsStep;
    }

}
