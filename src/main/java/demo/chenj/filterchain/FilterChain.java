package demo.chenj.filterchain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain  {

    private List<Filter> filterList = new ArrayList<Filter>();

    private int curPos = 0;

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public void doFilter(Request req, Response resp) {
        if(curPos == filterList.size())
            return;
        else{
            Filter filter = filterList.get(curPos);
            curPos ++;
            filter.doFilter(req, resp, this);
        }


    }
}
