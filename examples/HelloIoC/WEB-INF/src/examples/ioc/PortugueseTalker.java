package examples.ioc;

public class PortugueseTalker implements Talker {
    
    public String saySomething() {
        return "from PortugueseTalker (" + toString() + "): Como vai vc?";
    }
    
}