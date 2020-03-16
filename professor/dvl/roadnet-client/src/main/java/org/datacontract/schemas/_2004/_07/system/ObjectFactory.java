
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system package. 
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

    private final static QName _ArrayOfDictionaryEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections", "ArrayOfDictionaryEntry");
    private final static QName _DictionaryEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections", "DictionaryEntry");
    private final static QName _ArrayOfNullableOflong_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOflong");
    private final static QName _ArrayOfNullableOfduration_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ArrayOfNullableOfduration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDictionaryEntry }
     * 
     */
    public ArrayOfDictionaryEntry createArrayOfDictionaryEntry() {
        return new ArrayOfDictionaryEntry();
    }

    /**
     * Create an instance of {@link DictionaryEntry }
     * 
     */
    public DictionaryEntry createDictionaryEntry() {
        return new DictionaryEntry();
    }

    /**
     * Create an instance of {@link ArrayOfNullableOflong }
     * 
     */
    public ArrayOfNullableOflong createArrayOfNullableOflong() {
        return new ArrayOfNullableOflong();
    }

    /**
     * Create an instance of {@link ArrayOfNullableOfduration }
     * 
     */
    public ArrayOfNullableOfduration createArrayOfNullableOfduration() {
        return new ArrayOfNullableOfduration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections", name = "ArrayOfDictionaryEntry")
    public JAXBElement<ArrayOfDictionaryEntry> createArrayOfDictionaryEntry(ArrayOfDictionaryEntry value) {
        return new JAXBElement<ArrayOfDictionaryEntry>(_ArrayOfDictionaryEntry_QNAME, ArrayOfDictionaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections", name = "DictionaryEntry")
    public JAXBElement<DictionaryEntry> createDictionaryEntry(DictionaryEntry value) {
        return new JAXBElement<DictionaryEntry>(_DictionaryEntry_QNAME, DictionaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ArrayOfNullableOflong")
    public JAXBElement<ArrayOfNullableOflong> createArrayOfNullableOflong(ArrayOfNullableOflong value) {
        return new JAXBElement<ArrayOfNullableOflong>(_ArrayOfNullableOflong_QNAME, ArrayOfNullableOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNullableOfduration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ArrayOfNullableOfduration")
    public JAXBElement<ArrayOfNullableOfduration> createArrayOfNullableOfduration(ArrayOfNullableOfduration value) {
        return new JAXBElement<ArrayOfNullableOfduration>(_ArrayOfNullableOfduration_QNAME, ArrayOfNullableOfduration.class, null, value);
    }

}
