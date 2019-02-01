package demo.chenj.filterchain;

public class BFilter implements Filter {
    public void doFilter(Request req, Response resp, Filter filterChain) {
        System.out.println("BFilter start");
        filterChain.doFilter(req, resp, filterChain);
        System.out.println("BFilter end");
    }
}
