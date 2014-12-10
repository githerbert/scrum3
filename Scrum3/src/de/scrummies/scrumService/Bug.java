
package de.scrummies.scrumService;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bug">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}AbstractWorkItem">
 *       &lt;sequence>
 *         &lt;element name="ClosedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extentions" type="{http://www.fuldaai.de}ArrayOfBugExtention" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.fuldaai.de}BugReason" minOccurs="0"/>
 *         &lt;element name="ResolvedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.fuldaai.de}Severity" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.fuldaai.de}BugState" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bug", namespace = "http://www.fuldaai.de", propOrder = {
    "closedBy",
    "closedDate",
    "content",
    "extentions",
    "reason",
    "resolvedBy",
    "resolvedDate",
    "severity",
    "state",
    "title"
})
public class Bug
    extends AbstractWorkItem
{

	@XmlElementRef(name = "ClosedBy", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> closedBy;
    @XmlElementRef(name = "ClosedDate", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> closedDate;
    @XmlElementRef(name = "Content", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "Extentions", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBugExtention> extentions;
    @XmlElement(name = "Reason")
    protected BugReason reason;
    @XmlElementRef(name = "ResolvedBy", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolvedBy;
    @XmlElementRef(name = "ResolvedDate", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> resolvedDate;
    @XmlElement(name = "Severity")
    protected Severity severity;
    @XmlElement(name = "State")
    protected BugState state;
    @XmlElementRef(name = "Title", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

    /**
     * Gets the value of the closedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClosedBy() {
        return closedBy;
    }

    /**
     * Sets the value of the closedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClosedBy(JAXBElement<String> value) {
        this.closedBy = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setClosedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * Gets the value of the extentions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugExtention }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBugExtention> getExtentions() {
        return extentions;
    }

    /**
     * Sets the value of the extentions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBugExtention }{@code >}
     *     
     */
    public void setExtentions(JAXBElement<ArrayOfBugExtention> value) {
        this.extentions = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BugReason }
     *     
     */
    public BugReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BugReason }
     *     
     */
    public void setReason(BugReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the resolvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolvedBy() {
        return resolvedBy;
    }

    /**
     * Sets the value of the resolvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolvedBy(JAXBElement<String> value) {
        this.resolvedBy = value;
    }

    /**
     * Gets the value of the resolvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getResolvedDate() {
        return resolvedDate;
    }

    /**
     * Sets the value of the resolvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setResolvedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.resolvedDate = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Severity }
     *     
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Severity }
     *     
     */
    public void setSeverity(Severity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BugState }
     *     
     */
    public BugState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BugState }
     *     
     */
    public void setState(BugState value) {
        this.state = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

}
