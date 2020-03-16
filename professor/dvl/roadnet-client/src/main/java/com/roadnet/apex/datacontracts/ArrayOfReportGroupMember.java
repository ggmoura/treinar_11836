
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfReportGroupMember complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReportGroupMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportGroupMember" type="{http://roadnet.com/apex/DataContracts/}ReportGroupMember" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReportGroupMember", propOrder = {
    "reportGroupMember"
})
public class ArrayOfReportGroupMember {

    @XmlElement(name = "ReportGroupMember", nillable = true)
    protected List<ReportGroupMember> reportGroupMember;

    /**
     * Gets the value of the reportGroupMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportGroupMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportGroupMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportGroupMember }
     * 
     * 
     */
    public List<ReportGroupMember> getReportGroupMember() {
        if (reportGroupMember == null) {
            reportGroupMember = new ArrayList<ReportGroupMember>();
        }
        return this.reportGroupMember;
    }

}
