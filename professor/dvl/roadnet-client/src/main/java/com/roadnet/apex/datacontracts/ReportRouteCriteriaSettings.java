
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ReportRouteCriteriaSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportRouteCriteriaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Report_ReportApplicableRoutePhaseFlags_ApplicableRoutePhases" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RouteFilters" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReportRouteCriteriaSettingsFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRouteCriteriaSettings", propOrder = {
    "reportReportApplicableRoutePhaseFlagsApplicableRoutePhases",
    "routeFilters"
})
public class ReportRouteCriteriaSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "Report_ReportApplicableRoutePhaseFlags_ApplicableRoutePhases", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportReportApplicableRoutePhaseFlagsApplicableRoutePhases;
    @XmlElementRef(name = "RouteFilters", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReportRouteCriteriaSettingsFilter> routeFilters;

    /**
     * Obtém o valor da propriedade reportReportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportReportApplicableRoutePhaseFlagsApplicableRoutePhases() {
        return reportReportApplicableRoutePhaseFlagsApplicableRoutePhases;
    }

    /**
     * Define o valor da propriedade reportReportApplicableRoutePhaseFlagsApplicableRoutePhases.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportReportApplicableRoutePhaseFlagsApplicableRoutePhases(JAXBElement<String> value) {
        this.reportReportApplicableRoutePhaseFlagsApplicableRoutePhases = value;
    }

    /**
     * Obtém o valor da propriedade routeFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportRouteCriteriaSettingsFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReportRouteCriteriaSettingsFilter> getRouteFilters() {
        return routeFilters;
    }

    /**
     * Define o valor da propriedade routeFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportRouteCriteriaSettingsFilter }{@code >}
     *     
     */
    public void setRouteFilters(JAXBElement<ArrayOfReportRouteCriteriaSettingsFilter> value) {
        this.routeFilters = value;
    }

}
