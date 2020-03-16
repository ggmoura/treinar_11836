
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfServiceableStopServiceWindowDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceableStopServiceWindowDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceableStopServiceWindowDetail" type="{http://roadnet.com/apex/DataContracts/}ServiceableStopServiceWindowDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceableStopServiceWindowDetail", propOrder = {
    "serviceableStopServiceWindowDetail"
})
public class ArrayOfServiceableStopServiceWindowDetail {

    @XmlElement(name = "ServiceableStopServiceWindowDetail", nillable = true)
    protected List<ServiceableStopServiceWindowDetail> serviceableStopServiceWindowDetail;

    /**
     * Gets the value of the serviceableStopServiceWindowDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceableStopServiceWindowDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceableStopServiceWindowDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceableStopServiceWindowDetail }
     * 
     * 
     */
    public List<ServiceableStopServiceWindowDetail> getServiceableStopServiceWindowDetail() {
        if (serviceableStopServiceWindowDetail == null) {
            serviceableStopServiceWindowDetail = new ArrayList<ServiceableStopServiceWindowDetail>();
        }
        return this.serviceableStopServiceWindowDetail;
    }

}
