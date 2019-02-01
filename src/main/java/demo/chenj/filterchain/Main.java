package demo.chenj.filterchain;

public class Main {

    public static void main(String[] args){
        Request req = new Request("asdfasl;jdf;lasjkfl;sajfsjfsjfsa;f");
        Response resp = new Response("lasjfsjkdfjas;dfjk;asdkf");

        FilterChain chain = new FilterChain();
        chain.addFilter(new AFilter());
        chain.addFilter(new BFilter());

        chain.doFilter(req, resp);

//        int i = 0;
//        i++;
//        System.out.println(i);
    }
}
