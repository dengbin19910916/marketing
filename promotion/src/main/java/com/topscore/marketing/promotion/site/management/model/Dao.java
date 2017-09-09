package com.topscore.marketing.promotion.site.management.model;

public interface Dao<T> {

    T toDto();

    default <E> T getBean(E e, Class<T> t) {
        try {
            Class<?> obj = t.getClass().newInstance();

        } catch (InstantiationException | IllegalAccessException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}
