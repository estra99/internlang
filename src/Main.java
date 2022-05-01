public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Interlang Metalanguage!");
        InternLangScript script = new InternLangScript("TestScript", "Version 1.0", "Hello World!");
        CompilerInternlang compilerInternlang = new CompilerInternlang(script);
        // Supported langs: PYTHON, JAVA, TYPESCRIPT, CSHARP
        // Supported UI: UIGEN1, UIGEN2
        compilerInternlang.createCode("PYTHON", "UIGEN2");

    }
}
