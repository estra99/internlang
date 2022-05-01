package generators.codegenerator.langcodegenerators;

import generators.codegenerator.codegenInterfaces.ITsCodeGen;
import generators.uigenerator.IUIGenerator;

public class TsCodeGenerator implements ITsCodeGen {

    private IUIGenerator UIGenerator;

    public TsCodeGenerator(IUIGenerator UIGenerator) {
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

        System.out.println("Generating output code to Typescript");
        traspile();
        this.UIGenerator.createUI();
    }

    @Override
    public void traspile() {
        System.out.println("Traspiling code in Typescript");

    }
}
