
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImportTestObjectPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportTestObjectPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BoolMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CharMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenOptions" type="{http://roadnet.com/apex/DataContracts/}ImportTestChildObjectPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Contact2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContainedEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DateMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LongMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeOfDayMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpanMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportTestObjectPropertyOptions", propOrder = {
    "age",
    "boolMember",
    "categoryEntityKey",
    "charMember",
    "children",
    "childrenOptions",
    "contact",
    "contact2",
    "containedEntityKey",
    "date",
    "dateMember",
    "dayOfWeekFlagsDeliveryDays",
    "distance",
    "identifier",
    "items",
    "longMember",
    "name",
    "test",
    "timeOfDayMember",
    "timeSpanMember",
    "worldTimeZoneTimeZone"
})
public class ImportTestObjectPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "Age")
    protected Boolean age;
    @XmlElement(name = "BoolMember")
    protected Boolean boolMember;
    @XmlElement(name = "CategoryEntityKey")
    protected Boolean categoryEntityKey;
    @XmlElement(name = "CharMember")
    protected Boolean charMember;
    @XmlElement(name = "Children")
    protected Boolean children;
    @XmlElementRef(name = "ChildrenOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportTestChildObjectPropertyOptions> childrenOptions;
    @XmlElement(name = "Contact")
    protected Boolean contact;
    @XmlElement(name = "Contact2")
    protected Boolean contact2;
    @XmlElement(name = "ContainedEntityKey")
    protected Boolean containedEntityKey;
    @XmlElement(name = "Date")
    protected Boolean date;
    @XmlElement(name = "DateMember")
    protected Boolean dateMember;
    @XmlElement(name = "DayOfWeekFlags_DeliveryDays")
    protected Boolean dayOfWeekFlagsDeliveryDays;
    @XmlElement(name = "Distance")
    protected Boolean distance;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Items")
    protected Boolean items;
    @XmlElement(name = "LongMember")
    protected Boolean longMember;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "Test")
    protected Boolean test;
    @XmlElement(name = "TimeOfDayMember")
    protected Boolean timeOfDayMember;
    @XmlElement(name = "TimeSpanMember")
    protected Boolean timeSpanMember;
    @XmlElement(name = "WorldTimeZone_TimeZone")
    protected Boolean worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAge(Boolean value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade boolMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolMember() {
        return boolMember;
    }

    /**
     * Define o valor da propriedade boolMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolMember(Boolean value) {
        this.boolMember = value;
    }

    /**
     * Obtém o valor da propriedade categoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoryEntityKey() {
        return categoryEntityKey;
    }

    /**
     * Define o valor da propriedade categoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryEntityKey(Boolean value) {
        this.categoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade charMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharMember() {
        return charMember;
    }

    /**
     * Define o valor da propriedade charMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharMember(Boolean value) {
        this.charMember = value;
    }

    /**
     * Obtém o valor da propriedade children.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildren() {
        return children;
    }

    /**
     * Define o valor da propriedade children.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildren(Boolean value) {
        this.children = value;
    }

    /**
     * Obtém o valor da propriedade childrenOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportTestChildObjectPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ImportTestChildObjectPropertyOptions> getChildrenOptions() {
        return childrenOptions;
    }

    /**
     * Define o valor da propriedade childrenOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportTestChildObjectPropertyOptions }{@code >}
     *     
     */
    public void setChildrenOptions(JAXBElement<ImportTestChildObjectPropertyOptions> value) {
        this.childrenOptions = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade contact2.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContact2() {
        return contact2;
    }

    /**
     * Define o valor da propriedade contact2.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact2(Boolean value) {
        this.contact2 = value;
    }

    /**
     * Obtém o valor da propriedade containedEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainedEntityKey() {
        return containedEntityKey;
    }

    /**
     * Define o valor da propriedade containedEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainedEntityKey(Boolean value) {
        this.containedEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDate(Boolean value) {
        this.date = value;
    }

    /**
     * Obtém o valor da propriedade dateMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateMember() {
        return dateMember;
    }

    /**
     * Define o valor da propriedade dateMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateMember(Boolean value) {
        this.dateMember = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayOfWeekFlagsDeliveryDays() {
        return dayOfWeekFlagsDeliveryDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsDeliveryDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayOfWeekFlagsDeliveryDays(Boolean value) {
        this.dayOfWeekFlagsDeliveryDays = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistance(Boolean value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItems(Boolean value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade longMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLongMember() {
        return longMember;
    }

    /**
     * Define o valor da propriedade longMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongMember(Boolean value) {
        this.longMember = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade test.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Define o valor da propriedade test.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    /**
     * Obtém o valor da propriedade timeOfDayMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeOfDayMember() {
        return timeOfDayMember;
    }

    /**
     * Define o valor da propriedade timeOfDayMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeOfDayMember(Boolean value) {
        this.timeOfDayMember = value;
    }

    /**
     * Obtém o valor da propriedade timeSpanMember.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeSpanMember() {
        return timeSpanMember;
    }

    /**
     * Define o valor da propriedade timeSpanMember.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSpanMember(Boolean value) {
        this.timeSpanMember = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorldTimeZoneTimeZone(Boolean value) {
        this.worldTimeZoneTimeZone = value;
    }

}
