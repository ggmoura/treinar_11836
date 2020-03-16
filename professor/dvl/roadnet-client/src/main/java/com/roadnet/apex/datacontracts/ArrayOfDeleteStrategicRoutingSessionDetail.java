
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDeleteStrategicRoutingSessionDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeleteStrategicRoutingSessionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteStrategicRoutingSessionDetail" type="{http://roadnet.com/apex/DataContracts/}DeleteStrategicRoutingSessionDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeleteStrategicRoutingSessionDetail", propOrder = {
    "deleteStrategicRoutingSessionDetail"
})
public class ArrayOfDeleteStrategicRoutingSessionDetail {

    @XmlElement(name = "DeleteStrategicRoutingSessionDetail", nillable = true)
    protected List<DeleteStrategicRoutingSessionDetail> deleteStrategicRoutingSessionDetail;

    /**
     * Gets the value of the deleteStrategicRoutingSessionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteStrategicRoutingSessionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteStrategicRoutingSessionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteStrategicRoutingSessionDetail }
     * 
     * 
     */
    public List<DeleteStrategicRoutingSessionDetail> getDeleteStrategicRoutingSessionDetail() {
        if (deleteStrategicRoutingSessionDetail == null) {
            deleteStrategicRoutingSessionDetail = new ArrayList<DeleteStrategicRoutingSessionDetail>();
        }
        return this.deleteStrategicRoutingSessionDetail;
    }

}
