
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTimeWindowTypeOpenCloseDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimeWindowTypeOpenCloseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeWindowTypeOpenCloseDetail" type="{http://roadnet.com/apex/DataContracts/}TimeWindowTypeOpenCloseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimeWindowTypeOpenCloseDetail", propOrder = {
    "timeWindowTypeOpenCloseDetail"
})
public class ArrayOfTimeWindowTypeOpenCloseDetail {

    @XmlElement(name = "TimeWindowTypeOpenCloseDetail", nillable = true)
    protected List<TimeWindowTypeOpenCloseDetail> timeWindowTypeOpenCloseDetail;

    /**
     * Gets the value of the timeWindowTypeOpenCloseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeWindowTypeOpenCloseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeWindowTypeOpenCloseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeWindowTypeOpenCloseDetail }
     * 
     * 
     */
    public List<TimeWindowTypeOpenCloseDetail> getTimeWindowTypeOpenCloseDetail() {
        if (timeWindowTypeOpenCloseDetail == null) {
            timeWindowTypeOpenCloseDetail = new ArrayList<TimeWindowTypeOpenCloseDetail>();
        }
        return this.timeWindowTypeOpenCloseDetail;
    }

}
