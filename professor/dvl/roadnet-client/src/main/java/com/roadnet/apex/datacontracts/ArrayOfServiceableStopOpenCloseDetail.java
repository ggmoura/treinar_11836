
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfServiceableStopOpenCloseDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceableStopOpenCloseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceableStopOpenCloseDetail" type="{http://roadnet.com/apex/DataContracts/}ServiceableStopOpenCloseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceableStopOpenCloseDetail", propOrder = {
    "serviceableStopOpenCloseDetail"
})
public class ArrayOfServiceableStopOpenCloseDetail {

    @XmlElement(name = "ServiceableStopOpenCloseDetail", nillable = true)
    protected List<ServiceableStopOpenCloseDetail> serviceableStopOpenCloseDetail;

    /**
     * Gets the value of the serviceableStopOpenCloseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceableStopOpenCloseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceableStopOpenCloseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceableStopOpenCloseDetail }
     * 
     * 
     */
    public List<ServiceableStopOpenCloseDetail> getServiceableStopOpenCloseDetail() {
        if (serviceableStopOpenCloseDetail == null) {
            serviceableStopOpenCloseDetail = new ArrayList<ServiceableStopOpenCloseDetail>();
        }
        return this.serviceableStopOpenCloseDetail;
    }

}
