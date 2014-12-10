
package de.scrummies.scrumService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BugReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefinied"/>
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="AsDesigned"/>
 *     &lt;enumeration value="CannotReproduce"/>
 *     &lt;enumeration value="WantFix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BugReason", namespace = "http://www.fuldaai.de")
@XmlEnum
public enum BugReason {

    @XmlEnumValue("Undefinied")
    UNDEFINIED("Undefinied"),
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("AsDesigned")
    AS_DESIGNED("AsDesigned"),
    @XmlEnumValue("CannotReproduce")
    CANNOT_REPRODUCE("CannotReproduce"),
    @XmlEnumValue("WantFix")
    WANT_FIX("WantFix");
    private final String value;

    BugReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BugReason fromValue(String v) {
        for (BugReason c: BugReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
