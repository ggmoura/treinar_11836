
package org.datacontract.schemas._2004._07.roadnet_apex_server_core;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.roadnet_apex_server_core package. 
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

    private final static QName _ArrayOfRolePermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", "ArrayOfRole.Permission");
    private final static QName _RolePermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", "Role.Permission");
    private final static QName _ExportPlanningSolutionPropertyResultErrorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", "ExportPlanningSolutionPropertyResult.ErrorType");
    private final static QName _RouteTenderRouteTenderState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", "RouteTender.RouteTenderState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.roadnet_apex_server_core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRolePermission }
     * 
     */
    public ArrayOfRolePermission createArrayOfRolePermission() {
        return new ArrayOfRolePermission();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolePermission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", name = "ArrayOfRole.Permission")
    public JAXBElement<ArrayOfRolePermission> createArrayOfRolePermission(ArrayOfRolePermission value) {
        return new JAXBElement<ArrayOfRolePermission>(_ArrayOfRolePermission_QNAME, ArrayOfRolePermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", name = "Role.Permission")
    public JAXBElement<List<String>> createRolePermission(List<String> value) {
        return new JAXBElement<List<String>>(_RolePermission_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportPlanningSolutionPropertyResultErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", name = "ExportPlanningSolutionPropertyResult.ErrorType")
    public JAXBElement<ExportPlanningSolutionPropertyResultErrorType> createExportPlanningSolutionPropertyResultErrorType(ExportPlanningSolutionPropertyResultErrorType value) {
        return new JAXBElement<ExportPlanningSolutionPropertyResultErrorType>(_ExportPlanningSolutionPropertyResultErrorType_QNAME, ExportPlanningSolutionPropertyResultErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTenderRouteTenderState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", name = "RouteTender.RouteTenderState")
    public JAXBElement<RouteTenderRouteTenderState> createRouteTenderRouteTenderState(RouteTenderRouteTenderState value) {
        return new JAXBElement<RouteTenderRouteTenderState>(_RouteTenderRouteTenderState_QNAME, RouteTenderRouteTenderState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", name = "Role.Permission", scope = ArrayOfRolePermission.class)
    public JAXBElement<List<String>> createArrayOfRolePermissionRolePermission(List<String> value) {
        return new JAXBElement<List<String>>(_RolePermission_QNAME, ((Class) List.class), ArrayOfRolePermission.class, ((List<String> ) value));
    }

}
