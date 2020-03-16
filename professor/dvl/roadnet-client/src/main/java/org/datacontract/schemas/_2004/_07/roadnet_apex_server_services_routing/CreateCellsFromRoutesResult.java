
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfCell;
import com.roadnet.apex.datacontracts.CellSet;


/**
 * <p>Classe Java de CreateCellsFromRoutesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateCellsFromRoutesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfCreateCellsFromRoutesResult.CreateCellsFromRoutesError" minOccurs="0"/&gt;
 *         &lt;element name="SavedCellSet" type="{http://roadnet.com/apex/DataContracts/}CellSet" minOccurs="0"/&gt;
 *         &lt;element name="SavedCells" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCell" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCellsFromRoutesResult", propOrder = {
    "errors",
    "savedCellSet",
    "savedCells"
})
public class CreateCellsFromRoutesResult {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError> errors;
    @XmlElementRef(name = "SavedCellSet", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CellSet> savedCellSet;
    @XmlElementRef(name = "SavedCells", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCell> savedCells;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfCreateCellsFromRoutesResultCreateCellsFromRoutesError> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade savedCellSet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellSet }{@code >}
     *     
     */
    public JAXBElement<CellSet> getSavedCellSet() {
        return savedCellSet;
    }

    /**
     * Define o valor da propriedade savedCellSet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellSet }{@code >}
     *     
     */
    public void setSavedCellSet(JAXBElement<CellSet> value) {
        this.savedCellSet = value;
    }

    /**
     * Obtém o valor da propriedade savedCells.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCell }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCell> getSavedCells() {
        return savedCells;
    }

    /**
     * Define o valor da propriedade savedCells.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCell }{@code >}
     *     
     */
    public void setSavedCells(JAXBElement<ArrayOfCell> value) {
        this.savedCells = value;
    }

}
