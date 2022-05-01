import generators.codegenerator.FactoryCodeGenerator;
import generators.codegenerator.ICodeGenerator;

public class CompilerInternlang {

    private final FactoryCodeGenerator CodeGen;

    private InternLangScript Script;

    public CompilerInternlang(InternLangScript pScript) {
        this.CodeGen = new FactoryCodeGenerator();
        this.Script = pScript;
    }

    public FactoryCodeGenerator getCodeGen() {
        return CodeGen;
    }

    public InternLangScript getScript() {
        return Script;
    }

    public void setScript(InternLangScript script) {
        Script = script;
    }

    public void createCode(String pLang, String pUi){

        ICodeGenerator codeGenerator = CodeGen.getCodeGenerator(pLang, pUi);
        if (codeGenerator == null) {
            System.out.println("An error occurred please check the params, language or UI not supported");
            return;
        }
        System.out.println("The script " + this.Script.getName() + " will be converted!");
        codeGenerator.generateCode();
    }
}
