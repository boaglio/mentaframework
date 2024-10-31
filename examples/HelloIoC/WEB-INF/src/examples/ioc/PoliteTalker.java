package examples.ioc;

public class PoliteTalker implements Talker {
    
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String saySomething() {
        return "from " + name + " (" + toString() + "): Hello Sir!";
    }
    
}