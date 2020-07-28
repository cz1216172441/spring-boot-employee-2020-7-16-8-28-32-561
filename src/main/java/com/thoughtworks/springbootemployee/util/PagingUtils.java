package com.thoughtworks.springbootemployee.util;

import java.util.List;
import java.util.stream.Collectors;

public class PagingUtils {

    public static<T> List<T> paging(List<T> list, Integer page, Integer pageSize) {
        if (page < 1 || pageSize < 0) {
            page = 1;
            pageSize = 0;
        }
        return list.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

}
