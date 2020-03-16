
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTerritoryResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTerritoryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TerritoryResult" type="{http://roadnet.com/apex/DataContracts/}TerritoryResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTerritoryResult", propOrder = {
    "territoryResult"
})
public class ArrayOfTerritoryResult {

    @XmlElement(name = "TerritoryResult", nillable = true)
    protected List<TerritoryResult> territoryResult;

    /**
     * Gets the value of the territoryResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territoryResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritoryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerritoryResult }
     * 
     * 
     */
    public List<TerritoryResult> getTerritoryResult() {
        if (territoryResult == null) {
            territoryResult = new ArrayList<TerritoryResult>();
        }
        return this.territoryResult;
    }

}
