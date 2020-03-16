
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfServiceTimeUpdateReport.Record complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServiceTimeUpdateReport.Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceTimeUpdateReport.Record" type="{http://roadnet.com/apex/DataContracts/}ServiceTimeUpdateReport.Record" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceTimeUpdateReport.Record", propOrder = {
    "serviceTimeUpdateReportRecord"
})
public class ArrayOfServiceTimeUpdateReportRecord {

    @XmlElement(name = "ServiceTimeUpdateReport.Record", nillable = true)
    protected List<ServiceTimeUpdateReportRecord> serviceTimeUpdateReportRecord;

    /**
     * Gets the value of the serviceTimeUpdateReportRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTimeUpdateReportRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTimeUpdateReportRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTimeUpdateReportRecord }
     * 
     * 
     */
    public List<ServiceTimeUpdateReportRecord> getServiceTimeUpdateReportRecord() {
        if (serviceTimeUpdateReportRecord == null) {
            serviceTimeUpdateReportRecord = new ArrayList<ServiceTimeUpdateReportRecord>();
        }
        return this.serviceTimeUpdateReportRecord;
    }

}
