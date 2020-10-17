package basics;

import org.w3c.dom.css.CSSStyleDeclaration;

import javax.xml.namespace.QName;

public class VarScope {
    //Field Scope (VarOne)
    //Local Scope (name)
    //Local Scope (varTwo)
    //Local Scope (varFour)
    //Local Scope (varThree)


    static String varOne = "varOne";

    public static void main(String[] args) {

        String name = "name";

        if (true) {
            System.out.println(name);
            String varTwo = "varTwo";
            System.out.println(varTwo);
            if (true) {
                String varFour = "varFour";
            }
        } else if (true) {
            String varThree = "varThree";
        }

        String name1 = "hektor";
    }
}
