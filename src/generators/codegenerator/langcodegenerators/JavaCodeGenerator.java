package generators.codegenerator.langcodegenerators;

import generators.codegenerator.codegenInterfaces.IJavaCodeGen;
import generators.uigenerator.IUIGenerator;

public class JavaCodeGenerator implements IJavaCodeGen {

    private IUIGenerator UIGenerator;

    public JavaCodeGenerator(IUIGenerator UIGenerator) {
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

        System.out.println("Generating output code to Java");
        makeGetter();
        this.UIGenerator.createUI();
    }

    @Override
    public void makeGetter() {

        System.out.println("Generating the getters in code.");
    }
}
