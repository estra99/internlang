public class InternLangScript {
    private String Name;
    private String Info;
    private String Content;

    public InternLangScript(String pName, String pInfo, String pContent){
        this.Name = pName;
        this.Info = pInfo;
        this.Content = pContent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
