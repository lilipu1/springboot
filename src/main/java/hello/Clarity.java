package hello;

public class Clarity {
    String grade;
    String p;
    String url;

    public Clarity(String grade,String p,String url){
        this.grade = grade;
        this.p = p;
        this.url = url;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
