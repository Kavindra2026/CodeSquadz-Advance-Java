package Spring;



public class Emp {
    private String name ;

    public void getName() {
        System.out.println("Your name : "+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  init(){

        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
