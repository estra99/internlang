package generators.codegenerator.langcodegenerators;

import generators.codegenerator.codegenInterfaces.IPyCodeGen;
import generators.uigenerator.IUIGenerator;

public class PyCodeGenerator implements IPyCodeGen {

    private IUIGenerator UIGenerator;

    public PyCodeGenerator(IUIGenerator UIGenerator) {
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

        System.out.println("Generating output code to Python");
        convertPyTypes();
        this.UIGenerator.createUI();
    }

    @Override
    public void convertPyTypes() {

        System.out.println("Converting meta types to Python!");
    }
}
