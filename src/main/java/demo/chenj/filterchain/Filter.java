package demo.chenj.filterchain;

public interface Filter {

    public void doFilter(Request req, Response resp, FilterChain chain);
}
