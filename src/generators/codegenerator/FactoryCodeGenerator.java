package generators.codegenerator;

import generators.codegenerator.langcodegenerators.CSharpCodeGenerator;
import generators.codegenerator.langcodegenerators.JavaCodeGenerator;
import generators.codegenerator.langcodegenerators.PyCodeGenerator;
import generators.codegenerator.langcodegenerators.TsCodeGenerator;
import generators.uigenerator.FactoryUIGenerator;
import generators.uigenerator.IUIGenerator;

public class FactoryCodeGenerator {

    private final FactoryUIGenerator UIGenerator;

    public FactoryCodeGenerator() {
        this.UIGenerator = new FactoryUIGenerator();
    }

    public FactoryUIGenerator getUIGenerator() {
        return UIGenerator;
    }

    public ICodeGenerator getCodeGenerator(String pLang, String pUi ) {

        IUIGenerator uiGenerator = this.UIGenerator.getUIGen(pUi);

        switch (pLang) {
            case "PYTHON" -> {
                return new PyCodeGenerator(uiGenerator);
            }
            case "JAVA" -> {
                return new JavaCodeGenerator(uiGenerator);
            }
            case "TYPESCRIPT" -> {
                return new TsCodeGenerator(uiGenerator);
            }
            case "CSHARP" -> {
                return new CSharpCodeGenerator(uiGenerator);
            }
            default -> {
                System.out.println("The language doesn't match any code generator.");
                return null;
            }

        }
    }

}
