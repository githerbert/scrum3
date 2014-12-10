
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BugDateRangeFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugDateRangeFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugFilter">
 *       &lt;sequence>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugDateRangeFilter", namespace = "http://www.fuldaai.de", propOrder = {
    "end",
    "start"
})
@XmlSeeAlso({
    BugResolvedDateFilter.class,
    BugClosedDateFilter.class
})
public class BugDateRangeFilter
    extends BugFilter
{

    @XmlElementRef(name = "End", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> end;
    @XmlElementRef(name = "Start", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> start;

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.end = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStart(JAXBElement<XMLGregorianCalendar> value) {
        this.start = value;
    }

}
