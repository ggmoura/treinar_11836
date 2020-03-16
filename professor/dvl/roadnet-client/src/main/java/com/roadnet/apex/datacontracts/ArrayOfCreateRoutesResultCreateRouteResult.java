
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfCreateRoutesResult.CreateRouteResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCreateRoutesResult.CreateRouteResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateRoutesResult.CreateRouteResult" type="{http://roadnet.com/apex/DataContracts/}CreateRoutesResult.CreateRouteResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCreateRoutesResult.CreateRouteResult", propOrder = {
    "createRoutesResultCreateRouteResult"
})
public class ArrayOfCreateRoutesResultCreateRouteResult {

    @XmlElement(name = "CreateRoutesResult.CreateRouteResult", nillable = true)
    protected List<CreateRoutesResultCreateRouteResult> createRoutesResultCreateRouteResult;

    /**
     * Gets the value of the createRoutesResultCreateRouteResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createRoutesResultCreateRouteResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateRoutesResultCreateRouteResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateRoutesResultCreateRouteResult }
     * 
     * 
     */
    public List<CreateRoutesResultCreateRouteResult> getCreateRoutesResultCreateRouteResult() {
        if (createRoutesResultCreateRouteResult == null) {
            createRoutesResultCreateRouteResult = new ArrayList<CreateRoutesResultCreateRouteResult>();
        }
        return this.createRoutesResultCreateRouteResult;
    }

}
