package com.thoughtworks.springbootemployee.util;

import java.util.List;
import java.util.stream.Collectors;

public class PagingUtils {

    public static boolean isPagingParamsValid(Integer page, Integer pageSize) {
        return page >= 1 && pageSize >= 0;
    }

    public static<T> List<T> paging(List<T> list, Integer page, Integer pageSize) {
        return list.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
    }

}
