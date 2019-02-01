package demo.chenj.filterchain;

public class AFilter implements Filter {
    public void doFilter(Request req, Response resp, Filter filterChain) {
        System.out.println("AFilter start");
        filterChain.doFilter(req, resp, filterChain);
        System.out.println("AFilter end");
    }
}
