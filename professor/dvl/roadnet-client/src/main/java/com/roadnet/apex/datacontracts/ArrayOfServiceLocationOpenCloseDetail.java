
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfServiceLocationOpenCloseDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceLocationOpenCloseDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceLocationOpenCloseDetail" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationOpenCloseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceLocationOpenCloseDetail", propOrder = {
    "serviceLocationOpenCloseDetail"
})
public class ArrayOfServiceLocationOpenCloseDetail {

    @XmlElement(name = "ServiceLocationOpenCloseDetail", nillable = true)
    protected List<ServiceLocationOpenCloseDetail> serviceLocationOpenCloseDetail;

    /**
     * Gets the value of the serviceLocationOpenCloseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocationOpenCloseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocationOpenCloseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocationOpenCloseDetail }
     * 
     * 
     */
    public List<ServiceLocationOpenCloseDetail> getServiceLocationOpenCloseDetail() {
        if (serviceLocationOpenCloseDetail == null) {
            serviceLocationOpenCloseDetail = new ArrayList<ServiceLocationOpenCloseDetail>();
        }
        return this.serviceLocationOpenCloseDetail;
    }

}
