
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_login;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_services_login package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LicenseComplianceViolationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", "LicenseComplianceViolationInfo");
    private final static QName _LicenseComplianceViolationInfoLastVehicleLicenseViolationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", "LastVehicleLicenseViolationDate");
    private final static QName _LicenseComplianceViolationInfoLicenseComplianceStateVehicleLicenseComplianceState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", "LicenseComplianceState_VehicleLicenseComplianceState");
    private final static QName _LicenseComplianceViolationInfoVehicleLicenseViolationGracePeriodEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", "VehicleLicenseViolationGracePeriodEndDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_services_login
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LicenseComplianceViolationInfo }
     * 
     */
    public LicenseComplianceViolationInfo createLicenseComplianceViolationInfo() {
        return new LicenseComplianceViolationInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseComplianceViolationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", name = "LicenseComplianceViolationInfo")
    public JAXBElement<LicenseComplianceViolationInfo> createLicenseComplianceViolationInfo(LicenseComplianceViolationInfo value) {
        return new JAXBElement<LicenseComplianceViolationInfo>(_LicenseComplianceViolationInfo_QNAME, LicenseComplianceViolationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", name = "LastVehicleLicenseViolationDate", scope = LicenseComplianceViolationInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLicenseComplianceViolationInfoLastVehicleLicenseViolationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicenseComplianceViolationInfoLastVehicleLicenseViolationDate_QNAME, XMLGregorianCalendar.class, LicenseComplianceViolationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", name = "LicenseComplianceState_VehicleLicenseComplianceState", scope = LicenseComplianceViolationInfo.class)
    public JAXBElement<String> createLicenseComplianceViolationInfoLicenseComplianceStateVehicleLicenseComplianceState(String value) {
        return new JAXBElement<String>(_LicenseComplianceViolationInfoLicenseComplianceStateVehicleLicenseComplianceState_QNAME, String.class, LicenseComplianceViolationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", name = "VehicleLicenseViolationGracePeriodEndDate", scope = LicenseComplianceViolationInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLicenseComplianceViolationInfoVehicleLicenseViolationGracePeriodEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicenseComplianceViolationInfoVehicleLicenseViolationGracePeriodEndDate_QNAME, XMLGregorianCalendar.class, LicenseComplianceViolationInfo.class, value);
    }

}
