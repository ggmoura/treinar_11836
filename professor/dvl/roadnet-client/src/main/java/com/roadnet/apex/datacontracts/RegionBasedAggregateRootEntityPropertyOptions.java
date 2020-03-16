
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.FileResultPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.KpiExportJobInfoPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MobileScreenConfigurationPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MobileTextAliasPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.WorkerLogEventPropertyOptions;


/**
 * <p>Classe Java de RegionBasedAggregateRootEntityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionBasedAggregateRootEntityPropertyOptions", propOrder = {
    "regionEntityKey"
})
@XmlSeeAlso({
    RoutePropertyOptions.class,
    TerritoryPropertyOptions.class,
    RouteTemplatePropertyOptions.class,
    PerformanceMonitoringDataPropertyOptions.class,
    CellPropertyOptions.class,
    CellSetPropertyOptions.class,
    SignatureCapturePropertyOptions.class,
    TelematicsPositionPropertyOptions.class,
    CustomFormResponsePropertyOptions.class,
    ServicePatternAnalyzerJobInfoPropertyOptions.class,
    ServicePatternAnalyzerResultPropertyOptions.class,
    ResourceEventSetPropertyOptions.class,
    ScorecardTemplatePropertyOptions.class,
    OrderBasePropertyOptions.class,
    TestRegionBasedObjectPropertyOptions.class,
    PassPropertyOptions.class,
    PassTemplatePropertyOptions.class,
    ResourceExceptionPropertyOptions.class,
    ResourceExceptionRulePropertyOptions.class,
    RouteNotePropertyOptions.class,
    ResourceEventPropertyOptions.class,
    RouteTemplateSetPropertyOptions.class,
    RoutingSessionPropertyOptions.class,
    UnassignedOrderGroupPropertyOptions.class,
    ServiceLocationSubstitutionPropertyOptions.class,
    FileResultPropertyOptions.class,
    KpiExportJobInfoPropertyOptions.class,
    WorkerLogEventPropertyOptions.class,
    MobileTextAliasPropertyOptions.class,
    MobileScreenConfigurationPropertyOptions.class
})
public class RegionBasedAggregateRootEntityPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "RegionEntityKey")
    protected Boolean regionEntityKey;

    /**
     * Obtém o valor da propriedade regionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionEntityKey() {
        return regionEntityKey;
    }

    /**
     * Define o valor da propriedade regionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionEntityKey(Boolean value) {
        this.regionEntityKey = value;
    }

}
