package generators.uigenerator;

import generators.uigenerator.languigen.UIGen1;
import generators.uigenerator.languigen.UIGen2;

public class FactoryUIGenerator {

    public IUIGenerator getUIGen(String pUIGenerator){

        switch (pUIGenerator) {
            case "UIGEN1" -> {
                return new UIGen1();
            }
            case "UIGEN2" -> {
                return new UIGen2();
            }
            default -> {
                System.out.println("The UI Generator doesn't exists.");
                return null;
            }
        }

    }
}
