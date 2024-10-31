package examples.ioc;

public class UnpoliteTalker implements Talker {
    
    private String name;
    
    public UnpoliteTalker(String name) {
        this.name = name;
    }
    
    public String saySomething() {
        return "from " + name + " (" + toString() + "): Hello you #$#((%$#!";
    }
    
}