
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfReportRouteCriteriaSettingsFilter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReportRouteCriteriaSettingsFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportRouteCriteriaSettingsFilter" type="{http://roadnet.com/apex/DataContracts/}ReportRouteCriteriaSettingsFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReportRouteCriteriaSettingsFilter", propOrder = {
    "reportRouteCriteriaSettingsFilter"
})
public class ArrayOfReportRouteCriteriaSettingsFilter {

    @XmlElement(name = "ReportRouteCriteriaSettingsFilter", nillable = true)
    protected List<ReportRouteCriteriaSettingsFilter> reportRouteCriteriaSettingsFilter;

    /**
     * Gets the value of the reportRouteCriteriaSettingsFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportRouteCriteriaSettingsFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportRouteCriteriaSettingsFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportRouteCriteriaSettingsFilter }
     * 
     * 
     */
    public List<ReportRouteCriteriaSettingsFilter> getReportRouteCriteriaSettingsFilter() {
        if (reportRouteCriteriaSettingsFilter == null) {
            reportRouteCriteriaSettingsFilter = new ArrayList<ReportRouteCriteriaSettingsFilter>();
        }
        return this.reportRouteCriteriaSettingsFilter;
    }

}
