
package de.scrummies.scrumService;

import java.io.Serializable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserStory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}AbstractWorkItem">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extentions" type="{http://www.fuldaai.de}ArrayOfUserStoryExtention" minOccurs="0"/>
 *         &lt;element name="Prio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SprintId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.fuldaai.de}UserStoryState" minOccurs="0"/>
 *         &lt;element name="StoryPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "UserStory", namespace = "http://www.fuldaai.de", propOrder = {
    "content",
    "extentions",
    "prio",
    "sprintId",
    "state",
    "storyPoints",
    "title"
})
public class UserStory
    extends AbstractWorkItem
{
	
	@XmlElementRef(name = "Content", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "Extentions", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserStoryExtention> extentions;
    @XmlElement(name = "Prio")
    protected Integer prio;
    @XmlElementRef(name = "SprintId", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sprintId;
    @XmlElement(name = "State")
    protected UserStoryState state;
    @XmlElementRef(name = "StoryPoints", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> storyPoints;
    @XmlElementRef(name = "Title", namespace = "http://www.fuldaai.de", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;

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
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStoryExtention }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserStoryExtention> getExtentions() {
        return extentions;
    }

    /**
     * Sets the value of the extentions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStoryExtention }{@code >}
     *     
     */
    public void setExtentions(JAXBElement<ArrayOfUserStoryExtention> value) {
        this.extentions = value;
    }

    /**
     * Gets the value of the prio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrio() {
        return prio;
    }

    /**
     * Sets the value of the prio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrio(Integer value) {
        this.prio = value;
    }

    /**
     * Gets the value of the sprintId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSprintId() {
        return sprintId;
    }

    /**
     * Sets the value of the sprintId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSprintId(JAXBElement<String> value) {
        this.sprintId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link UserStoryState }
     *     
     */
    public UserStoryState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStoryState }
     *     
     */
    public void setState(UserStoryState value) {
        this.state = value;
    }

    /**
     * Gets the value of the storyPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStoryPoints() {
        return storyPoints;
    }

    /**
     * Sets the value of the storyPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStoryPoints(JAXBElement<Integer> value) {
        this.storyPoints = value;
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
