package generators.codegenerator.langcodegenerators;

import generators.codegenerator.codegenInterfaces.ICSharpCodeGen;
import generators.uigenerator.IUIGenerator;

public class CSharpCodeGenerator implements ICSharpCodeGen {

    private IUIGenerator UIGenerator;

    public CSharpCodeGenerator(IUIGenerator UIGenerator) {
        this.UIGenerator = UIGenerator;
    }

    public IUIGenerator getUIGenerator() {
        return UIGenerator;
    }

    public void setUIGenerator(IUIGenerator UIGenerator) {
        this.UIGenerator = UIGenerator;
    }

    @Override
    public void generateCode() {

        System.out.println("Generating output code to C#");
        convertToCSharpTypes();
        this.UIGenerator.createUI();
    }

    @Override
    public void convertToCSharpTypes() {

        System.out.println("Converting to C# DataTypes");
    }
}
